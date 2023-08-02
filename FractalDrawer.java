//Written by Benjamin DeAcetis deace003
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // constructor

    //TODO:
    // drawFractal creates a new Canvas object --> COMPLETE
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal --> COMPLETE

    public double drawFractal(String type) {

        Canvas drawing = new Canvas(800,800);

        if (type.equals("triangle")){
            drawTriangleFractal(200, 200, 300, 300, Color.red, drawing, 8);
        }
        else if (type.equals("rectangle")){
            drawRectangleFractal(200, 300, 300,300,Color.red, drawing,8);
        }
        else if (type.equals("circle")){
            drawCircleFractal(100, 400,400, Color.red, drawing, 8);
        }
        else{
            System.out.println("Error...");
            return 0.0;
        }
        return totalArea;
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        //temporary triangle object
        Triangle triangle = new Triangle(x,y,width, height);
        triangle.setColor(c);

        can.drawShape(triangle);

        totalArea += (width * height)/2;

        //Color Initializing
        Random randFloat = new Random();
        float r = randFloat.nextFloat();
        float g = randFloat.nextFloat();
        float b = randFloat.nextFloat();
        Color nextColor = new Color(r,g,b);


        if (level != 0){
            //left corner
            drawTriangleFractal(width/2, height/2, x-(width/2), y,nextColor, can, level-1);
            //top corner
            drawTriangleFractal(width/2, height/2, x+(width/4), y+height,nextColor, can, level-1);
            //right corner
            drawTriangleFractal(width/2, height/2, x+width, y,nextColor, can, level-1);
        }
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        //temporary circle object
        Circle circle = new Circle(x, y, radius);
        circle.setColor(c);

        can.drawShape(circle);

        totalArea += Math.PI * Math.exp(radius);

        //Color Initializing
        Random randFloat = new Random();
        float r = randFloat.nextFloat();
        float g = randFloat.nextFloat();
        float b = randFloat.nextFloat();
        Color nextColor = new Color(r,g,b);

        if (level != 0){
            //top
            drawCircleFractal(radius/2, x, y+radius+(radius/2), nextColor, can, level - 1);
            //left
            drawCircleFractal(radius/2, x-radius-(radius/2), y, nextColor, can, level - 1);
            //right
            drawCircleFractal(radius/2, x+radius+(radius/2), y, nextColor, can, level - 1);
            //bottom
            drawCircleFractal(radius/2, x, y-radius-(radius/2), nextColor, can, level - 1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        //temporary rectangle object
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setColor(c);

        can.drawShape(rectangle);

        totalArea += width * height;

        //Color Initializing
        Random randFloat = new Random();
        float r = randFloat.nextFloat();
        float g = randFloat.nextFloat();
        float b = randFloat.nextFloat();
        Color nextColor = new Color(r,g,b);

        if (level != 0){
            //top left
            drawRectangleFractal(width/2, height/2, x-(width/2), y+height,nextColor,can,level-1);
            //top right
            drawRectangleFractal(width/2, height/2, x+width, y+height,nextColor,can,level-1);
            //bottom right
            drawRectangleFractal(width/2, height/2, x+width, y-(height/2),nextColor,can,level-1);
            //bottom left
            drawRectangleFractal(width/2, height/2, x-(width/2), y-(height/2),nextColor,can,level-1);
        }

    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal

    public static void main(String[] args){
        FractalDrawer mainFractal = new FractalDrawer();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 'circle', 'triangle' or 'rectangle' (case sensitive): ");
        String fractalShape = scanner1.nextLine();

        if (fractalShape.equals("triangle")){
            System.out.println(mainFractal.drawFractal("triangle"));
        }
        else if (fractalShape.equals("rectangle")){
            System.out.println(mainFractal.drawFractal("rectangle"));
        }
        else if (fractalShape.equals("circle")){
            System.out.println(mainFractal.drawFractal("circle"));
        }
        else{
            System.out.println("Please type in one the shapes given, case sensitive.");
        }

    }
}
