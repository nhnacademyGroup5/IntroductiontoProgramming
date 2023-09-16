package ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Matrix {
    private int[][] matrix;

    Matrix(int n, int m){
        matrix = new int[n][m];
    }

    public int getn(){
        return this.matrix.length;
    }
    public int getm(){
        return this.matrix[0].length;
    }

    private void createMartix(int n, int y){

    }
    public void save(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                bw.write(matrix[i][j] + " ");
            }bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    static Matrix read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        
        String str = br.readLine();
        while(str != null){
            StringTokenizer st = new StringTokenizer(str);


        }
        return new Matrix(0, 0);
    }
}
