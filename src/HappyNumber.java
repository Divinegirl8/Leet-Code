public class HappyNumber {
    public boolean isHappy(int n) {
        String convert = String.valueOf(n);
        int total = 0;


            for (int index = 0; index < convert.length(); index++) {
                String element = String.valueOf(convert.charAt(index));
                System.out.println(element);
                int result = Integer.parseInt(element);


                total += (int) Math.pow(result, 2);

                element = String.valueOf(total);
                System.out.println(element);

            }
            System.out.println(total);
            return true;
        }

    public static void main(String[] args) {
        new HappyNumber().isHappy(19);
    }
}
