public class Box{

    private double length;
    private double width;
    private double height;

    public Box(double width, double height, double length){

        this.width = width;
        this.height = height;
        this.length = length;
        
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getLength(){
        return length;
    }

    public double volume(){
        return width * length * height;
    }

    public double area(){
        return (2 * length * width) + (2 * width * height) + (2 * height * length);
    }
}