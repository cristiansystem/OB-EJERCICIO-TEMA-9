public class Employee extends Person {
    long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void employeeInformation() {
        System.out.println("Name: " + this.name );
        System.out.println("Age: " + this.age );
        System.out.println("Phone: " + this.phone );
        System.out.println("Salary: " + this.salary );
    }
}
