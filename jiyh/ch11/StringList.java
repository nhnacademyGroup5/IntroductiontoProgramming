package ch11;

import java.io.FileWriter;

public class StringList {
    
    public static boolean isEmpty(Node node){
        if(node == null) return true;

        return false;
    }

    public static int length(Node node){
        if(node == null) return 0;

        return 1 + length(node.next);
    }

    public static Node insertAfter(Node node, String value, String given){
        Node n = new Node();
        n.info = value;

        if(isEmpty(node)) {
            return n;
        }
        if(node.info.equals(given)) {
            n.next = node.next;
            node.next = n;
            return node;
        }  

        node.next = insertAfter(node.next, value, given);
        return node;
    }

    public static Node modify(Node node, String oldValue, String newValue){

        if(isEmpty(node)){
            return node;
        }

        if(node.info.equals(oldValue)){
            node.info = newValue;
            return node;
        }

        node.next = modify(node.next, oldValue, newValue);
        return node;
    }
    public static Node modifyAll(Node node, String oldValue, String newValue){

        if(isEmpty(node)){
            return node;
        }

        if(node.info.equals(oldValue)){
            node.info = newValue;
        }

        node.next = modifyAll(node.next, oldValue, newValue);
        return node;
    }

    public static void print(Node node){
        if(isEmpty(node)) return;

        System.out.println(node.info);
        print(node.next);
    }

    public static Node copy(Node node){
        Node copy = new Node();
        if(isEmpty(node)) return copy;

        copy.info = node.info;
        node = node.next;

        while(!isEmpty(node)){
            Node copyNode = new Node();
            copyNode.info = node.info;
            copyNode.next = copy.next;
            copy.next = copyNode;

            node = node.next;
            FileWriter n = new FileWriter("sdsd");
            n.
        }
        return copy;
    }

    public static Node invert(Node node){
        
        if(isEmpty(node)) {
            node.next = node;
            return node;
        }
        System.out.println(node.info);
        node.next = invert(node.next);

        node.next = node;

        return node;
    }
}
