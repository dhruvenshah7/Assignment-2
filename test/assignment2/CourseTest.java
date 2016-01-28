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
        System.out.println("remove");
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
        System.out.println("remove");
        int position = 0;
        Course instance = new Course(st);
        instance.remove(position);
        assertEquals(st, instance.getAll());

    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
//        Student student = null;
        int position = 0;
        Course instance = new Course();
        instance.insert(s, position);
        assertEquals(st, instance.getAll());

    }

    @Test
    public void testGet() {

        System.out.println("get");
        Course instance = new Course(st);
        String id = "c0664589";
        List<Student> expRes = st;
        List<Student> result = instance.getAll();
        assertEquals(expRes, result);
    }

    @Test
    public void testGetPosition() {

        System.out.println("GetPosition");

        Student s = new Student();
        Course instance = new Course(st);

        String expResult = null;

        int pos = 1;
        if (pos >= st.size() || pos <= st.size()) {
            s = instance.get(pos);

        }
        assertEquals(expResult, s);
    }

    @Test
    public void testGetValidID() {

        System.out.println("getValidID");

        Course instance = new Course(st);
        List<Student> result = new ArrayList<Student>();;
        List<Student> expResult = instance.getAll();

        int pos = 1;

        if (st.contains(s)) {
            result = instance.getAll();

        }
        assertEquals(expResult, result);
    }

    @Test
    public void testGetInValidID() {

        System.out.println("GetInvalidID");
        Course instance = new Course(st);
        List<Student> result2 = new ArrayList<Student>();

        String result = "Z123";
        List<Student> expResult = null;

        if (st.contains(result)) {

        } else {
            result2 = null;
        }
        assertEquals(expResult, result2);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String id = "";
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(id);
        assertEquals(expResult, result);

    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        Course instance = new Course();
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
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        ;
    }

    @Test
    public void testEqualsWithArgConstructor() {
        System.out.println("equals");

        boolean expResult = true;
        boolean result = false;

        Student s3 = new Student("Mihir", "c0665280", "M", 3.54);
        List<Student> s1 = new ArrayList<Student>();
        s3.setName("Mihir");
        s3.setId("2834");
        s3.setGender("M");
        s3.setGrade(4.0);
        s1.add(s3);

        Course c1 = new Course(s1);
        Course c2 = new Course(s1);

        if (c1.equals(c2)) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course(st);
        String expResult = "[\n" + "\t{ \"name\" : \"Nirat Joshi\", \"id\" : \"c0664589\", \"gender\" : \"M\", \"grade\" : 3.05 }" + "\n]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        String gender = "M";
        Course instance = new Course(st);
        Set<Student> expResult = new HashSet<Student>();
        expResult.add(s);
        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(expResult, result);

    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        Course instance = new Course(st);
        Map<String, Set<Student>> expResult = new TreeMap<>();
        Set<Student> stuSet = new HashSet<Student>();
        stuSet.add(st.get(0));
        expResult.put("A", stuSet);
        Map<String, Set<Student>> result = instance.getGradeMap();
        assertEquals(expResult, result);

    }

}
