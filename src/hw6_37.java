import java.util.Arrays;
import java.util.Scanner;
public class hw6_37 {
    public static String format(int number, int width){
        char[] fill_0 = new char[width];
        int digit,number_temp=number;
        for(digit = 1;number_temp>=10;number_temp/=10,digit++);
        char[] num = new char[digit];
        int ten = 10;
        number_temp = number;
        for(int i = digit-1;i>=0;i--){
            num[i] = (char)(number_temp % ten);
            ten*=10;
        }
        String num_str = Arrays.toString(num);
        String fill0_str = "";
        if(width>=digit){
            for (int i = 0; i < width-digit; i++) {
                fill_0[i] = '0';
            }
            fill0_str = Arrays.toString(fill_0);
        }
        return fill0_str.concat(num_str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int width = scan.nextInt();
        System.out.println(format(number,width));
    }
}
