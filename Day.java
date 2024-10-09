public class Day{  
    static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    int currentDay = 0;

    void setDay(int currentDay){
       this.currentDay = (currentDay%7+7)%7;
       System.out.println("day set to "+this.currentDay);
    }
    String nDaysLater(int n){
        return DAYS[((currentDay+n)%7 + 7)%7];
    }
    String returnDay(){
        return nDaysLater(0);
    }
    String nextDay(){
        return nDaysLater(1);
    }
    String previousDay(){
        return nDaysLater(-1);
    }   
}