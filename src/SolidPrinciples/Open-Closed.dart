//
// class Shape{
//   String type;
//   Shape(this.type);
// }
//
// class AreaCalculator{
//
//   double calculateArea(Shape shape){
//     if(shape.type == 'circle'){
//       return 3.14*3.14;
//     }else if(shape.type == 'rectangle'){
//       return 4*5;
//     }
//
//     return 0;
//   }
//
// }


abstract interface class Shape{
  double calculateArea();
}

class Circle implements Shape{
  double radius;
  Circle(this.radius);

  @override
  double calculateArea() {
    return 3.14*radius*radius;
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

class AreaCalculator{
  double calculateArea(Shape shape){
    return shape.calculateArea();
  }
}