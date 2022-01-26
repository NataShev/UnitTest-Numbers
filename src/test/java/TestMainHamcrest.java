import com.sun.jdi.ArrayReference;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;


public class TestMainHamcrest {


    @Test
    public void containsSimply() {

        int[] array = {2, 16, -2, 0, 32, 8, 4};

        assertThat(array,arrayContaining(2,16,-2,0,32,8,4));




    }



    @Test
    public void testPositivNumbersValidArgumentSuccess() {


    @Test
    public void sortBubbleValidArgumentSuccess() {

}
