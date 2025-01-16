 void main(){
  // int a = 10;
  // print(a);

   List<int> numbers = [1, 2, 3, 4, 5];

   var doubleNumbers = numbers.map((item) =>{
     item * 2
   });

   print(doubleNumbers);

   var squareNumber = numbers.map((number){
     return number*number;
   });

   print(squareNumber);

   var addedMultipleNumbers = numbers.map((number){
     return (number+1)*3;
   });

   print(addedMultipleNumbers);

 }