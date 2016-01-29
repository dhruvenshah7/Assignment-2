/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javafx.print.Collation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0664589
 */
public class CourseTest {

    List<Student> st = new ArrayList<Student>();
    Student s = new Student("Nirat Joshi", "c0664589", "M", 3.05);

    public CourseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAllWithNoArg() {

        System.out.println("testGetAllWithNoArg");
        Course instance = new Course();
        List<Student> expRes = new ArrayList<Student>();
        List<Student> result = instance.getAll();
        assertEquals(expRes, result);

    }

    @Test
    public void testGetAllWithArg() {

        System.out.println("testGetAllWithArg");
        Course instance = new Course(st);
        List<Student> expRes = st;
        List<Student> result = instance.getAll();
        assertEquals(expRes, result);

    }

    /**
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("testAdd");
        Course instance = new Course();
        instance.add(s);
        st.add(s);
        List<Student> expRes = st;
        assertEquals(expRes, instance.getAll());
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Course instance = new Course(st);
        instance.remove(s);
        st.remove(s);
        List<Student> expRes = st;
        assertEquals(st, instance.getAll());

    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("removeIDString");
        Course instance = new Course(st);
        String id = "c0664589";
        st.add(s);
        instance.remove(id);
        boolean found = instance.getAll().contains(s);
        assertFalse(found);
        //assertEquals(st, instance.getAll());

    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("removeInt");

        Course instance = new Course(st);
        int position = 0;
        st.add(s);
        instance.remove(position);
        boolean found = instance.getAll().contains(s);
        assertFalse(found);
//        assertEquals(st, instance.getAll());

    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
//        Student student = null;

        int position = 0;
        Course instance = new Course(st);
        instance.insert(s, position);

        boolean found = instance.getAll().contains(s);
        assertTrue(found);

    }

    @Test
    public void testGet() {

        System.out.println("get");

        Course instance = new Course(st);
        String id = "c0664589";
        st.add(s);

        Student expRes = s;

        Student result = instance.get(id);
        assertEquals(expRes, result);
    }

    @Test
    public void testGetWithInvalidID() {

        System.out.println("testGetWithInvalidID");

        Course instance = new Course(st);

        String id = "c0662834";
        st.add(s);

        Student expRes = null;

        Student result = instance.get(id);
        assertEquals(expRes, result);
    }

    @Test
    public void testGetPosition() {

        System.out.println("GetPosition");

        Course instance = new Course(st);

        int position = 0;

        st.add(s);

        Student expRes = s;

        Student result = instance.get(position);
        assertEquals(expRes, result);
    }

    @Test
    public void testGetWithInvalidPos() {

        System.out.println("testGetWithInvalidPos");

        Course instance = new Course(st);

        st.add(s);

        int position = 2;
        Student expResult = null;

        Student result = instance.get(position);

        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGetWithLessThanZeroPos() {
        System.out.println("getWithLessThanZeroPos");

        Course instance = new Course(st);
        st.add(s);

        int position = -1;

        Student expResult = null;

        Student result = instance.get(position);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course(st);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        ;
    }

    @Test
    public void testEqualsWithSameList() {
        System.out.println("testEqualsWithSameList");

        st.add(s);

        Course instance = new Course(st);

        Course c = new Course(st);

        boolean expResult = true;

        boolean result = instance.equals(c);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsWithDiffList() {
        System.out.println("testEqualsWithDiffList");

        st.add(s);
        st.add(new Student("Rohan", "1234", "M", 2.0));
        Course instance = new Course(st);

        List<Student> st1 = new ArrayList<Student>();

        st1.add(new Student("Dhruv", "2834", "M", 4.0));

        Course c = new Course(st1);

        boolean expResult = true;

        boolean result = instance.equals(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        st.add(s);
        Course instance = new Course(st);
        String expResult = "Course{students=[{\"name\":\"Nirat Joshi\",\"id\":\"c0664589\",\"gender\":\"M\",\"grade\":\"3.05}]}";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");

        st.add(s);
        Student s1 = new Student("Rohan", "1234", "M", 2.0);
        st.add(s1);

        String gender = "M";
        Course instance = new Course(st);

        Set<Student> expResult = new HashSet<Student>();
        expResult.add(s);
        expResult.add(s1);

        String exp = "[Course{students=[{\"name\":\"Nirat Joshi\",\"id\":\"c0664589\",\"gender\":\"M\",\"grade\":\"3.05}, {\"name\":\"Rohan\",\"id\":\"1234\",\"gender\":\"M\",\"grade\":\"2.0}]}]";

        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(exp, result.toString());

    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        st.add(s);
        Student s1 = new Student("Rohan", "1234", "M", 2.0);
        st.add(s1);
        
        Course instance = new Course(st);
        
        Map<String, Set<Student>> expResult = new TreeMap<>();
        Set<Student> stuSet = new HashSet<Student>();
        stuSet.add(st.get(0));
        expResult.put("A", stuSet);
        Map<String, Set<Student>> result = instance.getGradeMap();
        assertEquals(expResult, result);

    }

}
