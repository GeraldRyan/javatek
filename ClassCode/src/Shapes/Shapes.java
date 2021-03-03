package Shapes;

public class Shapes {

}

class Point {
  double x, y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

}

class Rectangle {
  private double width, height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double getWidth(){
    return width;
  }
  public boolean setWidth(double width){
    this.width = width;
    return true;
  }

}

class Square extends Rectangle {

  Square(double widthAndHeight) {
    super(widthAndHeight, widthAndHeight);
  }
}