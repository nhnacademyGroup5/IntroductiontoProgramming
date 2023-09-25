package ch5;

public class Date {
    
    private String date;
    private int day;
    private int month;
    private int year;

    Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        createDate();
    }

    public void createDate(){
        this.date = year + "/" + month + "/" + day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }

    public String getDate(){
        return this.date;
    }

    public String toString(){
        return this.year+"-"+this.month+"-"+this.day;
    }

    public boolean equals(Date d){
        return this.date.equals(d.date);
    }

    public boolean precedes(Date d){
        if(this.year > d.year) return false;
        if(this.month > d.month) return false;
        if(this.day > d.day) return false;

        return true;
    }

    public boolean leafyaer(){
        return (this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
    }

    public void nextday(){
        if(month % 2 == 1){
            day++;
            if(day > 31) {
                month++;
                day -= 31;
            }
        }else{
            day++;

            if(month == 2){
                if(leafyaer() || day > 29) {
                    day -= 29;
                    month++;
                }
                else if(day > 28) {
                    day -= 28;
                    month++;
                }
            }else{
                if(day > 30) {
                    day -= 30;
                    month++;
                }
            }
        }

        if(month > 12) {
            month -= 12;
            year++;
        }

        createDate();
    }
}
