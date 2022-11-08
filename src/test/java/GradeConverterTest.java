import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter=new GradeConverter();
    }

    @Test
    public void testconvert1() {
        String expect="A";
        String actual = converter.convert(100);
        assertEquals(expect,actual);
    }
    @Test
    public void testconvert2() {
        String expect="A";
        String actual = converter.convert(90);
        assertEquals(expect,actual);
    }
}