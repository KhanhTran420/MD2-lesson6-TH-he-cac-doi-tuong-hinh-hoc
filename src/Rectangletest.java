public class Rectangletest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.4 , 4.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.4, 4.8, "yellow", true );
        System.out.println(rectangle);
    }
}
