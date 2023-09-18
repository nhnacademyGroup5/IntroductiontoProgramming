package jinwoo.unit5;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(yesOrNo("abcda"));
        System.out.println(yesOrNo("fbcda"));
        System.out.println(yesOrNo("abcde"));
        System.out.println(yesOrNo("bbcde"));
        System.out.println(yesOrNo("abcdf"));
        System.out.println(yesOrNo("bbcdf"));
    }

    public static String yesOrNo(String input){
        StringBuilder sb = new StringBuilder();
        if(!input.startsWith("a") && !input.startsWith("i") && !input.startsWith("u") && !input.startsWith("o") && !input.startsWith("e")) sb.append("MAYBE ");
        if(input.endsWith("a") || input.endsWith("i") || input.endsWith("u")){
            sb.append("YES");
        } else if (input.endsWith("o") || input.endsWith("e")) {
            sb.append("NO");
        } else {
            sb.append("DON'T KNOW");
        }
        return sb.toString();
    }
}
