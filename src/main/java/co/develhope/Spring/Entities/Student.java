package co.develhope.Spring.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue
    private int ID;
    @Column(name = "students_name", nullable = false)
    private String firstName;
    @Column(name = "students_lastName", nullable = false)
    private String lastName;
    @Column(name = "students_email",nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollmentList;

    public Student() {
    }

    public Student(int ID, String firstName, String lastName, String email) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
