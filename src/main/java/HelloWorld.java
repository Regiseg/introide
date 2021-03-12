import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,3,23);
        if(date.getYear() == LocalDate.of(2020,4,21).getYear() && date.getMonthValue() == 3){
            System.out.println("ok");
            System.out.println(date.getDayOfWeek());
        } else {
            System.out.println("nem ok");
        }
    }
}
