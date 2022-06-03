public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Jhon Doe");
        customer.setAge(23);
        customer.setPhone(66584879);
        customer.setCredit(12000);
        customer.customerInformation();
        System.out.println("::::::::::::::::::::::");
        Employee employee = new Employee();
        employee.setName("William Runny");
        employee.setAge(27);
        employee.setPhone(195487452);
        employee.setSalary(2000);
        employee.employeeInformation();
    }
}