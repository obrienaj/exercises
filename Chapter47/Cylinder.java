public class Cylinder{

    public static void main(String[] args){

        Cylinder cylinder = new Cylinder(2, 4);

        System.out.print("r = " + cylinder.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder.surfaceArea());
        
        Cylinder cylinder2 = new Cylinder(1, 3);

        System.out.print("r = " + cylinder2.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder2.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder2.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder2.surfaceArea());
        
        Cylinder cylinder3 = new Cylinder(5, 2);

        System.out.print("r = " + cylinder3.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder3.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder3.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder3.surfaceArea());

    }

    private double r;
    private double h;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double getR(){
        return this.r;
    }

    public double getH(){
        return this.h;
    }

    public double volume(){
        return Math.PI * r*r * h;
    }

    public double surfaceArea(){
        return (2 * Math.PI * r) * (r + h);
    }


}