import java.util.Scanner;
public class ok {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.println("enter your array size : "); int m =input.nextInt();
        int[] array = new int[m];
        for(int i = 0 ; i<5 ; i++){
           System.out.println("enter the "+i+"th number"); array[i]= input.nextInt();}
        clearing(array);
    }
    static void clearing(int[]b){
        int min = b[0]; int max = b[0]; float sum=0;
        for(int i = 1 ; i<b.length ; i++)
          if(b[i]<min)
              min=b[i];
        for(int i = 1 ; i<b.length ; i++)
          if(b[i]>min)
              min=b[i];
        for(int i = 0; i<b.length ; i++){
          sum +=b[i];}
        float avrage = sum/b.length;
        

        
        System.out.println("the max number is : "+max+" the min number is : "+ min+" and the avrage is : "+avrage);
    } 
}
