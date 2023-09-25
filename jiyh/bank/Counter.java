package bank;

import java.time.LocalTime;

public class Counter {

    private Employee employee;
    private int visitCnt = 0;
    private int watingTime = 0;
    private int processTime = 1;

    Counter(Employee employee){
        this.employee = employee;
    }

    public void process(Customer cus){
        try {

            // 창구 상황
            visitCnt++;
            watingTime += LocalTime.now().toSecondOfDay() - cus.getTicket().getTime().toSecondOfDay();
            
            //직원의 당일 처리 숫자
            employee.setProcessCount(employee.getProcessCount() + 1);


            
            Thread.sleep(processTime * 1000);
            System.out.println("---------------------------------------------");
            System.out.println("창구 직원이 처리한 시간 : "+LocalTime.now());
            System.out.println("ticket(번호, 받은시간) " + cus.getTicket());

        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }


    // 당일 창구에서 대기한 고객의 대기시간
    public String getCusWaitingTime(){
        try {
            return String.format("해당 창구의 평균 대기시간은 : %.6f 입니다", (double)watingTime / visitCnt);
        } catch (ArithmeticException e) {
            return null;
        }
        
    }
    
}
