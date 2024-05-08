public class SwapNumbers {

//    public static void main(String[] args) {
//        int[] numbers = {2, 4, 5, 6};
//
//        for (int i = 0; i < numbers.length - 1; i += 2) {
//            int temp = numbers[i];
//            numbers[i] = numbers[i + 1];
//            numbers[i + 1] = temp;
//        }
//
//
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6};

        for (int i = 0; i < numbers.length; i += 2) {

            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }


        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
