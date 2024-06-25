import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Candy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandy){
        List<Boolean> value = new ArrayList<>();
        int max = getMax(candies);
        int[] summed = sumElements(candies,extraCandy);

        for(int val : summed){
            if(val >= max){
                value.add(true);
            }
            else {
                value.add(false);
            }

        }
        return value;

    }
    public static int getMax(int[] nums){
        int max = 0;

        for(int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static int[] sumElements(int[] candies, int extraCandy){
        int count = 0;
        for (int candy : candies){
            candies[count] = candy + extraCandy;
            count++;
        }
        return candies;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(new List[]{kidsWithCandies(new int[]{2,3,5,1,3}, 3)}));
    }
}
