public class Employee {

    private final String name;
    private final int employeeNo;

    public Employee(String name, int age) {
        this.name = name;
        this.employeeNo = age;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNo=" + employeeNo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
