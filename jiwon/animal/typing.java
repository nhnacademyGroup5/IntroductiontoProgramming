package animal;

public class typing {
      public static void main(String[] args) {
        animal bat = new bat();
        animal sparrow = new sparrow();
        animal penguin = new Penguin();
        animal chick = new chick();
        printFlightAbility(bat);
        printFlightAbility(sparrow);
        printFlightAbility(penguin);
        printFlightAbility(chick);
    }

    public static void printFlightAbility(animal animal) {
        System.out.println(animal.type() + (animal.fly() ? "는(은) 날 수 있어." : "는(은) 못날아.")+ animal.type()+(animal.swim() ? "는 수영할 수 있어" : "는 수영 못해"));
    }   
}

