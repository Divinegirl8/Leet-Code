public class ScoreOfAString {
    public int scoreOfString(String s) {
        int total = 0;
        for (int index = 0; index < s.length()-1; index++) {
            int first = s.charAt(index);
            int second = s.charAt(index+1);

            int result = (first - second);
            if (result < 0){
                result *= -1;
            }


            total += result;

        }
        return total;
    }

}
