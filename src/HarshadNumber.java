public class HarshadNumber {

    public static void main(String[] args) {
        int x = 100;
        String newV = String.valueOf(x);
         int total = 0;

    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String newV = String.valueOf(x);
        int total = 0;
        for (int index = 0; index < newV.length(); index++) {
            String value = String.valueOf(newV.charAt(index));
            total += Integer.parseInt(value);
        }
        return checkDivisibility(x,total);
    }

    public static int checkDivisibility(int value,int divisor){
        if (value % divisor == 0){
            return value;
        }
        return -1;
    }
}
