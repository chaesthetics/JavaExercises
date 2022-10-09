public class pyramid{
    public static void main(String[] args){
        int pyramidRow = 5;

        for(int i=1; i<=pyramidRow; i++){
            for(int k=1; k<=pyramidRow-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}