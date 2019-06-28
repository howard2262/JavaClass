package JavaDB;

import java.util.Date;

public class NewEmployee {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private float salary;

    public NewEmployee(int id, String firstName, String lastName, Date birthDate, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "NewEmployee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", salary=" + salary + '}';
    }

    }


