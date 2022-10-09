public class sorNumber {
    public static void main(String[] args){
        int[] numbers = new int[]{41,1,31,44,2,34,6};

        for(int i=0; i<numbers.length; i++){
            int index=i;

            for(int j=i; j<numbers.length; j++){
                if(numbers[j]<numbers[index]){
                    index = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;

        }


        for(int z=0; z<numbers.length; z++){
            System.out.print(numbers[z]+", ");
        }
    }
}
