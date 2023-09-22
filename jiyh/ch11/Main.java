package ch11;


public class Main {

    public static void main(String[] args) {
        
        Node n = null;

        n = StringList.insertAfter(n, "1", "1");
        n = StringList.insertAfter(n, "1", "2");
        n = StringList.insertAfter(n, "2", "3");
        n = StringList.insertAfter(n, "3", "4");
        System.out.println(StringList.length(n));
        StringList.print(n);

        // System.out.println("-----------------");
        // n = StringList.modify(n, "2", "4");
        // StringList.print(n);

        System.out.println("===============");
        n = StringList.insertBefore(n, "2", "4");
        StringList.print(n);


        System.out.println("--------------------");
        Node copy = StringList.copy(n);
        StringList.print(copy);

        System.out.println("invert--------------------");
        n = StringList.invert(n);
        StringList.print(n);
        System.out.println(StringList.toString(n));

        System.out.println("--------------------");
        n = StringList.deleteDoubles(n);
        StringList.print(n);

        System.out.println(StringList.toString(n));
    }

}