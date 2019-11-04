public class Employee {

    private int id;
    private String firsName;
    private String lastName;
    private int salary;


    public Employee(int id, String firsName, String lastName, int salary){
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firsName + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary + (salary * percent/100);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "Annual Salary=" + getAnnualSalary() + ", Salary Raise=" + raiseSalary(10);
    }
}
