import 'dart:io';

void func1(){
  int i , j;
  int row = 6;
  for(int i = 0; i<row; i++){
    for(int j = 0; j<=i; j++){
      stdout.write("* ");
    }
    print("");
  }
}


void main(){
  print("Dwaipayan");

  func1();


}