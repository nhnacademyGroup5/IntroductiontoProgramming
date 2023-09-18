package jinwoo.unit8;

import java.io.*;

public class Matrix {
    private int row;
    private int column;
    private int[][] info;

    public int[][] getInfo() {
        return info;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.info = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                info[i][j] = 0;
            }
        }
    }

    void save(String filename) throws IOException{
        String path = "jinwoo/unit8/resources/" + filename + ".txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < info.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < info[0].length; j++) {
                stringBuilder.append(info[i][j]).append(" ");
            }
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    Matrix sum(Matrix matrix){
        if(this.getColumn() == matrix.getColumn() && this.getRow() == matrix.getRow()){
            Matrix result = new Matrix(this.getRow(), this.getColumn());
            for (int i = 0; i < this.getRow(); i++) {
                for (int j = 0; j < this.getColumn(); j++) {
                    result.info[i][j] = this.info[i][j] + matrix.info[i][j];
                }
            }
            return result;
        } else{
            throw new IllegalArgumentException("");
        }
    }

    Matrix product(Matrix matrix){
        if(this.getColumn() == matrix.getRow()){
            Matrix result = new Matrix(this.getRow(), matrix.getColumn());
            for (int i = 0; i < result.getRow(); i++) {
                for (int j = 0; j < result.getColumn(); j++) {
                    for (int k = 0; k < this.getColumn(); k++) {
                        result.info[i][j] += this.info[i][k] * matrix.info[k][j];   
                    }
                }
            }
            return result;
        } else{
            throw new IllegalArgumentException("곱셈 규칙에 어긋납니다.");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                stringBuilder.append(info[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
