package ch11;

public class Main {

    public static void main(String[] args) {
        
        Node n = null;

        n = StringList.insertAfter(n, "1", "1");
        n = StringList.insertAfter(n, "2", "1");
        n = StringList.insertAfter(n, "3", "2");
        n = StringList.insertAfter(n, "6", "2");
        n = StringList.insertAfter(n, "2", "6");


        System.out.println("List size() : " + StringList.length(n));


        System.out.println("modify before");
        StringList.print(n);
        System.out.println("modify after");
        // n = StringList.modify(n, "2", "7");
        n = StringList.modifyAll(n, "2", "7");
        StringList.print(n);

        System.out.println("copy");
        Node copy = StringList.copy(n);
        StringList.print(copy);

        System.out.println("invert");
        n = StringList.invert(n);
        StringList.print(n);
    }

}