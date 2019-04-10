/*Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.*/

public String reverse(String s) {
String rev = Character.toString(s.charAt(s.length()-1));

for(int i = s.length()-2; i>=0; i--) {
char c = s.charAt(i);
rev+= Character.toString(c);
}
return rev;
}
