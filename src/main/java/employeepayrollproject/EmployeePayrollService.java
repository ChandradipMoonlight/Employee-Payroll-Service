package employeepayrollproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this is main class EmployeePayrollService
 */
public class EmployeePayrollService {
    // Declaration of list employeePayrollList
    private List<EmployeePayrollData> employeePayrollList;

    // this is constructor to initialize employeePayrollList List.
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /**
     * this is main method to call the readEmployeePayrollData method and writeEmployeePayrollData
     * @param args;
     */
    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    /**
     * this is method to read employee data form console by using Scanner class
     * @param consoleInputReader;
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.print("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter the Employee Name: ");
        String name = consoleInputReader.next();
        System.out.print("Enter the Employee Salary: ");
        Double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * this is method to write employee data into console.
     */
    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n"+employeePayrollList);
    }
}
