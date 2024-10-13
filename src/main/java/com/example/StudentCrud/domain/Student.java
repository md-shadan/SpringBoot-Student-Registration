// package com.example.StudentCrud.domain;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
// public class Student {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private long id;

//     private String studentName;

//     private String course;

//     private int fee;

//     public Student(){
//         super();
//     }


//     public Student(Long id,String studentName,String course,int fee){
//         super();
//         this.id = id;
//         this.studentName = studentName;
//         this.course = course;
//         this.fee = fee;
//     }


//     // Getter  && Setter
//     public long getId(){
//         return this.id;
//     }
//     public void setId(long id){
//         this.id = id;
//     }

//     public String getName(){
//         return studentName;
//     }

//     public void setName(String name){
//         this.studentName = name;
//     }

//     public String getCourse(){
//         return course;
//     }

//     public void setCourse(String course){
//         this.course = course;
//     }

//     public int getFee(){
//         return fee;
//     }

//     public void setFee(int fee){
//         this.fee = fee;
//     }

    
// }


package com.example.StudentCrud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String studentName;

    private String course;

    private int fee;

    public Student() {
        super();
    }

    public Student(String studentName, String course, int fee) {
        super();
        this.studentName = studentName;
        this.course = course;
        this.fee = fee;
    }

    // Getter and Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
