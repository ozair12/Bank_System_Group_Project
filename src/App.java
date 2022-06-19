import java.util.*;


public class App {


public static void time(){
    // Time and date
    Date dateAndTime = Calendar.getInstance().getTime();
    String[] date = dateAndTime.toString().split(" ");
    System.out.println(dateAndTime);
    System.out.println(date[5] );
}

}
