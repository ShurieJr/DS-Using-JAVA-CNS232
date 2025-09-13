public class Circle {
    //variables
    double radius;
    //constructors
    Circle(){
        radius = 1.0;
    }
    Circle(double value){
        radius = value;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
    void displayRadius(){
        System.out.println("Radius: " + radius);
    }

}
