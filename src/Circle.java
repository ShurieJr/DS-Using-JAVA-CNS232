public class Circle {
    //variables
    double radius;
    //constructors
    Circle(){ //no argument
        radius = 1.0;
    }
    Circle(double value){ //parametrized
        radius = value;
    }
    //methods
    double getArea(){  //instance methods
        return radius * radius * Math.PI;
    }
    void displayRadius(){
        System.out.println("Radius: " + radius);
    }

}
