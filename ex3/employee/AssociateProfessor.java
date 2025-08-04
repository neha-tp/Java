package employee;

public class AssociateProfessor extends Employee
{
    double bPay;
    String des="AssociateProfessor";

    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double bPay)
    {
        super(empName, empId , address, mailId, mobileNo);
        this.bPay=bPay;
    }

    public void paySlip()
    {
        double da=0.97*bPay;
        double hra=0.10*bPay;
        double pf=0.12*bPay;
        double staffClub=0.001*bPay;

        double gross=bPay+da+hra;
        double net=gross-pf-staffClub;

        display();
        System.out.println("Designation: " + des);
        System.out.println("Basic Pay: " + bPay);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}
