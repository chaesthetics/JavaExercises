import java.util.Scanner;
public class sortString {
    public static void main(String[] args){
        String[] name = new String[]{"miawi","haj","keko","minokawa"};
        
       for(int i=0; i<name.length; i++){
        int index = i; 

        for(int j=i; j<name.length; j++){
            if(name[j].length()<name[index].length()){
                index=j;
            }
        }

        String temp = name[i];
        name[i] = name[index];
        name[index] = temp;


       }

       for(int z=0; z<name.length; z++){
        System.out.print(name[z]+", ");
    }
        
    }
    }
