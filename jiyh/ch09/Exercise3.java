package ch09;

public class Exercise3 {
    
    //runtime error
    // 1. Driver.getinfo()에서 Base.getinfo()를 추가하여 Base info, Derived info모두 출력
    // 2. b = d에서 casting이 진행되어 getinfo() method가 재정의 되어 출력
    
    public static void main(String[] args) {

        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getinfo() + "\n" + d.getinfo());

        b = d;
        System.out.println(b.getinfo());

    }
}
