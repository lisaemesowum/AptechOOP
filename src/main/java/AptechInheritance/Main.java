package AptechInheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//==================================================================================================================================================================================

//for inheritance vehicle
        Car1 car = new Car1();
//        car.stop();
        Bicycle bike = new Bicycle();
//        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);

//=====================================================================================================================================================================================================

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.speak();
        dog.speak();

//   grandparent and parent with child
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

plant Plant = new plant();
Plant.photosynthesize();






    }




}