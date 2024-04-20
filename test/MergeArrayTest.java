import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeArrayTest {

    @Test void testOne(){
        MergeArray mergeArray = new MergeArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m =3;
        int[] nums2 = {2,5,6};
        int n =3;
        int[] result = {1, 2, 2, 3, 5, 6};

        assertArrayEquals(result,mergeArray.merge(nums1,m,nums2,n));
    }

    @Test void testTwo(){
        MergeArray mergeArray = new MergeArray();
        int[] nums1 = {1};
        int m =1;
        int[] nums2 = {};
        int n =0;
        int[] result = {1};

        assertArrayEquals(result,mergeArray.merge(nums1,m,nums2,n));
    }

    @Test void testThree(){
        MergeArray mergeArray = new MergeArray();
        int[] nums1 = {0};
        int m =0;
        int[] nums2 = {1};
        int n =1;
        int[] result = {1};

        assertArrayEquals(result,mergeArray.merge(nums1,m,nums2,n));
    }

    @Test void testFour(){
        MergeArray mergeArray = new MergeArray();
        int[] nums1 = {};
        int m =0;
        int[] nums2 = {};
        int n =0;
        int[] result = {};

        assertArrayEquals(result,mergeArray.merge(nums1,m,nums2,n));
    }
}