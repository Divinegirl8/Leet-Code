public class Iteration {
    public static void main(String[] args) {
//        for (int index = 1; index <= 10; index++) {
//            System.out.println("index " + index);
//            for (int jj = 1; jj <= index; jj++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
int count = 0;

           for (int index = 1; index <= 10; index++) {

        for (int jj = 1; jj <= index; jj+=1) {
            int number = (int) Math.pow(jj,count++);

                 System.out.print(number + " ");}


               System.out.println();
           }
}
}
