package co.develhope.Spring.Entities;

import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue
    private long Id;

    @Column(name = "Student_name", nullable = false)
    private String firstName;

    @Column(name = "Student_lastName", nullable = false)
    private String lastName;

    @Column(name = "Student_email", unique = true)
    private String email;



}
