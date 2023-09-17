public class Exercise6 {

    private static int maxlen = 0;

    public static void main(String[] args) {
        
        String str = "asccccccssawcxcccc";

        maximumCount(str, 'c', 0);
        System.out.println(maxlen);
    }

    static void maximumCount(String s, char c, int cnt){
        if(s.length() == 0) {
            maxlen = Math.max(maxlen, cnt);
            return;
        }

        if(s.charAt(0) == c){
            maximumCount(s.substring(1), c, cnt+1);
            return;
        }

        maxlen = Math.max(maxlen, cnt);
        maximumCount(s.substring(1), c, 0);
        
    }

}
