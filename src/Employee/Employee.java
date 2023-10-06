package Employee;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private int salary;
    private String company;
    private String position;

    public Employee(String name, String employeeID, int salary, String company, String position) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee(String name) {
        this.name = name;

    }


    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getEmployeeID() {

        return employeeID;
    }

    public void setEmployeeID(String employeeID) {

        this.employeeID = employeeID;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public String getPosition() {

        return position;
    }

    public void setPosition(String position) {

        this.position = position;
    }
}
