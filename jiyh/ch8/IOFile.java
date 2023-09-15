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

    public void write(OutputStream os) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        
        for(int i=0; i<countLines(); i++){
            bw.write(br.readLine());
        }

        bw.flush();
        bw.close();
        
    }

    public void print() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));

        for(int i=0; i<countLines(); i++){
            System.out.println(br.readLine());
        }
    }

    public void copy(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        String bufString = br.readLine();
        while(bufString != null){
            bw.write(bufString);
            bufString = br.readLine();
        }
        bw.flush();
        bw.close();
        
    }

    public void delete(){
        File f = new File(filename);
        f.delete();
    }
}
