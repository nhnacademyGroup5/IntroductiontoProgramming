package Unit9;

public class Base {
    public Base() {
        infob = "I am an object of the Base class";
    }

    public String getInfo() {
        return infob;
    }

    private String infob;

    public static class Derived extends Base {
        public Derived() {
            super();
            infod = "I am an object of the Derived class";
        }

        public String getInfo() {
            return infod + ", " + super.getInfo();
        }

        private String infod;
    }


}
