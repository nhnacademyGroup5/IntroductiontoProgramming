package jinwoo.unit8;

import java.io.*;

// Ex 8.6.
public class IOFile {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public IOFile(String fileName) {
        this.fileName = "jinwoo/unit8/resources/"+ fileName + ".txt";
    }
    
    public int countLines() throws IOException{
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        // String line = bufferedReader.readLine();
        while(bufferedReader.readLine() != null){
            count++;
        }
        bufferedReader.close();
        return count;
    }

    // public void write(OutputStream os) throws IOException{
    //     PrintStream printStream = new PrintStream(os);
    //     os.
    // }

    public void print() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public void copy(String newFileName) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName));
        String line = bufferedReader.readLine();
        while(line != null){
            bufferedWriter.write(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void delete(){
        File file = new File(fileName);
        file.delete();
    }
}
