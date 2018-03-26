package oracledb.connection.dto;

public class Employee {

    private String payRollNumber;
    private String firstName;
    private String lastName;
    private String department;

    public String getPayRollNumber() {
        return payRollNumber;
    }

    public void setPayRollNumber(String payRollNumber) {
        this.payRollNumber = payRollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "\n Roll No: " + payRollNumber + "\n Firstname :" + firstName + "\n Lastname : " + lastName + "\n Dept : " + department;
    }
}
