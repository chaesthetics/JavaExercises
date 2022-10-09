public class palindrome {
    public static void main(String[] args){
        String word = "pap";
        int wordlen = word.length();
        String reverse="";

        for(int i=wordlen-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        
        if(reverse.equalsIgnoreCase(word)){
            System.out.println("word is palindrome");
        }
        else{
            System.out.print("word is not palindrome");
        }
    }
}
