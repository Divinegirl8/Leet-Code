import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    @Test void testOne(){
        int expected = 2;
        int[] input = {1,1,2};

        assertEquals(expected,RemoveDuplicate.removeDuplicates(input));
    }

}