import java.util.Arrays;

public class MedianTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
return 0.0;
    }

    private static  int[] joinArray(int[] nums1, int[] nums2){
        int[] newValue= new int[nums1.length + nums2.length];

        int length = 0;

        if (nums1.length > nums2.length){
            length = nums1.length;
        }else {
            length = nums2.length;
        }

        for (int index = 0; index < length; index++) {
            if(index < nums1.length){
            newValue[index] = nums1[index];}
            if (index < nums2.length){
            newValue[index] = nums2[index];}
        }

   return newValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(Arrays.toString(joinArray(nums1,nums2)));
    }
}
