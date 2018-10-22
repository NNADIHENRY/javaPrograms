class Mammal {
void getBirthInfo() {
System.out.println("born alive.");
}
}
class Platypus extends Mammal {
void getBirthInfo() {
System.out.println("hatch from eggs");
System.out.print("a mammal normally is");
super.getBirthInfo();
}
}
