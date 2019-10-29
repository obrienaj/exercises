public class Cone{
    public static void main(String[] args){
        
        Cone cone = new Cone(4, 12);
        
        System.out.print("Slant height: " + cone.slantHeight());
        System.out.println("    Angle: " + cone.angle());

        Cone cone2 = new Cone(6, 10);
        
        System.out.print("Slant height: " + cone2.slantHeight());
        System.out.println("    Angle: " + cone2.angle());

        Cone cone3 = new Cone(8, 4);
        
        System.out.print("Slant height: " + cone3.slantHeight());
        System.out.println("    Angle: " + cone3.angle());

    }


    private double r;
    private double h;


    public Cone(double r, double h){

        this.r = r;
        this.h = h;

    }


    public double slantHeight(){

        return Math.sqrt(r*r + h*h);

    }



    public double angle(){

        return Math.atan(r/h);

    }


    
}