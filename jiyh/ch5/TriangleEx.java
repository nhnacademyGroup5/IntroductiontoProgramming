package ch5;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle angle = new Triangle(5, 4, 3);

        System.out.println("Longest : " + angle.getLongest());
        System.out.println("Intermediate : "+angle.getIntermediate());
        System.out.println("shortest : " + angle.getshortest());

        // 삼각형이 될 수있는 조건?

        //둘레
        System.out.println("\nperimeter : " + angle.perimeter());

        //넓이
        System.out.println("\narea : " + angle.area());

        // 유형
        System.out.println(angle.getCheck());
    }
}
