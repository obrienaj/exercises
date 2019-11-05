public class BoxTester{

    public static void main(String[] args){

        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Length: " + box.getLength() + " Height: " + box.getHeight() + " Width: " + box.getWidth());
        System.out.println("Surface area: " + box.area() + " Volume: " + box.volume());

        Box biggerBox = box.biggerBox(box);

        System.out.println("25% bigger:");
        System.out.println("Surface area: " + biggerBox.area() + " Volume: " + biggerBox.volume());

        Box smallerBox = box.smallerBox(box);

        System.out.println("25% smaller:");
        System.out.println("Surface area: " + smallerBox.area() + " Volume: " + smallerBox.volume());

        
    }

}