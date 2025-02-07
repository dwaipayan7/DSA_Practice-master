abstract interface class Worker{
  void work();
}

abstract interface class Eater{
  void eat();
}

class Developer implements Worker{
  @override
  void work() {
    print("Developer is working");
  }

}

class Waiter implements Eater, Worker{
  @override
  void eat() {
    print("Waiter is eating");
  }

  @override
  void work() {
    print("Waiter is working");
  }

}

void main(){

  var developer = Developer();
  developer.work();

  Waiter waiter = new Waiter();
  waiter.eat();
  waiter.work();

}