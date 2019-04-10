/*Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ... */

public Integer fibonacci(Integer n) {
int count = 0;
int num = 0;

if(n == 0) {
return 0;
}

while(count <= n) {
int last = 0;
int current = 1;
int save = 0;

num = last + current;
save = current;
current = num;
last = save;

count++;
if(count == n) {
return num;
}
}
return -1;
}
