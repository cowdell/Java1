import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/21/13
 * Time: 4:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompareData {

    public void getDateBirthday(int year, int month, int day){
        GregorianCalendar date1 = new GregorianCalendar(year, month, day);
        GregorianCalendar date2 = new GregorianCalendar();

        date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
        date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
        date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

        int years = date2.get(Calendar.YEAR);
        int months = date2.get(Calendar.MONTH);
        int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

        System.out.println("days : " + days + " months : " + months + " years : " + years);
    }

    public void getDates(int year, int month, int day, int year2, int month2, int day2){
        GregorianCalendar date1 = new GregorianCalendar(year, month, day);
        GregorianCalendar date2 = new GregorianCalendar(year2, month2,day2);

        date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
        date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
        date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

        int years = date2.get(Calendar.YEAR);
        int months = date2.get(Calendar.MONTH);
        int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

        System.out.println("days : " + days + " months : " + months + " years : " + years);
    }

    public void getDateAveressy(int year, int month, int day){
        GregorianCalendar date1 = new GregorianCalendar(year, month, day);
        GregorianCalendar date2 = new GregorianCalendar();

        date2.add(Calendar.YEAR, +date1.get(Calendar.YEAR));
        date2.add(Calendar.MONTH, +date1.get(Calendar.MONTH));
        date2.add(Calendar.DAY_OF_MONTH, +date1.get(Calendar.DAY_OF_MONTH) + 1);

        int years = date2.get(Calendar.YEAR);
        int months = date2.get(Calendar.MONTH);
        int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

        DateFormat both = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);



        System.out.println("days : " + days + " months : " + months + " years : " + years);
    }

}
