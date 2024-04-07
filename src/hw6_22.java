import java.util.Scanner;
public class hw6_22 {
    public static double sqrt(long n,double lastGuess){
        double nextGuess = (lastGuess + n/lastGuess)/2;
        double delta = nextGuess-lastGuess;
        if(-0.0001>= delta || delta>=0.0001){
            nextGuess = sqrt(n,nextGuess);
        }
        return nextGuess;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        double ans = sqrt(n,1);
        double output = (int)(ans*10000);
        System.out.print(output/10000);
    }
}
