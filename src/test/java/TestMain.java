import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMain {

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running Tests");
    }
    @AfterAll
    public static void completeSuite() {
        System.out.println("Tests complete");
    }

    @Test
    public void testEvenNumbersValidArgumentSuccess() {
        // given:
        int[] argument = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] expected = {2, 16, -2, 0, 32, 8, 4};

        // when:
        int[] result = Main.evenNumbers(argument);


        // then:
        Assertions.assertArrayEquals(expected, result);
        Assertions.assertNotEquals(expected,result);

    }

    @Test
    public void testPositivNumbersValidArgumentSuccess() {
        // given:
        int[] argument = {2, 16, -2, 0, 32, 8, 4};
        int[] expected = {2, 16, 32, 8, 4};

        // when:
        int[] result = Main.positivNumbers(argument);


        // then:
        Assertions.assertArrayEquals(expected, result);
        Assertions.assertFalse(expected.equals(result));

    }

    @Test
    public void sortBubbleValidArgumentSuccess() {
        // given:
        int[] argument = {2, 16, 32, 8, 4};
        int[] expected = {2, 4, 8, 16, 32};

        // when:
        int[] result = Main.sortBubble(argument);


        // then:
        Assertions.assertArrayEquals(expected, result);
    }
}
