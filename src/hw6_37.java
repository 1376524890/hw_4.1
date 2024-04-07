import java.util.Scanner;
public class hw6_37 {
    public static String format(int number, int width){
        char[] ori_fill = new char[width];
        int digit,number_temp=number;
        for(digit = 1;number_temp>=10;number_temp/=10,digit++);
        char[] num = new char[digit];
        int ten = 10;
        number_temp = number;
        for(int i = digit-1;i>=0;i--){
            num[i] = (char)(number_temp % ten);
            ten*=10;
        }
        if(width<=digit){
            String output = new String(num);
            return output;
        }
        else {
            for(int start = width-digit, start0 = start;start<width;start++){
                ori_fill[start] = num[start-start0];
            }
            String output = new String(ori_fill);
            return output;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int width = scan.nextInt();
        System.out.println(format(number,width));
    }
}
