package ch5;

public class Triangle {
    
    private int a;
    private int b;
    private int c;
    private String check;
    private int sortvalue[] = null;
    

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        sortvalue = new int[] {a, b, c};
        sort(sortvalue);
        check = Exercise2.condition(sortvalue);
        
    }
    public int getLongest(){
        return sortvalue[2];
    }

    public int getIntermediate(){
        return sortvalue[1];
    }

    public int getshortest(){
        return sortvalue[0];
    }

    public int perimeter(){
        return a + b + c;
    }

    public int area(){
        return (a + b + c) / 2;
    }

    public String getCheck(){
        return check;
    }
    

    private void sort(int value[]){
        //bubble
        for(int i=0; i<value.length-1; i++){
            for(int j=i+1; j<value.length; j++){

                if(value[i] > value[j]) {
                    int x = value[j];
                    value[j] = value[i];
                    value[i] = x;
                }
            }
        }
    }

}
