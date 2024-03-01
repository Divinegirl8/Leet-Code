
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test void testCaseOne(){
        TwoSum sum = new TwoSum();
        int[] number = {2,7,11,15};
        int[] expected = {0,1};
        assertArrayEquals(sum.twoSum(number,9),expected);

    }

}