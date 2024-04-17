import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MedianTwoArrayTest {
    @Test void testOne(){
        MedianTwoArray medianTwoArray = new MedianTwoArray();
      int[] nums1 = {1,3}, nums2 = {2};
      int expected = 2;
      assertEquals(expected,medianTwoArray.findMedianSortedArrays(nums1,nums2));

    }


}