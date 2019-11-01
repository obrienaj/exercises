public class Cylinder{

    public static void main(String[] args){

        CylinderTester cylinder = new CylinderTester(2, 4);

        System.out.print("r = " + cylinder.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder.surfaceArea());
        
        CylinderTester cylinder2 = new CylinderTester(1, 3);

        System.out.print("r = " + cylinder2.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder2.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder2.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder2.surfaceArea());
        
        CylinderTester cylinder3 = new CylinderTester(5, 2);

        System.out.print("r = " + cylinder3.getR());
        System.out.print("  ");
        System.out.print("h = " + cylinder3.getH());
        System.out.print("  ");
        System.out.print("Volume = " + cylinder3.volume());
        System.out.print("  ");
        System.out.println("Surface area = " + cylinder3.surfaceArea());

    }

}