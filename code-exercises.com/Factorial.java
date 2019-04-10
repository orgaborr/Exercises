/*Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
TIP: To make it more interesting, try to do it recursively.*/

public Integer factorial(Integer n) {
  if(n <= 0) {
    return -1; //error
  }
  int multi = 1;
  for(int i=1; i<=n; i++) {
    multi *= i;
  }
  return multi;
}
