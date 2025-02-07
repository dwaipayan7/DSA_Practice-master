
//Interface
abstract interface class Bulb{

  void turnOn();

  void turnOff();

}

//lower level module
class LED implements Bulb{
  @override
  void turnOff() {
    print("LED is turnedOff");
  }

  @override
  void turnOn() {
    print("LED is turnedOn");
  }
}

class Filament implements Bulb{
  @override
  void turnOff() {
    print("Filament is turnedOff");
  }

  @override
  void turnOn() {
    print("Filament is turnedOn");
  }
}

//higher level module
class Room{

  final Bulb bulb;

  Room({required this.bulb});


  void switchLightOn(){
    bulb.turnOn();
  }

  void switchLightOff(){
    bulb.turnOff();
  }

}

void main(){

  LED led = LED();
  Room room = Room(bulb: led);
  room.switchLightOn();
  room.switchLightOff();

  Filament filament = Filament();
  Room room1 = Room(bulb: filament);
  room1.switchLightOff();
  room1.switchLightOn();

}