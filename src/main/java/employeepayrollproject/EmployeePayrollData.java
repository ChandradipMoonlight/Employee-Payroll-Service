package employeepayrollproject;

public class EmployeePayrollData {
    /**
     * this is an instance of the class.
     */
    public int id;
    public String name;
    public double salary;

    /**
     * this is parameterized constructor to initialize the instance of class.
     * @param id;
     * @param name;
     * @param salary;
     */
    public EmployeePayrollData (Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * this is method to print the EmployeePayrollDta
     * @return
     */
    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

