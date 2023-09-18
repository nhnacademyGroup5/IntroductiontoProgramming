package ch11;

public class Main {

    public static void main(String[] args) {
        
        Node n = null;

        n = StringList.insertAfter(n, "1", "1");
        n = StringList.insertAfter(n, "2", "2");
        n = StringList.insertAfter(n, "3", "3");
        System.out.println(n.info + " " + n.next);

    }

}