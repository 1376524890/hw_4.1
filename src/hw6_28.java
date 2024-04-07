public class hw6_28 {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        for(int p = 1;p<=31;p++){
            num = 1;
            for(int i=0;i<p;i++){
                num*=2;
            }
            num--;
            if(isPrime(num)){
                System.out.println(p+"\t\t"+num);
            }
        }

    }
}
