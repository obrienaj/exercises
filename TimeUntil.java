import java.util.*;
import java.time.LocalDataTime;

public class TimeUntil{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int futureHour, futureMinute, futureSecond;

futureHour = LocalDataTime.now().getHour();
futureMinute = LocalDataTime.now().getMinute();
futureSecond = LocalDataTime.now().getSecond();     // do I have to import?

System.out.println("Enter future time hh:mm:ss ");
String future = new String(scan.nextLine());

String hour, minute, second;
hour = future.substring(1, 2);
minute = future.substring(4, 5);
second = future.substring(7, 8);    // convert string to int?

intx = String.parseInt("future"); // do this some more

hour = futureHour - hour;
minute = futureMinute - minute;
second = futureSecond - second;

if (hour != 0)
    System.out.println(hour + " hours");
if (minute != 0)
    System.out.println(minute + "minutes");
if (second != 0)
    System.out.println(second + "seconds");



    }



}