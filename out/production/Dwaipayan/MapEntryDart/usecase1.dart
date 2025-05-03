void main(){
  final map = {'a':1, 'b': 2, 'c':3};

  final transform = Map.fromEntries(
    map.entries.map((e) => MapEntry(e.key, e.value * 10))
  );

  print(transform);

  final filteredMap = Map.fromEntries(
    map.entries.where((e) => e.value >= 2)
  );

  print(filteredMap);


  final names = ['Dwaipayan', 'biswas'];

  final mapping = Map.fromEntries(
    names.map((name) => MapEntry(name, name.length))
  );

  print(mapping);


}