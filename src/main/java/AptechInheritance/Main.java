package AptechInheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Students stud1 = new Students("1", "Adebayo", "Micheal", 12, "10101234", Department.BackEnd);
//
//        System.out.println(stud1.studentDetail());
//
////        Manager manager1 = new Manager();
//        String[] team = {"Amarachi", "lisa"};
//
//        Manager manager1 = new Manager("M01", "John", "Smith", 40, team);
//        System.out.println(manager1.managerDetails());
//
//        // Later, use setter to update team
//        String[] newTeam = {"Alice", "Bob", "Charlie", "Diana"};
//        manager1.setTeamName(newTeam);
//
//        System.out.println("\nAfter update:");
//       System.out.println(manager1.managerDetails());
//====================================================================================================================================================================================

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