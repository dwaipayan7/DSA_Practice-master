abstract interface class Bulb{
  void turnOn();
  void turnOff();
}

//Lower level module
class LEDBulb implements Bulb{
  @override
  void turnOff() {
    print("LED Bulb Turn Off");
  }

  @override
  void turnOn() {
    print("LED Bulb turn On");
  }

}

//Higher level modules
class Room{
  final Bulb bulb;
  const Room({required this.bulb});


  void switchLightOn(){
    bulb.turnOn();
  }

  void switchLightOff(){
    bulb.turnOff();
  }

}

void main(){
  LEDBulb ledBulb = LEDBulb();

  Room room = Room( bulb: ledBulb);

  room.switchLightOff();
  room.switchLightOn();

}