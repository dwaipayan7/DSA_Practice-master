void main(){

  List<int> arr = [0, 0, 0,1,1,1];

  arr = arr.map((e) => e == 0 ? 1 : 0).toList();

  print(arr);

}