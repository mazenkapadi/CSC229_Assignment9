public class Problem01 {
    public static void func1(int n){
        int i = 1, j=1, k =1;
        int x = 0, y =0;

        for(; i <=n; i++){
            for (; j<=n; j=j*2){
                x++;
            }
        }
        for(;k<=j*j;k++)
            y++;
        System.out.println(" \n x= "+x +" y= "+y);
    }

    public static void func2(int n){
        int k,j,i=n;
        while(i>1){
            k=0;
            while(k<n){
                k=k+2;
            }
            j=j*2;
        }
        i=i/2;
    }
}

//T(n) = 3 T(n/4) + n
