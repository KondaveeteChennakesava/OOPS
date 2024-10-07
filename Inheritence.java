class Shape{
    String colour;
    void area(){
        System.out.println("There is no area of shape");
    }
}

class Triangle extends Shape{
    int length;
    int breadth;
    void area(){
        System.out.println("The area of triangle is: "+0.5*length*breadth);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.colour = "Red";
        t.length = 10;
        t.breadth = 20;
        t.area();
        System.out.println("Colour of the triangle is: "+t.colour);
    }
}
