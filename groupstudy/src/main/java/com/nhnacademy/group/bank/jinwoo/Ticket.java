package groupstudy.src.main.java.com.nhnacademy.group.bank.jinwoo;

public class Ticket {
    private int num;
    private String time;

    public Ticket(int num, String time) {
        this.num = num;
        this.time = time;
    }

    @Override
    public String toString() {
        return "대기번호 : " + num + " | 받은 시간 : " + time;
    }
}
