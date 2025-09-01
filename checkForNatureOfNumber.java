import java.util.*;

public class checkForNatureOfNumber {
    public static void main(String[] args) {
        // System.out.println("lets check the number if prime , composite");
        // System.out.print("enter number  : ");
        // //those number having minimum 3 factor are composite and those number having only 2 factor are prime
        // Scanner Sc= new Scanner(System.in);
        // int number = Sc.nextInt();
        // int factor = 0;
        // if (number==1) {
        //     System.out.println("1 is nither prime nor composite ");
            
        // }else{
        // for(int i = 1;i<=number;i++){
        //     if (number%i==0) {
        //         factor++;
                              
        //     }
          
        // }  System.out.println("the number that u entered haviung only "+factor + " factor hence , ");
        // if (factor>=3) {
        //     System.out.println("the entered number : "+ number +" is a composite number");
            
        // }else{
        //     System.out.println("the entered number : "+ number +" is a primr number");
        // }}




        // CODE FOR FINDING SUM OF NUMBERS IN THIS FOMATE
        System.out.println("find sum of 1/(n*n)");
        Scanner Sc= new Scanner(System.in);
        System.out.print("enter the number that u want to calculate sum ");
         double n = Sc.nextInt();
         double sum = 0;
         double finalSum=0;
         
         for(double i=2;i<= n;i++){
            sum= 1/(i*i);
            finalSum += sum; 
            
            
         }System.out.println(finalSum);



    }
}
