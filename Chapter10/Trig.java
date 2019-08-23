public class Trig{
    public static void main(String[] args) {
        
        double x = 42;
        double y = 42;

        x = x * (Math.PI/180);
        y = y * (Math.PI/180);

        x = Math.sin(x);
        y = Math.cos(y);
        System.out.println("sine: " + x + " cosine: " + y);
       
        double value = x*x + y*y;
        System.out.println("sum of squares: " + value);


    }


}