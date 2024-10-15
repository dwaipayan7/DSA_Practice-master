import 'dart:math';

void main(){
  var random = Random();
  for(int i = 100; i>0; i--){

    int randomNumber = random.nextInt(100);
    print("Random Number: $randomNumber");
  }

  int res = fib(5);
  print("The value is: $res");

}

int fib(int n){
  if(n == 0){
    return 0;
  }else if(n == 1){
    return 1;
  }
  return fib(n-1) + fib(n-2);
}