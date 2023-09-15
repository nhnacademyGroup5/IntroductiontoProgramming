package jinwoo.unit2;

// Exercise 2.1. Write a Java program that creates an object of type String representing your name, and prints the first and the last characters of the string.
// Exercise 2.1. Write a Java program that creates an object of type String representing your name, and prints the first and the last characters of the string.
// Exercise 2.3. Modify the Java program in Exercise 2.1 using as few variables as possible.
class Ex_2{   
    public static void main(String[] args) {
        String firstName = "Lee";
        String lastName = "Jinwoo";
        System.out.println(firstName.concat(lastName));

        // Exercise 2.4. Write a Java program that reads from input a non-empty string and prints the string obtained from it by inverting the first and the last characters. Illustrate by means of a diagram what happens in memory when the program is executed.
        System.out.println(lastName.concat(firstName));

        // Exercise 2.5. Solve Exercise 2.4 using the class StringBuffer. Illustrate by means of a diagram what happens in memory when the program is executed.
        StringBuffer s = new StringBuffer();
        s.append(firstName).append(lastName);
        System.out.println(s);
        s.replace(0,3,lastName).replace(6, s.length(), firstName);
        
        System.out.println(s);
        
    }
} 