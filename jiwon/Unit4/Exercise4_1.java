package Unit4;

public class Exercise4_1 {
    public static double convertLireEuro(int x) {
        double Eur = x * 0.034;
        return Eur;

    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(1000));
    }
}
