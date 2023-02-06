public class Main {
    public static void main(String[] args) {


        EmployeeRecord employeeRecord = new EmployeeRecord("RecordEmployee", 221231);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord);

        Employee employee = new Employee("ClassEmployee", 312423);
        System.out.println(employee.getName());
        System.out.println(employee);
    }
}