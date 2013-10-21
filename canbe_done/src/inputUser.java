import java.awt.*;
import java.text.ParseException;
import java.util. Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/20/13
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */


public class inputUser {
    private Scanner scanner = new Scanner(System.in);
     int choice = 0;
    private String yearQuestion = ("What year for example 2007 ?");
    private String monthQuestion =("What month for example 01 to 12?");
    private String dayQuestion = ("What day for example 1 - 30 ?");


    public void getInput() throws ParseException {
    System.out.println("Make choice between 1 to 4");
    System.out.println("Choice one is  Age Calculator is 1");
    System.out.println("Anniversary Calculator is 2");
    System.out.println("Age differences Calculator is 3");
    System.out.println("To quit is 4");

     int choice = this.scanner.nextInt();
      this.switchForTheChoice(choice);
    }

    private void switchForTheChoice(int choice) throws ParseException {
      Dates datesCalculator = new Dates();
      CompareData findBirthday = new CompareData();
      switch (choice) {
          case 1:   System.out.println(yearQuestion);
                    int year = this.scanner.nextInt();
                    System.out.println(monthQuestion);
                    int month = this.scanner.nextInt();
                    System.out.println(dayQuestion);
                    int day = this.scanner.nextInt();
                    findBirthday.getDateBirthday( year, month, day);
              break;
          case 2:   System.out.println(yearQuestion);
                    year = this.scanner.nextInt();
                    System.out.println(monthQuestion);
                    month = this.scanner.nextInt();
                    System.out.println(dayQuestion);
                    day = this.scanner.nextInt();
                    findBirthday.getDateAveressy( year, month, day);
              break;
          case 3:   System.out.println(yearQuestion);
                     year = this.scanner.nextInt();
                    System.out.println(monthQuestion);
                     month = this.scanner.nextInt();
                    System.out.println(dayQuestion);
                     day = this.scanner.nextInt();
                    System.out.println("2nd person" + yearQuestion);
                     int year2 = this.scanner.nextInt();
                    System.out.println("2nd person" + monthQuestion);
                     int month2 = this.scanner.nextInt();
                    System.out.println("2nd person" + dayQuestion);
                     int day2 = this.scanner.nextInt();
                    findBirthday.getDates(year, month, day, year2, month2, day2 );
              break;
          case 4:  System.out.println("Thanks have good Day!!");
              break;

      }


    }
    }
