//package Unit9;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.PrintStream;
//
//public class Exercise9_5 {
//
//
//    private String filName;
//
//    public Exercise9_5(String fileName) {
//        this.filName = fileName;
//    }
//
//    public int countLines() throws FileNotFoundException {
//        FileReader f = new FileReader("jiwon");
//        BufferedReader in = new BufferedReader(f);
//        int count = 0;
//
//        while (in.readLine() != null) {
//            count++;
//        }
//        return count;
//    }
//
//    public void write(OutputStream os) throws IOException {
//        PrintStream ps = new PrintStream(os);
//        ps.println();
//    }
//
//    public void print() throws IOException {
//        File f0 = new File("print.txt");
//        BufferedReader reader = new BufferedReader(new FileReader(f0));
//        String line;
//
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        reader.close();
//    }
//
//    public void copy(String newFilename) throws IOException {
//
//        File f1 = new File("oldname.txt");
//        File f2 = new File("newname.txt");
//        boolean b = f1.renameTo(f2);
//    }
//
//    public void delete() {
//        File f1 = new File("delete.txt");
//
//        if (f1.exists()) {
//            f1.delete();
//        }
//    }
//}
//
