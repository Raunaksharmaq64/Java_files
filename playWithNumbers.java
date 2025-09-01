import java . util.*;
public class playWithNumbers {
    public static void main(String[] args) {
        System.out.println("lets paly with numbers");
        System.out.print("enter any number = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1; i<=130; i++){
            int check=  number%i;
            // System.out.println();
            System.out.println("reminder is "+check+" when divided by "+(i));
            if(check==0){
                System.out.println("   here is coulprit       sjjhdskf    ");
            }
        }
    }
    
}
