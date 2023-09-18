package ch8;

import java.io.*;
import java.util.StringTokenizer;


public class Iostream {

    static String[] loadStrings(InputStream in, int n) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] loadString = new String[n];

        for(int i=0; i<n ;i++){
            loadString[i] = br.readLine();
        }
        
        return loadString;
    }

    static void saveString(OutputStream out, String[] sa) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

        for(int i=0; i<sa.length; i++){
            bw.write(sa[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    static double readAverage(InputStream in) throws IOException{
        int readNumber  = in.read() - '0';
        int count = 1;
        double sum = readNumber;
        
        while(readNumber != 0){
            readNumber = in.read() - '0';
            sum += readNumber;
            count++;
        }

        return sum / count;
    }

    static void checkFirstChar(FileInputStream in) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String printString = br.readLine();
        while(printString != null){
            char firstChar = (char) printString.codePointAt(0);
            if(firstChar == '/' || firstChar == ',' || firstChar == ';' || firstChar == '%')
                System.out.println(printString);

            printString = br.readLine();
        }
    }

    static void createTableFile(String filename, int n) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                sb.append(i*j).append(" ");
            }sb.append("\n");
        }

        bw.append(sb);
        bw.flush();
        bw.close();
    }

    static String maxAvgscore(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringTokenizer st = null;
        
        
        String readLine = br.readLine();
        String maxStd = "";
        double maxAvg = 0;
        while(readLine != null){
            st = new StringTokenizer(readLine);
            String std = st.nextToken();

            int sum = 0;
            int count = st.countTokens();

            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            if(maxAvg < sum/count){
                maxAvg = sum/count;
                maxStd = std; 
            }
            readLine = br.readLine();
        }
        return maxStd;
    }
}
