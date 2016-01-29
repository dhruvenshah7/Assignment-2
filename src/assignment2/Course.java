/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
        for (i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
            }
        }

    }

    public void remove(int position) {

        students.remove(position);

    }

    public void insert(Student student, int position) {

        students.add(position, student);

    }

    public Student get(String id) {

        int i;
        for (i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return students.get(i);
            }

        }
        return null;

    }

    public Student get(int position) {

        if (position >= students.size() || position < 0) {
            return null;
        }
        return students.get(position);

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
        return "Course{" + "students=" + students + '}';
    }

    public Set<Student> getAllByGender(String gender) {

        Set<Student> stuSet = new HashSet<Student>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender().equals(gender)) {
                stuSet.add(this);
            }

        }
        return stuSet;

    }

    public Map<String, Set<Student>> getGradeMap() {

        Map<String, Set<Student>> m = new HashMap<String, Set<Student>>();

        Set<Student> stuSetF = new HashSet<Student>();
        Set<Student> stuSetC = new HashSet<Student>();
        Set<Student> stuSetB = new HashSet<Student>();
        Set<Student> stuSetA = new HashSet<Student>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGrade() < 1) {
                stuSetF.add(this);
            }
            if (students.get(i).getGrade() >=1 && students.get(i).getGrade() < 2) {
                stuSetC.add(this);
            }
            if (students.get(i).getGrade() >=2 && students.get(i).getGrade() < 3) {
                stuSetB.add(this);
            }
            if (students.get(i).getGrade() >=3 && students.get(i).getGrade() <= 4) {
                stuSetA.add(this);
            }
        }
        
        m.put("A", stuSetA);
        m.put("B", stuSetB);
        m.put("C", stuSetC);
        m.put("F", stuSetF);
                
        return m;

    }
}
