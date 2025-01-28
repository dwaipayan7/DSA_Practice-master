class Singleton1{
  static Singleton1? _instance;

  // Singleton1._internal(){
  //   print("PRIVATE CONSTRUCTOR RAN");
  // }

  Singleton1(){
    print("RUN");
  }

  static Singleton1 getInstance(){
    // _instance ??= Singleton1._internal();
    return _instance!;
  }

}

void main(){
  Singleton1 singleton1 = Singleton1();
  Singleton1 singleton2 = Singleton1();
  Singleton1 singleton3 = Singleton1();
}