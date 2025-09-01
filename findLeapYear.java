import java.util.*;
public class findLeapYear {
    public static void main(String[] args) {
        System.out.print("enter the year  ");
        Scanner sc =new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0){
            System.out.println("enter year is a leap year ");
        }else{
            System.out.println("enter leap year");
        }
    }
}
