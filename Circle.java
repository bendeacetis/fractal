//Written by Benjamin DeAcetis deace003
import java.awt.Color;
import java.lang.Math;

public class Circle {
    private Color circleColor;
    private double x;
    private double y;
    private double radius;

    public Circle(double inputX, double inputY, double inputRadius){
        x = inputX;
        y = inputY;
        radius = inputRadius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * getRadius();
    }

    public double calculateArea(){
        return Math.PI * (getRadius() * getRadius());
    }

    public void setColor(Color inputColor){
        circleColor = inputColor;
    }

    public void setPos(double inputX, double inputY){
        x = inputX;
        y = inputY;
    }
    public void setRadius(double inputRadius){
        radius = inputRadius;
    }
    public Color getColor(){
        return circleColor;
    }
    public double getXPos(){
        return x;
    }
    public double getYPos(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

}
