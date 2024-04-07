import java.util.Arrays;
import java.util.Scanner;
public class hw6_37 {
    public static String format(String number, int width){
        char[] fill_0 = new char[width];
        int digit = number.length();
        String fill0_str = "";
        if(width>=digit){
            for (int i = 0; i < width-digit; i++) {
                fill_0[i] = '0';
            }
            fill0_str = new String(fill_0);
        }
        return fill0_str + number;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        int width = scan.nextInt();
        System.out.println(format(number,width));
    }
}
