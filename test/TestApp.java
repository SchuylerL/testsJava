import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class TestApp {
    static File file;
    static FileWriter w;
    static Scanner s;

    @Before
    public void beforeEachTest() throws IOException {
        file = new File("test.txt");
        w = new FileWriter("test.txt");
        s = new Scanner(file);
    }

    @Test
    public void test1() throws IOException {
        w.write("Testing testing 1 2 3!");
        w.close();

        assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));
    }

    @Test
    public void test2() throws IOException {
        w.write("Writing 4 5 6!");
        w.close();

        assertThat(s.nextLine(), equalTo("Writing 4 5 6!"));
    }

    @After
    public void afterEachTest() throws IOException {
        s.close();
    }

    /* Tests for the App.java file's methods */

    // test String, static
    @Test
    public void testWord() {
        assertThat(App.word(), equalTo("test"));
    }

    App ap = new App();

    // test int
    @Test
    public void testNum() {
        assertThat(ap.num(), equalTo(3));
    }

    // test double
    @Test
    public void testNumEquals() {
        assertEquals(2, ap.numEquals());
    }

    // test assertArrayEquals and assertTrue
    @Test
    public void testArr() {
        assertTrue(Arrays.equals(new int[] { 5, 2, 7, 9 }, ap.numArr()));
        assertArrayEquals(new int[] { 5, 2, 7, 9 }, ap.numArr());
    }

    /*
     * Random number 1 or 0 each time program runs
     * Test passes if integer is one and outputs heads,
     * Passes if zero, exception handled as error, outputs tails
     */
    @Test
    public void testRandNum() {
        try {
            assertThat(App.randnum(), equalTo(1));
            System.out.println("heads");
        } catch (AssertionError e) {
            System.err.println("tails, error " + e);
        }
    }
}
