package AptechInheritance;

public class AbsctractionNurse extends AbstractionHealthCare{

    public AbsctractionNurse(String name, String staffId) {
        super(name, staffId);
    }
    @Override
    public void performDuties(){
        System.out.println("nurse assisting");
    }
}
