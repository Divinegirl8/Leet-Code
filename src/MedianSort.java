import java.util.Arrays;

public class MedianSort {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];

        for (int index = 0; index < nums1.length; index++) {
            arr[index] = nums1[index];
        }

        for (int index = 0; index < nums2.length; index++) {
            arr[nums1.length + index] = nums2[index];
        }
        System.out.println(Arrays.toString(arr));
        return 0.0;

    }

    public static void main(String[] args) {
        System.out.println(new MedianSort().findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(new MedianSort().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
