package ch09;




public class Derived extends Base{
    
    private String infod;

    public Derived(){
        super();
        infod = "I am an object of the Derived class";
    }

    public String getinfo(){
        return infod + ", " + super.getinfo();
    }
}

class Base{

    private String info;

    Base(){
        info = "I am an object of the Base class";
    }

    public String getinfo(){
        return info;
    }
}
