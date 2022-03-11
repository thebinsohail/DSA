package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student{

    private Long id;
    private String name;
    private Long batch;
    private String technology;

    public Student() {
    }

    public Student(Long id, String name, Long batch, String technology) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.technology = technology;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBatch() {
        return batch;
    }

    public void setBatch(Long batch) {
        this.batch = batch;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batch=" + batch +
                ", technology='" + technology + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        Student s1=new Student(1L,"Anas", 2019L,"SE");
        Student s2=new Student(5L,"Zubair", 2022L,"CE");
        Student s3=new Student(2L,"Sohail", 2021L,"EE");

        students.add(s1);
        students.add(s2);
        students.add(s3);


        //sort by name
        Collections.sort(students,new NameComparator());

        // Sort by id
        Collections.sort(students,new IdComparator());

        System.out.println(students);

    }


}


