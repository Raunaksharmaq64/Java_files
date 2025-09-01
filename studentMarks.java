 import java.util.*;
public class studentMarks {
    public static void main(String[] args) {
        System.out.println("lets calculate student marks  "  );
        System.out.println("enter marks ");
         Scanner sc = new Scanner(System.in);
         
         System.out.print("maths = ");
        int m = sc.nextInt();
        System.out.print("english =");
        int e = sc.nextInt();
        System.out.print("hindi = ");
        int h = sc.nextInt();
        System.out.print("science = ");
        int s = sc.nextInt();
        System.out.print("evs =");
        int evs =  sc.nextInt();
        int total = (m+e+s+evs+h);
        System.out.println("total marks = "+total);
        if (total<=500) {
        int PERCENTAGE =( total * 100) /500;
        System.out.println("percentage =  "+PERCENTAGE+"%");
        }else{
            System.out.println("invalid marks or false marks entered kindly check it and try again");
            if(m>100){
                System.out.println("marks of math = invalid ");
            };
            if (s>100) {
                 System.out.println("marks of science = invalid ");
            };
            if (e>100) {
                 System.out.println("marks of english = invalid ");
            };
                 if (evs>100) {
                 System.out.println("marks of evs = invalid ");
            };     if (h>100) {
                 System.out.println("marks of hindi = invalid ");
            };
        };  
    };
    
};
