package AptechInheritance;

public class AbsctractionDoctor  extends AbstractionHealthCare{

    public AbsctractionDoctor(String name, String staffId){
        super(name, staffId);
    }
    @Override
    public void performDuties() {
        System.out.println("Doctor treating paterients and writing perscription");
    }

}
