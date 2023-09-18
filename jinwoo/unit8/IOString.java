package jinwoo.unit8;

import java.io.*;
import java.util.StringTokenizer;

public class IOString {

    // Ex 8.1.
    private static String[] loadArray(InputStream is, int n) throws IOException{
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        if(st.countTokens() < n) throw new IllegalArgumentException("입력 값이 부족합니다!");
        String[] result = new String[n];
        int count = 0;
        while(count != n){
            result[count] = st.nextToken();
            count++;
        }

        return result;
    }
    private static void printArray(OutputStream os, String[] sa){
        PrintStream ps = new PrintStream(os);
        for (String string : sa) {
            ps.println(string);
        }
    }

    // Ex 8.2.
    private static double inputAvarage(InputStream is) throws IOException{
        double sum = 0.0;
        int count = 0;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int input;
        do{
            input = Integer.parseInt(br.readLine());
            sum += input;
            count++;
        }
        while(input != 0);
        return sum / count;
    }

    // Ex 8.3.
    private static void printFile(String fileName) throws IOException{
        // String path = IOString.class.getResource("").getPath() + "resources/" + fileName;
        String path = "jinwoo/unit8/resources/" + fileName;
        FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
        while(line != null){
            if(line.startsWith("/") || line.startsWith(";") || line.startsWith("%")){
                System.out.println(line);
            }
            line = br.readLine();
        }
        br.close();
    }

    // Ex 8.4.
    private static void makeMultiplicationTable(String fileName, int n) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                sb.append(i * j);
                sb.append(" ");
            }
            sb.append("\n");
            bw.write(sb.toString());
        }
        bw.close();
        printFile(fileName);
    }

    // Ex 8.5.
    private static String getHighestAverage(String fileName) throws IOException{
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String name = "";
        double average = 0;
        String line = bufferedReader.readLine();
        while(line != null){
            StringTokenizer st = new StringTokenizer(line);
            int count = st.countTokens()-1;
            String tmpName = st.nextToken();
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if(sum > average){
                name = tmpName;
                average = sum / count;
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        return "Best is : " + name + "[" + average + "]";
    }

    public static Matrix readFileToMatrix(String filename) throws IOException{
        IOFile file = new IOFile(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getFileName()));
        String line = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        int row = file.countLines();
        int column = stringTokenizer.countTokens();
        Matrix result = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result.getInfo()[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return result;
    }

    public static void main(String[] args) throws IOException{
        // InputStream is = System.in;
        // OutputStream os = System.out;
        // printArray(os, loadArray(is, 4));
        // System.out.println(inputAvarage(is));
        // printFile("Ex8_3.txt");
        // makeMultiplicationTable("jinwoo/unit8/resources/Ex8_4.txt", 3);
        // String answer = getHighestAverage("jinwoo/unit8/resources/Ex8_5.txt");
        // System.out.println(answer);
        // Matrix matrix = new Matrix(3, 3);
        // matrix.save("matrix");
        // IOFile file = new IOFile("Ex8_3");
        // file.print();
        // System.out.println(file.countLines());
        System.out.println(readFileToMatrix("matrix"));

    }
}
