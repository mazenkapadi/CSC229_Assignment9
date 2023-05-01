public class FibClass {
    public static int recursiveFibonacci(int n) {
        if(n<=1){
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    static int iterativeFibonacci(int n){
        int i, f[] = new int[n+2];
        f[0] = f[1] = 0;
        for(i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
