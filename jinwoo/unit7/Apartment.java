package jinwoo.unit7;

// Ex 7.12.
public class Apartment {
    private int size;
    private int address;
    private String[] persons = new String[10];

    public Apartment(int size, int address) {
        this.size = size;
        this.address = address;
        for (int i = 0; i < this.persons.length; i++) {
            this.persons[i] = " ";
        }
    }

    public int getSize() {
        return size;
    }

    public int getAddress() {
        return address;
    }

    public int numberOfPersons(){
        int count = 0;
        for (String name : persons) {
            if(name != " ") count++;
        }
        return count;
    }

    // name이 아파트에 살고 있는지 체크
    public int livingCheck(String input){
        for (String name : persons) {
            if(name != input) return 0;
        }
        return -1;
    }

    public void moveIn(String name){
        if(livingCheck(name) == 0){
            for (int i = 0; i < persons.length; i++) {
                if(persons[i] == " "){
                    persons[i] = name;
                    break;
                }
            }
        } else{
            throw new IllegalArgumentException("이미 거주하고 있는 이름입니다.");
        }
    }

    public String whoIsLiveIn(int n){
        if(n < 0) throw new IllegalArgumentException("양수만 입력해야합니다.");
        if(n >= 10) throw new IllegalArgumentException("잘못된 번호입니다.");
        return this.persons[n];
    }

    public void moveOut(int n){
        if(n < 0) throw new IllegalArgumentException("양수만 입력해야합니다.");
        if(n >= 10) throw new IllegalArgumentException("잘못된 번호입니다.");
        this.persons[n] = " ";
    }

    @Override
    public String toString() {
        return size + "평형 아파트 " + address + "동" + "\n " + "현재 거주자 : " + numberOfPersons() + "명";
    }
}
