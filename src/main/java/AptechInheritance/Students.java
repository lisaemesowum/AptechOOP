package AptechInheritance;

//inheritance
public class Students  extends  Employees{

    private final Department dept;

    private String studentNo;


    public Students(String id, String firstName, String lastName, int age, String studentNo, Department dept) {
        super(id, firstName, lastName, age);
        this.studentNo = studentNo;
        this.dept = dept;
    }
    public String studentDetail() {
        return super.personInfo() +
                "\nstudentNo: " + studentNo +
                "\nDepartment: " + dept;
    }
}
