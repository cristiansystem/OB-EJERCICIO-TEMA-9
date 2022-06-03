public class Customer extends Person {
    long credit;

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public void customerInformation() {
        System.out.println("Name: " + this.name );
        System.out.println("Age: " + this.age );
        System.out.println("Phone: " + this.phone );
        System.out.println("Credit: " + this.credit );
    }
}
