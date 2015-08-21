package test.java;

import main.java.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
	private static Person person;

	@BeforeClass
	public static void initPerson() {
        person = new Person();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}



    @Test
    public void testSetName() {
        person.setName("Mike");
        String name = person.getName();

        assertEquals("Mike", name);
    }


    @Test
    public void testSetAge() {
        person.setAge(32);
        int age = person.getAge();

        assertEquals(32, age);
    }


}