package AptechInheritance;

public abstract class AbstractionHealthCare {
    //Abstraction

    //These are private instance variables:
    private String name;
    private String StaffId;

    //This is a constructor
    public AbstractionHealthCare(String name, String staffId) {
        this.name = name;
        this.StaffId = staffId;
    }

//    abstract method:
//It has no body, just a declaration.
    public abstract void performDuties();

    public void clockin(){
        System.out.println(name + "clocked in");
    }
    public String getStaffId(){
        return  StaffId;
    }
}
