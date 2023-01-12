import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=2;i<a;i++) {
            if (a % i != 0) {
                b = 1;
            } else {
                b = 0;
                break;
            }
        }
        if(b==1){
            System.out.println(a+" is a Prime Number");
        }else if(b==0){
            System.out.println(a+" is not a Prime Number");
        }


    }
}