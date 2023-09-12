public class ji {
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder();

        sb2 = sb1;
        System.out.println(sb1);
        System.out.println(sb2);
    }

    static void first(){
        String str = "12345";

        System.out.println(str);
        System.out.println(str.charAt(0) + " " + str.charAt(str.length()-1));
    }
}