import java.util.Objects;

public class LastWord {
    public int lengthOfLastWord(String s){
        String[] splitWord = s.trim().split(" ");


        return splitWord[splitWord.length-1].length();
    }



    public static void main(String[] args) {
        System.out.println(new LastWord().lengthOfLastWord("Hello World"));


    }
}
