public class Cone{
    public static void main(String[] args){
        
        Cone cone = new Cone(4, 12);
        
        System.out.print("Slant height: " + cone.slantHeight());
        System.out.println("    Angle: " + cone.angle());

    }


    public Cone(double r, double h){
        this.r = r;
        this.h = h;
    }


    public double slantHeight(){

        return Math.sqrt(r*r + h*h);

    }



    public double angle(){

        return Math.arctan(r/h);

    }


    
}