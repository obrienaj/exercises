import java.util.*;
import java.time.LocalDateTime;

public class TimeUntil{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int presentHour, presentMinute, presentSecond;

presentHour = LocalDateTime.now().getHour();
presentMinute = LocalDateTime.now().getMinute();
presentSecond = LocalDateTime.now().getSecond();

System.out.println("Current time is " + presentHour + ":" + presentMinute + ":" + presentSecond);

System.out.println("Enter future time hh:mm:ss ");
String future = new String(scan.nextLine());

String hour, minute, second;
hour = future.substring(0, 2);
minute = future.substring(3, 5);
second = future.substring(6, 8);

int intHour = Integer.parseInt(hour);
int intMinute = Integer.parseInt(minute);
int intSecond = Integer.parseInt(second);

int hourDifference, minuteDifference, secondDifference;
hourDifference = intHour - presentHour;
minuteDifference = intMinute - presentMinute;
secondDifference = intSecond - presentSecond;

if (hourDifference < 0)
    hourDifference = 24 + hourDifference;
if (minuteDifference < 0) {
    minuteDifference = 60 + minuteDifference;
    hourDifference = hourDifference - 1;
}
if (secondDifference < 0) {
    secondDifference = 60 + secondDifference;
    minuteDifference = minuteDifference - 1;
}

if (hourDifference != 0)
    System.out.println(hourDifference + " hours");
if (minuteDifference != 0)
    System.out.println(minuteDifference + " minutes");
if (secondDifference != 0)
    System.out.println(secondDifference + " seconds");



    }



}