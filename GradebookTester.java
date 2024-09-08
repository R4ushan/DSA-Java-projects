import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
    
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        
        // Adding scores to the GradeBooks
        g1.addScore(50);
        g1.addScore(75);

        g2.addScore(100);
        g2.addScore(85);
    }

    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }


    @Test
    public void testAddScore() {
    // Testing addScore for g1
        assertEquals("GradeBook with 2 scores: [50.0, 75.0, 0.0, 0.0, 0.0]", g1.toString());
        assertEquals(2, g1.getScoresSize());

    // Testing addScore for g2
        assertEquals("GradeBook with 2 scores: [100.0, 85.0, 0.0, 0.0, 0.0]", g2.toString());
        assertEquals(2, g2.getScoresSize());
    }


    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.0001);
        assertEquals(185.0, g2.sum(), 0.0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.001);
        assertEquals(85.0, g2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.0001); 
        assertEquals(100.0, g2.finalScore(), 0.0001); 
    }
}
