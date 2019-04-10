/*Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.*/

public String reverse(String s) {
  String rev = Character.toString(s.charAt(s.length()-1)); //initializes with the last char of s
  
  for(int i = s.length()-2; i>=0; i--) { //starts form the char before last char of s, also -1 for index (first char index = 0)
    char c = s.charAt(i);
    rev+= Character.toString(c);
  }
  return rev;
}
