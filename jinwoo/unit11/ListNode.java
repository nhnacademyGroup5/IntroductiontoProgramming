package jinwoo.unit11;

public class ListNode {
    String info;
    ListNode next;

    public ListNode(String info) {
        this.info = info;
        this.next = null;
    }

    public ListNode(String info, ListNode next) {
        this.info = info;
        this.next = next;
    }

    public ListNode add(String input){
        ListNode newList = new ListNode(input);
        if(this.next == null) {
            this.next = newList;
        } else{
            ListNode tmp = this.findLastNode();
            tmp.next = newList;
        }
        return this;
    }

    // 맨 앞에 값 삭제 안됨
    public ListNode delete(String input){
        ListNode findList = findNode(input);
        ListNode tmp = this;
        while(tmp.next != findList){
            tmp = tmp.next;
        }
        tmp.next = findList.next;
        return this;
    }

    public int length(){
        if(this.next == null) return 1;
        return length(this.next, 1);
    }

    private int length(ListNode list, int count){
        if(list.next == null) return ++count;
        count++;
        return length(list.next, count);
    }

    public ListNode findNode(String input){
        if(this.info.equals(input)) return this;
        return findNode(this.next, input);
    }

    private ListNode findNode(ListNode list, String input){
        try {
            if(list.info.equals(input)) return list;
            if(list.next == null) throw new IllegalArgumentException("찾는 값이 없습니다.");
            return findNode(list.next, input); 
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public ListNode findLastNode(){
        ListNode tmp = this;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp;
    }

    // 맨앞에 추가하는 것 구현 x
    public ListNode insertBefore(String info, String given){
        ListNode newList = new ListNode(given);
        ListNode searchNode = this.findNode(info);
        newList.next = searchNode;
        ListNode tmp = this;
        if(tmp.next == null){
            tmp = newList;
        } else {
            while(tmp.next != searchNode){
                tmp = tmp.next;
            }
            tmp.next = newList;
        }
        return tmp;
    }

    public ListNode insertAfter(String info, String given){
        ListNode newList = new ListNode(given);
        ListNode searchNode = this.findNode(info);
        newList.next = searchNode.next;
        searchNode.next = newList;
        return this;
    }

    public ListNode modify(String old, String modified){
        try {
            ListNode searchNode = findNode(old);
            searchNode.info = modified;
            return this;
        } catch (NullPointerException e) {
            System.out.println("변경할 값이 없습니다.");
            return null;
        }
    }

    public ListNode modifyAll(String old, String modified){
        if(this.findNode(old) == null) return this;
        return modifyAll(this.modify(old, modified), old, modified);
    }

    private ListNode modifyAll(ListNode list, String old, String modified){
        if(list.findNode(old) == null) return list;
        return modifyAll(list.modify(old, modified), old, modified);
    }

    public ListNode copy(){
        ListNode copied = new ListNode(this.info);
        ListNode tmp = this;
        if(tmp.next == null) return copied;
        tmp = this.next;
        return copy(tmp, copied);
    }

    private ListNode copy(ListNode origin, ListNode copied){
        if(origin.next == null) return copied.add(origin.info);
        copied.add(origin.info);
        origin = origin.next;
        return copy(origin, copied);
    }

    public ListNode invert(){
        ListNode tmp = this.copy();
        String[] infoArr = new String[this.length() - 1];
        for (int i = 0; i < infoArr.length; i++) {
            infoArr[i] = tmp.info;
            tmp = tmp.next;
        }
        ListNode reverse = new ListNode(infoArr[0], null);
        for (int i = 1; i < infoArr.length; i++) {
            reverse = new ListNode(infoArr[i], reverse);
        }
        tmp.next = reverse;
        return tmp;
    }

    public ListNode deleteSequence(ListNode list){
        // if(!this.searchSequence(list)) throw new IllegalArgumentException("일치하는 List가 없습니다.");
        if(list.next != null) {
            this.delete(list.info);
            return deleteSequence(list.next);
        }
        return delete(list.info);
    }

    public boolean searchSequence(ListNode list){
        if(list.next == null) return this.info.equals(list.info);
        ListNode set = this.findNode(list.info);
        if(set.info.equals(list.info))
            return searchSequence(set.next, list.next);
        return false;
    }

    private boolean searchSequence(ListNode left, ListNode right){
        if(right.next == null) return left.info.equals(right.info);
        if(left.info.equals(right.info))
            return searchSequence(left.next, right.next);
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode tmp = this;
        while(tmp.next != null){
            sb.append(tmp.info).append(" -> ");
            tmp = tmp.next;
        }
        sb.append(tmp.info);
        return sb.toString();
    }
}