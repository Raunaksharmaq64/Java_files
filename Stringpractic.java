import java.util.*;

public class Stringpractic{
    public static void main(String[] args) {
        String str= "Raunak Sharma";
        for(int i=0;i<str.length();i++){
            for(int j=i; j<=str.length();j++){
                String substr = str.substring(i,j);
                System.out.println(substr);

            }
        }

    }
}


