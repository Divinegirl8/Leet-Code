public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder val = new StringBuilder();
        int len = Math.max(word1.length(), word2.length());

        for (int index = 0; index < len; index++) {
            if(index < word1.length()){
                val.append(word1.charAt(index));}
            if(index < word2.length()){
                val.append(word2.charAt(index));}
        }
        return val.toString();
    }

    public static void main(String[] args) {
        System.out.println(new MergeStrings().mergeAlternately("ab","pqrs"));
    }
}
