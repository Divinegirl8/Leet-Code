import java.util.Arrays;

public class MergeArray {
public int[] merge(int[] nums1,int m,int[] nums2, int n){
    int count = 0;
    for (int index = m; index < nums1.length; index++) {
        nums1[index] = nums2[count];
        count++;
    }
    Arrays.sort(nums1);
    return nums1;
//    System.out.println(Arrays.toString(nums1));
}

    public static void main(String[] args) {
int[] nums1 = {1,2,3,0,0,0};
int m =3;
int[] nums2 = {2,5,6};
int n =3;
new MergeArray().merge(nums1,m,nums2,n);
    }
}
