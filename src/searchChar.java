public class searchChar {
    public static void main(String[] args) {
        String kofi = "bamboo";
        System.out.println(searchString(kofi,'t'));


    }
    static boolean searchString(String word, char target){
        if (word.length()==0){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if(target == word.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
