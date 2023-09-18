package ch2;
public class ch2{
    public static void main(String[] args) {
        pratice1();
        pratice4("abcdefg");
        pratice5("abcdefg");
    }

    static void pratice1(){
        String str = "jiyh";

        System.out.println(str.charAt(0) + " " +str.charAt(str.length()-1));
    }

    static void pratice4(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }

    static void pratice5(String str){
        StringBuffer sb = new StringBuffer();

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }
}