public class hw6_28 {
    public static boolean isPrime(int n){
        for(int i = 2;i<(int)(hw6_22.sqrt(n,1)+1);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static int nextPrime(int n){
        n += 1;
        for(;!isPrime(n);n++);
        return n;
    }

    public static void main(String[] args) {
        boolean[] prime = new boolean[100000];
        for(int n = 0; n < 100000; n++){
            if(isPrime(n)){
                prime[n] = true;
            }
            else {
                prime[n] = false;
            }
        }
        for(int p = 2, num =2;p<32;p++){
            for(int i = 0;i<p;i++){
                num *= 2;
            }
            num -= 1;
            if(prime[num]){
                System.out.println(p+"\t\t"+num);
            }
        }
    }
}
