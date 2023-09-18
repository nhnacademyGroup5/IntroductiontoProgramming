public class Main{
    public static void main(String[] args) {
        

        String str[] = {
            "1234",
            "2345",
            "3456"
        };

        reverseLine(str, 0);
    }

    static void reverseLine(String[] str, int idx){
        if(str.length == idx) return;

        reverseLine(str, idx+1);
        System.out.println(str[idx]);
    }

}