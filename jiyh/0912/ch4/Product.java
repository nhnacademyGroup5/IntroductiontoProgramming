package ch4;

public class Product {

    private String init;
    private int pieces = 0;
    
    Product(String init){
        this.init = init;
    }

    public void downLoad(int x){
        this.pieces += x;
    }

    public void upLoad(int x){
        this.pieces -= x;
    }

    public int getPiecse(){
        return this.pieces;
    }

    public String toString(){
        return init + ", " + pieces + " pieces" ;
    }
}
