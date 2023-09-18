import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("intSequence.txt"));

        System.out.println(includeIntOne(br));
    }

    static int includeIntOne(BufferedReader br) throws IOException{

        String str = br.readLine();
        if(str == null) return 0;

        if(str.indexOf("1") >= 0) return 1 + includeIntOne(br);
        return includeIntOne(br);
    }
}
