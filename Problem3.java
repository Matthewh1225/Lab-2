public class Problem3 {
    public static void main(String[] args) {
        Day d = new Day();
        d.setDay(-15);
        System.out.println(d.returnDay());
        System.out.println(d.previousDay());
        System.out.println(d.nextDay());
        System.out.println(d.nDaysLater(7));
    }        
}
