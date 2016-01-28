/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sunny
 */
public class StudentTest {

    public StudentTest() {
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

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "Dhruven";
        instance.setName("Dhruven");
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Dhruven";
        Student instance = new Student();
        instance.setName(name);

    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = "2834";
        instance.setId("2834");
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "2834";
        Student instance = new Student();
        instance.setId(id);

    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = "M";
        instance.setGender("M");
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "M";
        Student instance = new Student();
        instance.setGender(gender);

    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 4.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 4.0);

    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 4.0;
        Student instance = new Student();
        instance.setGrade(grade);

    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    @Test
    public void testEqualsWithSameNameAndId() {
        System.out.println("testEqualsWithSameNameAndId");
        boolean result = false;
        Student obj = new Student("Dhruven", "2834", "M", 0.0);
        Student instance = new Student("Dhruven", "2834", "M", 0.0);
        boolean expResult = true;
        if (instance.getName().equals(obj.getName()) && instance.getId().equals(obj.getId())) {

            result = true;
        }

        assertEquals(expResult, result);

    }

    @Test
    public void testEqualsWithSameNameAndDiffId() {
        System.out.println("testEqualsWithSameNameAndDiffId");
        boolean result = true;
        Student obj = new Student("Dhruven", "2834", "M", 0.0);
        Student instance = new Student("Dhruven", "1234", "M", 0.0);
        boolean expResult = false;
        if (instance.getName().equals(obj.getName()) && instance.getId() != obj.getId()) {

            result = false;
        }
        assertEquals(expResult, result);

    }

    @Test
    public void testEqualsWithDiffNameAndSameId() {
        System.out.println("testEqualsWithDiffNameAndSameId");
        boolean result = true;
        Student obj = new Student("Dhruven", "2834", "M", 0.0);
        Student instance = new Student("Sunny", "2834", "M", 0.0);
        boolean expResult = false;
        if (instance.getName() != obj.getName() && instance.getId() == obj.getId()) {

            result = false;
        }
        assertEquals(expResult, result);

    }

    @Test
    public void testEqualsWithDiffNameAndDiffId() {
        System.out.println("testEqualsWithDiffNameAndSameId");
        boolean result = true;
        Student obj = new Student("Dhruven", "2834", "M", 0.0);
        Student instance = new Student("Sunny", "1234", "M", 0.0);
        boolean expResult = false;
        if (instance.getName() != obj.getName() && instance.getId() != obj.getId()) {

            result = false;
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Dhruven","2834","M",4.0);
        String expResult = "{\"name\":\"" + instance.getName()  + "\",\"id\":\"" + instance.getId() + "\",\"gender\":\"" + instance.getGender() + "\",\"grade\":\"" + instance.getGrade() +"}";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    @Test
    public void testNoArgConstructor() {
        System.out.println("noArgConstructor");
        Student instance = new Student();
        String expResult = "{\"name\":\"" + instance.getName()  + "\",\"id\":\"" + instance.getId() + "\",\"gender\":\"" + instance.getGender() + "\",\"grade\":\"" + instance.getGrade() +"}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testFullArgConstructor() {
        System.out.println("fullArgConstructor");
        Student instance = new Student("Dhruven", "2834", "M", 4.0);
        String expResult = "{\"name\":\"" + instance.getName()  + "\",\"id\":\"" + instance.getId() + "\",\"gender\":\"" + instance.getGender() + "\",\"grade\":\"" + instance.getGrade() +"}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
