
public class Rectangle {
    private int length;
    private int breadth;

   
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

 
    public Rectangle(int s) {
        length = s;
        breadth = s;
    }


    public int calculateArea() {
        return length * breadth;
    }

   
    public int calculateArea(int l, int b) {
        return l * b;
    }

    
    public static void main(String[] args) {
       
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area of rectangle : " + rect.calculateArea());

        Rectangle square = new Rectangle(6);
        System.out.println("Area of square: " + square.calculateArea());

       
        System.out.println("Area using parameters : " + rect.calculateArea(15, 4));
    }
}
