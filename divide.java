import java.util.Scanner;
 
public class divide{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a divident: ");
        int divident = scanner.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = scanner.nextInt();

        int remainder = 0;
        int quotient = 0;
        int tempProduct = 0;

        for(int i= 1; tempProduct<divident; i++){
            quotient = i;
            tempProduct = quotient * divisor;
        }
        quotient = quotient -1;
        int product = quotient*divisor;
        remainder = divident - product;
        
        System.out.println("     "+quotient);
        System.out.println("  ______");
        System.out.println(divisor+"/  "+divident);
        System.out.println("-   "+product);
        System.out.println("_______");
        System.out.println("     "+remainder);

    }
}
