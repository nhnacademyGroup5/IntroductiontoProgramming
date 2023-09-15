package ch8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix {
    private int n;
    private int m;

    Matrix(int n, int m){
        this.n = n;
        this.m = m;
    }

    public void save(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                bw.write(0 + " ");
            }bw.write("\n");
        }
    }

    static Matrix read(String filename){
        return new Matrix(0, 0);
    }
}
