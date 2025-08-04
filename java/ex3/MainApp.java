import employee.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        try
        {
            LoggerSetup.setupLogger();
            Scanner sc=new Scanner(System.in);

            ArrayList<Employee> employees=new ArrayList<>();

            System.out.print("Enter number of employees: ");
            int n=Integer.parseInt(LoggerSetup.nextLineAndLog(sc));

            for(int i=0; i<n; i++)
            {
                System.out.println("\nEnter details for Employee " + (i + 1));
                System.out.print("Name: ");
                String name = LoggerSetup.nextLineAndLog(sc);

                System.out.print("ID: ");
                String id = LoggerSetup.nextLineAndLog(sc);

                System.out.print("Address: ");
                String address = LoggerSetup.nextLineAndLog(sc);

                System.out.print("Mail ID: ");
                String mail = LoggerSetup.nextLineAndLog(sc);

                System.out.print("Mobile No: ");
                String phone = LoggerSetup.nextLineAndLog(sc);

                System.out.println("Choose Designation: ");
                System.out.println("1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor");
                int choice = Integer.parseInt(LoggerSetup.nextLineAndLog(sc));

                System.out.print("Enter Basic Pay: ");
                double bPay = Double.parseDouble(LoggerSetup.nextLineAndLog(sc));

                Employee emp;
                switch(choice)
                {
                    case 1:
                        emp = new Programmer(name, id, address, mail, phone, bPay);
                        break;
                    case 2:
                        emp = new AssistantProfessor(name, id, address, mail, phone, bPay);
                        break;
                    case 3:
                        emp = new AssociateProfessor(name, id, address, mail, phone, bPay);
                        break;
                    case 4:
                        emp = new Professor(name, id, address, mail, phone, bPay);
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Programmer.");
                        emp = new Programmer(name, id, address, mail, phone, bPay);
                }

                employees.add(emp);
            }

            for(Employee e: employees)
            {
                if (e instanceof Programmer) ((Programmer) e).paySlip();
                else if (e instanceof AssistantProfessor) ((AssistantProfessor) e).paySlip();
                else if (e instanceof AssociateProfessor) ((AssociateProfessor) e).paySlip();
                else if (e instanceof Professor) ((Professor) e).paySlip();
                System.out.println("--------------------------------------------------");
            }

            sc.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}