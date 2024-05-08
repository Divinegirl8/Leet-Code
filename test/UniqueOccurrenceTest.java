import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOccurrenceTest {
    @Test void testOne(){
        int[] numbers = {1,2,2,1,1,3};
        assertTrue(new UniqueOccurrence().uniqueOccurrence(numbers));
    }

    @Test void testTwo(){
        int[] numbers = {1,2,3};
        assertFalse(new UniqueOccurrence().uniqueOccurrence(numbers));
    }

    @Test void testThree(){
        int[] numbers = {1,2,3,2};
        assertFalse(new UniqueOccurrence().uniqueOccurrence(numbers));
    }

    @Test void testFour(){
        int[] numbers = {-3,0,1,-3,1,1,1,-3,10,0};
        assertTrue(new UniqueOccurrence().uniqueOccurrence(numbers));
    }

    @Test void testFive(){
        int[] numbers = {3,5,-2,-3,-6,-6};
        assertFalse(new UniqueOccurrence().uniqueOccurrence(numbers));
    }


}