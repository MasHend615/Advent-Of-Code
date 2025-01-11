package adventofcode.year_2015.day_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParserTest {
    @Test
    public void TestParse() {
        Parser p1 = new Parser("(()");
        assertEquals(p1.parse(), 1);
    }

    @Test
    public void TestBasement() {
        Parser p1 = new Parser("(()))((");
        assertEquals(p1.findBasement(), 5);
    }
}
