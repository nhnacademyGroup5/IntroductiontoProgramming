package jinwoo.unit11;

public class ListNode {
    String info;
    ListNode next;

    public ListNode(String info, ListNode next) {
        this.info = info;
        this.next = next;
    }

    public ListNode copy(){
        ListNode copy = new ListNode(this.info, this.next);
        return copy;
    }

    public int length(){
        int count = 1;
        ListNode copy = this.copy();
        while(copy.next != null){
            count++;
            copy = copy.next;
        }
        return count;
    }


    public ListNode findNode(String input){
        ListNode tmp = this.copy();
        while(tmp.info != input){
            tmp = tmp.next;
        }
     
        return tmp;
    }

    public ListNode insertBefore(String info, String given){
        ListNode insert = new ListNode(given, null);
        ListNode searchNode = findNode(info);
        insert.next = searchNode;
        this.next = insert;
        return this;
    }

    public ListNode insertAfter(String info, String given){
        ListNode insert = new ListNode(given, null);
        ListNode searchNode = findNode(info);
        insert.next = searchNode.next;
        searchNode.next = insert;
        this.next = searchNode;
        return this;
    }

    public ListNode modify(String old, String modified){
        ListNode searchNode = findNode(old);
        searchNode.info = modified;
        this.next = searchNode;
        return this;
    }

    // public static ListNode modifyAll(ListNode list, String old, String modified){
    //     ListNode copy = copy(list);
    // }

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

    public boolean searchSequence(ListNode list){
        ListNode set = this.findNode(list.info);
        for (int i = 0; i < list.length(); i++) {
            if(set.info != list.info || set.next != list.next){
                return false;
            } else {
                set = set.next;
                list = list.next;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.info).append(" -> ");
        ListNode tmp = this.next;
        while(tmp != null){
            sb.append(tmp.info).append(" -> ");
            tmp = tmp.next;
        }

        sb.delete(sb.length() -3, sb.length() -1);

        return sb.toString();
    }
}