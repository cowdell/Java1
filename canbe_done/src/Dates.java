import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/20/13
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dates {

    public void findDates (String time1) throws ParseException{
    Date now = new Date();
    long milis = now.getTime();//Since Jan 1, 1970
    System.out.println(milis);

    Date alsoNow = new Date(milis);

    System.out.println(now.equals(alsoNow));
    System.out.println(now);

//    /*    http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
    System.out.printf("Please enter a date (e.g. %s)%n", dateFormat.format(now));
    Scanner scan = new Scanner(System.in);
    Date parsed = dateFormat.parse(scan.nextLine());
    System.out.println(parsed);

    DateFormat time = DateFormat.getTimeInstance(DateFormat.SHORT);
    System.out.printf("Please enter a time (e.g. %s)%n", time.format(now));
    Date parseTime = time.parse(scan.nextLine());
    System.out.println(parseTime);

    DateFormat both = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

    System.out.printf("Please enter a time (e.g. %s)%n", both.format(now));
    Date parseBoth = both.parse(scan.nextLine());
    System.out.println(parseBoth);

    System.out.println("Please enter a date (mm dd YYYY)");
    DateFormat custom = new SimpleDateFormat("MM dd yyyy");













}

}
