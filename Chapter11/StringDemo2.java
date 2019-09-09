public class StringDemo2{
    public static void main (String[] args){
     
        String str = new String("       Cats are nice!!!        ");
        int len = str.length();

        System.out.println(str);
        System.out.println("The length is: " + len);

        String second = str.trim();
        int len2 = second.length();

        System.out.println(second);
        System.out.println("The length is now: " + len2);

        String sub = second.substring(10, len2);
        System.out.println(sub);


    }



}