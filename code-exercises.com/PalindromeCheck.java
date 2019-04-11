/*A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
* Write a method that detects if a string is a palindrome.
* Tip: Use word.charAt(i) to get the character at position i.*/

//This code is based on my solution of the Reverse String exercise

public boolean isPalindrome(String word) { 
  String rev = Character.toString(word.charAt(word.length()-1));
  
  for(int i = word.length()-2; i>=0; i--) {
    char c = word.charAt(i);
    rev+= Character.toString(c);
  }
  if(rev.equals(word)) {
    return true;
  }
  return false;
}
