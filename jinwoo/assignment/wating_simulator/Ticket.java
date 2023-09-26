package jinwoo.assignment.wating_simulator;

public class Ticket {
    private int num;
    private String time;

    public int getNum() {
        return num;
    }

    public String getTime() {
        return time;
    }

    public Ticket(int num, String time) {
        this.num = num;
        this.time = time;
    }

    @Override
    public String toString() {
        return "대기번호 : " + num + "| 받은 시간 : " + time;
    }
}
