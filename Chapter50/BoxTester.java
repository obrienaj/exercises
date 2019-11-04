public class BoxTester{

    public static void main(String[] args){

        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Length: " + box.getLength() + " Height: " + box.getHeight() + " Width: " + box.getWidth());
    
        System.out.println("Surface area: " + box.area() + " Volume: " + box.volume());

        
    }

}