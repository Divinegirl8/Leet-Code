import java.util.ArrayList;
import  java.util.Arrays;

public class MoveZeros {
    public void moveZeros(int[] nums){
        ArrayList<Integer> move = new ArrayList<>();

        for (int num : nums) {
            if (num != 0) {
                move.add(num);
            }
        }

        for (int num : nums) {
            if (num == 0) {
                move.add(num);
            }
        }
        System.out.print(move);
    }

    public static void main(String[] args) {
        new MoveZeros().moveZeros(new int[]{0,1,0,3,12});
    }
}
