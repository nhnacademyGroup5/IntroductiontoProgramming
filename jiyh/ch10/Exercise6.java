public class Exercise6 {


    public static void main(String[] args) {
        
        String str = "asccccccssawcxcccccccccccc";
        System.out.println(maximumCount(str, 'c', 0, 0, 0));
    }

    static int maximumCount(String s, char c, int cnt, int length, int maxLen){
        if(s.length() == cnt) return maxLen;

        // 기존코드에서 필요이상의 loop가 도는 것 같아 재작성
        maxLen = Math.max(length, maxLen);
        if(s.charAt(cnt) == c) return maximumCount(s, c, cnt+1, length+1, maxLen);
        return maximumCount(s, c, cnt+1, 0, maxLen);
    }

}
