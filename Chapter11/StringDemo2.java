public class StringDemo2{
    public static void main (String[] args){
        String str;
        int len;

        str = new String("       Cats!!!        ");

        len = str.length();

        System.out.println(str);
        System.out.println("The length is: " + len);

        String second = str.trim();

        int len2 = second.length();

        System.out.println(second);
        System.out.println("The length is now: " + len2);


    }



}