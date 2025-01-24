abstract interface class Shape{
  double calculateArea();
}

class Circle implements Shape{
  double radius;
  Circle(this.radius);
  @override
  double calculateArea() {

    return 3.14 * radius * radius;

  }

}

class Rectangle implements Shape{
  double length;
  double breadth;
  Rectangle(this.length, this.breadth);
  @override
  double calculateArea() {
    return length*breadth;
  }

}

class Square implements Shape{
  double side;
  Square(this.side);
  @override
  double calculateArea() {
    return side*side;
  }

}

class AreaCalculator{
  double calculateArea(Shape shape){
    return shape.calculateArea();
  }
}

void main(){
  Circle circle = Circle(5.0);
  Rectangle rectangle = Rectangle(4.0, 5.0);
  Square square = new Square(3.0);

  AreaCalculator areaCalculator = AreaCalculator();

  print("Area of Circle is: ${areaCalculator.calculateArea(circle)}");
  print("Area of Rectangle is: ${areaCalculator.calculateArea(rectangle)}");
  print("Area of Square is: ${areaCalculator.calculateArea(square)}");

}