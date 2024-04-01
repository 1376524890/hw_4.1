import java.util.Scanner;
public class hw6_2 {
    public static int sumDigits(long n){
        long devide = 10;
        int sum = 0;
        int timeMax;
        long n_temp = n;
        for(timeMax=1;n_temp>10;n_temp/=10,timeMax++);
        for(int time = 0;time<timeMax;time++){
            sum+= (int)(n%devide);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(sumDigits(n));
    }
}
