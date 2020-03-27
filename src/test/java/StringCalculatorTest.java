import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void addTest() {
    StringCalculator scd = new StringCalculator();
        Assert.assertEquals(3, scd.add("1,2"));
        Assert.assertEquals(5,scd.add("3\n2"));
        Assert.assertEquals(6,scd.add("1000,\n3,1,1"));
        Assert.assertEquals(7,scd.add("//[abc][777][:(]\\n1abc27773:(1"));
    }

}

