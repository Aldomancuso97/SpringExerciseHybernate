package co.develhope.Spring.Entities;

import javax.persistence.*;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue
    private String Id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private Class classes;


}
