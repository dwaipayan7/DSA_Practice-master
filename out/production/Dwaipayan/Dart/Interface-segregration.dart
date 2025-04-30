abstract interface class Worker{
  void work();
}

abstract interface class Eater{
  void eat();
}

class Developer implements Worker{
  @override
  void work() {
    // TODO: implement work
    print("Developer is working");
  }

}

class Waiter implements Eater, Worker{
  @override
  void eat() {
    print("Waiter is Eating");
  }

  @override
  void work() {
    print("Waiter is Working");
  }
}

void main(){
  Developer developer =  Developer();
  Waiter waiter =  Waiter();

  developer.work();

  waiter.work();
  waiter.eat();


}