//Written by Benjamin DeAcetis deace003
import java.awt.Color;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    public Rectangle(double inputX, double inputY, double inputWidth, double inputHeight){
        x = inputX;
        y = inputY;
        width = inputWidth;
        height = inputHeight;
    }
    public double calculatePerimeter(){
        return (2 * getHeight()) + (2 * getWidth());
    }
    public double calculateArea(){
        return getWidth() * getHeight();
    }
    public void setColor(Color inputColor){
        color = inputColor;
    }
    public void setPos(double inputX, double inputY){
        x = inputX;
        y = inputY;
    }
    public void setHeight(double inputHeight){
        height = inputHeight;
    }
    public void setWidth(double inputWidth){
        width = inputWidth;
    }
    public Color getColor(){
        return color;
    }
    public double getXPos(){
        return x;
    }
    public double getYPos(){
        return y;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
}
