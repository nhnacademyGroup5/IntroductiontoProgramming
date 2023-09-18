//package Unit8;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Exercise8_5 {
//    public static void main(String[] args) throws IOException {
//        String fileName = "Exam.txt";
//        String stuendtAVerage = findStudent(fileName);
//
//        System.out.println(stuendtAVerage);
//
//    }
//
//    public static String findStudent(String fileName) throws IOException {
//        FileReader f = new FileReader("Exam.txt");
//        BufferedReader in = new BufferedReader(f);
//        String line = in.readLine();
//
//        String studentName = "";
//        double maxAverage = 0;
//        while (in.readLine() != null) {
//            String[] text = line.split(" ");
//
//            if (text.length > 1) {
//                String Stuendt = text[0];
//                int sum = 0;
//                int count = 0;
//
//                for (int i = 1; i < text.length; i++) {
//                    int score = Integer.parseInt(text[i]);
//                    sum += score;
//                    count++;
//                }
//                if (count > 0) {
//                    double average = (double) sum / count;
//                    if (average > maxAverage) {
//                        maxAverage = average;
//                        studentName = Stuendt;
//                    }
//                }
//            }
//            line = in.readLine();
//
//        }
//        return studentName;
//    }
//}
