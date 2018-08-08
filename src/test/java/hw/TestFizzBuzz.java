 package hw;

 import static org.junit.Assert.*;

 import org.junit.After;
 import org.junit.Before;
 import org.junit.Test;

 import java.util.ArrayList;
 import java.util.List;


import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

    private FizzBuzz fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FizzBuzz();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    /* All Test cases results which have been asked to test the program logic */

    @Test
    public void testNegativeTen() {
        List<String> expectedVals = new ArrayList<String>();
        expectedVals.add("You must enter a positive integer > 0");
        assertEquals(expectedVals, fixture.fizzBuzzList(-10));
    }

    @Test
    public void testNegativeOne() {
        List<String> expectedVals = new ArrayList<String>();
        expectedVals.add("You must enter a positive integer > 0");
        assertEquals(expectedVals, fixture.fizzBuzzList(-1));
    }

    @Test
    public void testZero() {
        List<String> expectedVals = new ArrayList<String>();
        expectedVals.add("You must enter a positive integer > 0");
        assertEquals(expectedVals, fixture.fizzBuzzList(0));
    }

    @Test
    public void testOne() {
        List<String> expectedVals = new ArrayList<String>();
        assertEquals(expectedVals, fixture.fizzBuzzList(1));
    }

    @Test
    public void testSeven() {
        List<String> expectedVals = new ArrayList<String>();
        expectedVals.add("1");
        expectedVals.add("2");
        expectedVals.add("fizz");
        expectedVals.add("4");
        expectedVals.add("buzz");
        expectedVals.add("fizz");
        assertEquals(expectedVals, fixture.fizzBuzzList(7));
    }

    @Test
    public void testSeventeen() {
        List<String> expectedVals = new ArrayList<String>();
        expectedVals.add("1");
        expectedVals.add("2");
        expectedVals.add("fizz");
        expectedVals.add("4");
        expectedVals.add("buzz");
        expectedVals.add("fizz");
        expectedVals.add("7");
        expectedVals.add("8");
        expectedVals.add("fizz");
        expectedVals.add("buzz");
        expectedVals.add("11");
        expectedVals.add("fizz");
        expectedVals.add("13");
        expectedVals.add("14");
        expectedVals.add("fizz buzz");
        expectedVals.add("16");
        assertEquals(expectedVals, fixture.fizzBuzzList(17));
    }
}