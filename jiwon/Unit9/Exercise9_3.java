package Unit9;

import static Unit9.Base.Derived;

public class Exercise9_3 {
    public static void main(String[] args) {
//runtime error
        // Derived -> static 으로 변경
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}
