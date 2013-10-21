import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/21/13
 * Time: 4:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompareData {

    public void getDate(int a, int b, int c){
        GregorianCalendar date1 = new GregorianCalendar(a, b, c);
        GregorianCalendar date2 = new GregorianCalendar();

        date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
        date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
        date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

        int years = date2.get(Calendar.YEAR);
        int months = date2.get(Calendar.MONTH);
        int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

        System.out.println("days : " + days + " months : " + months + " years : " + years);
    }
}
