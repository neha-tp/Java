package employee;

public class Employee
{
    public String empName, empId, address, mailId, mobileNo;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo)
    {
        this.empName=empName;
        this.empId=empId;
        this.address=address;
        this.mailId=mailId;
        this.mobileNo=mobileNo;
    }

    public void display()
    {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}