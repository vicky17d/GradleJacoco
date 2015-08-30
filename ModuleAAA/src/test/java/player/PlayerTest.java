package player;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
	private static Player player;

	@BeforeClass
	public static void initPlayer() {
        player = new Player();
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
        player.setName("Mike");
        String name = player.getName();

        assertEquals("Mike", name);
    }


    @Test
    public void testSetAge() {
        player.setAge(32);
        int age = player.getAge();

        assertEquals(32, age);
    }


}