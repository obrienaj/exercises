public class Box{

    private double length;
    private double width;
    private double height;

    public Box(double width, double height, double length){

        this.width = width;
        this.height = height;
        this.length = length;
        
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25 * width, 1.25 * height, 1.25 * length);
    }

    public Box smallerBox(Box oldBox){
        return new Box(.75 * width, .75 * height, .75 * length);
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

    private double faceArea(){
        return length*width;
    }

    private double topArea(){
        return length*height;
    }

    private double sideArea(){
        return height*width;
    }

    public double area(){
        return (2 * faceArea()) + (2 * topArea()) + (2 * sideArea());
    }

    public boolean nests(Box outsideBox){

        double outsideWidth = outsideBox.getWidth();
        double outsideHeight = outsideBox.getHeight();
        double outsideLength = outsideBox.getLength();

        if (outsideLength >= length && outsideHeight >= height && outsideWidth >= width)
            return true;
        else
            return false;
    }

}