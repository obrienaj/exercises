public class CylinderTester{

    private double r;
    private double h;

    public CylinderTester(double r, double h){
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