package exercise;

public class RectangleApp{
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        System.out.println(rect.x);
        int xpos;
        int ypos;
        rect.setPosition(2,3);
        xpos  = rect.getX();
        ypos = rect.getY();



        System.out.println(xpos);
        System.out.println(ypos);
    }
}


