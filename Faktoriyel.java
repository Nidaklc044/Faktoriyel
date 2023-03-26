
package faktoriyel;
import java.util.Scanner;

public class Faktoriyel {

   
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int faktoriyel=1;
       System.out.println("bir sayı giriniz");
       int sayi1=scan.nextInt();
       for(int i=1;i<=sayi1;i++){
           faktoriyel=faktoriyel*                               i;
       }
       System.out.println(faktoriyel);
    }
    
}
