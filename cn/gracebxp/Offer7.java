package cn.gracebxp;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Offer7 {
    public int Fibonacci(int n) {
        if (n<=1){
            return n;
        }

        int[] fib=new int[n+1];
        fib[1]=1;
        for(int i=2;i<fib.length;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
