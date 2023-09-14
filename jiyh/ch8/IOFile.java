package ch8;

import java.io.*;

public class IOFile {
    private String filename;
    
    IOFile(String filename){
        this.filename = filename;
    }

    public int countLines() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int countLine = 0;

        while(br.readLine() != null){
            countLine++;
        }
        return countLine;
    }

    public void write(OutputStream os){
        
    }

    public void print() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String strLine = br.readLine();
        while(strLine != null){
            System.out.println(strLine);
            strLine = br.readLine();
        }
    }

    public void delete(){
        File f = new File(filename);
        f.delete();
    }
}
