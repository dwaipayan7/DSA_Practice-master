enum EmployeeType{
  programmer,
  boss,
  hr
}

abstract class Employee{

  void work();

  factory Employee(EmployeeType type){
    switch(type){
      case EmployeeType.programmer:
        return Programmer();

      case EmployeeType.hr:
        return HRManager();

      case EmployeeType.boss:
        return Boss();

      default:
        return Programmer();
    }
  }

}

class Programmer implements Employee{
  @override
  void work() {
   print("Coding an app");
  }

}

class HRManager implements Employee{
  @override
  void work() {
    // TODO: implement work
    print("Hiring someone");
  }

}

class Boss implements Employee{
  @override
  void work() {
    // TODO: implement work
    print("leading the team");
  }

}


class FactoryMethod{
  static Employee getEmployee(String type){
    switch (type){
      case 'programmer':
        return Programmer();
      case 'hr':
        return HRManager();
      case 'boss':
        return Boss();

      default:
        return Programmer();
    }
  }
}

void main(){
  Employee employee = Employee(EmployeeType.programmer);
  print(employee);
  employee.work();

  Employee employee2 = FactoryMethod.getEmployee('boss');
  employee2.work();

}