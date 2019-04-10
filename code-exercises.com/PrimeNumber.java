/*A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a method that checks if a number is prime number.*/

public Boolean isPrime(Integer n) {
  for(int i = 2; i<=n/2; i++) { // only n/2 is checked for efficiency, since more than half of n is not a divisor anyway
    if(n % i ==0) {
      return false;
    }
  }
  return true;
}
