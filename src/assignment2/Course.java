/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0664020
 */
public class Course extends Student {

    List<Student> students = new ArrayList<Student>();

    public Course() {
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void add(Student student) {

        students.add(student);

    }

    public void remove(Student student) {

        students.remove(student);

    }

    public void remove(String id) {

        int i;
        for (i = 0; i < students.size(); i++)
            if (students.get(i).getId().equals(id))
                students.remove(i);

    }

    public void remove(int position) {

    }

    public void insert(Student student, int position) {

    }

    public Student get(String id) {

        return null;

    }

    public Student get(int position) {
        return null;

    }

    public List<Student> getAll() {
        return students;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + '}';
    }

    public Set<Student> getAllByGender(String gender) {
        return null;

    }

    public Map<String, Set<Student>> getGradeMap() {
        return null;

    }
}
