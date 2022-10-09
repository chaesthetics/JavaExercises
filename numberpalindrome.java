public class numberpalindrome {
    public static void main(String args[]){  
        int r,sum=0, temp;
        int number = 10; 

        temp = number;

        while(number>0){
        r = number %10;
        sum = sum*10+r; 
        number = number/10;
        }
        if(sum==temp){
            System.out.println("number is a palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        }
      }  
}
