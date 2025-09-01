import java.util.*;
public class game {
    public static void main(String[] args) {
        System.out.println("lets calculate tex");
        System.out.print("enter your incom to calculate the amount that need to pay as tex   : ");
        Scanner Sc= new Scanner(System.in);
        float annualIncome= Sc.nextInt();
        if (annualIncome<=500000){
            System.out.println("you need to pay tex . government take 5% of your annul incom as incomTex");
            System.out.print("you need to pay ..."+annualIncome*0.05);

        }
        else if (annualIncome >500000 && annualIncome<=1000000){
            System.out.println("you need to pay tex . government take 10% of your annul incom as incomTex");
            System.out.println("you need to pay ..."+annualIncome*0.10);

        }
        else{
            System.out.println("you need to pay tex . government take 0% of your annul incom as incomTex");
            System.out.println("you need to pay ..."+annualIncome*0.30);
    };

      
    }
}
