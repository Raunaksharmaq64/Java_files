import java.util.*;
public class countTheDigit {
    public static void main(String[] args) {
        System.out.print("lets count the number of digit which user enter  ");
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();
        
        int i=0;
       int digitSum=0;

        // while (number>=1) {
        //    number=number/10;
           
        //     i++;
           
        // }System.out.println(i);
            

            // finding sum of digits of entered number
            while (number>=1) {
                digitSum+=number%10;
                number=number/10;


            }System.out.println(digitSum);

            
    }
}
