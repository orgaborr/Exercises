/*Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ... */

public Integer fibonacci(Integer n) {
int[] fibo = new int[n+2];
    fibo[0] = 0;
    fibo[1] = 1;
    if(n>1) {
    for(int i=2; i<fibo.length; i++) {
      fibo[i] = fibo[i-1]+fibo[i-2];
    }
}
    return fibo[n];
}
