package ch8;

import java.io.*;

public class Apartment {
    private double size;
    private String address;
    private int living;


    private String[] livingPerson = new String[10];

    Apartment(String address, double size){
        this.size = size;
        this.address = address;
        this.living = 0;
    }

    public double getSize() {
        return this.size;
    }
    public String getAddress() {
        return this.address;
    }
    public void setLiving(int living) {
        this.living = living;
    }

    public void addLiving(String name){
        if(living > 9){
            System.out.println("full Apartment");
            return;
        }

        livingPerson[living++] = name;
    }
    
    public String get(int idx){
        if(idx > living){
            return null;
        }

        return livingPerson[idx-1];
    }

    public void delete(int idx){
        if(idx > living){
            System.out.println("삭제할 수 없는 값");
            return;
        }

        for(int i=idx; i<=living; i++){
            livingPerson[i-1] = livingPerson[i];
        }
        living--;
    }

    @Override
    public String toString() {
        return "{" +
            " size='" + this.size + "'" +
            ", address='" + this.address + "'" +
            ", living='" + this.living + "'" +
            "}";
    }

    public void saveToFile(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        for(int i=0; i<living; i++){
            bw.write(livingPerson[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
    
}
