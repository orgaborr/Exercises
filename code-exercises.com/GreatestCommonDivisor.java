/* The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
* Write a method that returns the Greatest Common Divisor of p and q.*/

public Integer gcd(Integer p, Integer q) { 
  for(int i=p; i>=1; i--) {
    if(p % i == 0) {
      if(q % i == 0) {
        return i;
      }
    }
  }
  return 1;
}
