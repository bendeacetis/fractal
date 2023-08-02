//Written by Benjamin DeAcetis deace003
import java.awt.Color;

public class Triangle {
    //constructor
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    public Triangle(double inputX, double inputY, double inputWidth, double inputHeight){
        x = inputX;
        y = inputY;
        width = inputWidth;
        height = inputHeight;
    }

    //received a formula for perimeter from Google.com
    //https://www.google.com/search?q=perimeter+of+isosceles+triangle+with+height+and+base&ei=_JYsY8y_Eu3e0PEPko-hqAM&oq=perimeter+of+isosceles+triangle+&gs_lcp=Cgdnd3Mtd2l6EAEYAjIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoKCAAQRxDWBBCwAzoHCAAQsAMQQ0oECEEYAEoECEYYAFCpBlipBmCJGmgBcAF4AIABUYgBUZIBATGYAQCgAQHIAQrAAQE&sclient=gws-wiz
    public double calculatePerimeter(){
        return getWidth() + Math.sqrt(Math.exp(getWidth()) + 4*(Math.sqrt(getHeight())));
    }
    public double calculateArea(){
        return 0.5 * getWidth() * getHeight();
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
