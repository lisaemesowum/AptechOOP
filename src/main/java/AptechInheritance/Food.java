package AptechInheritance;

public class Food {
    public void Calories(){
        System.out.println("Calories provide the energy needed to perform daily activities like walking,");
    }
    public static void  main( String[] args){
        Food f = new Food();
        Food o = new Pizza();
        Food EF = new EggsFish();

        f.Calories();
        o.Calories();
        EF.Calories();

    }
}
