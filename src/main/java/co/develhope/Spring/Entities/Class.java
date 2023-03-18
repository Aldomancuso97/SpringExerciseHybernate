package co.develhope.Spring.Entities;


import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Class {

    @Id
    @GeneratedValue
    @Column(name = "id_class")
    private long Id;



    @Column(name = "Class_title", nullable = false)
    private String title;
    @Column(name = "Class_description",nullable = false)
    private String description;

    @OneToMany(mappedBy = "class")
    List<Enrollment> enrollmentList;

    public Class() {
    }

    public Class(long id, String title, String description, List<Enrollment> enrollmentList) {
        Id = id;
        this.title = title;
        this.description = description;
        this.enrollmentList = enrollmentList;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void setEnrollmentList(List<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }
}
