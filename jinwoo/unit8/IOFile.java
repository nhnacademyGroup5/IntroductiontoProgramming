package jinwoo.unit8;

import java.io.*;

// Ex 8.6.
public class IOFile {
    private String fileName;
    private File file;

    public String getFileName() {
        return fileName;
    }

    public IOFile(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
    }
    
    public int countLines() throws IOException{
        int count = 0;
        FileReader fileReader = new FileReader(this.file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while(line != null){
            count++;
        }
        bufferedReader.close();
        return count;
    }

    public void write(OutputStream os){
        
    }
}
