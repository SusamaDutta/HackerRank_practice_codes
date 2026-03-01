/*
Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.

Sample Input:
anagram
margana

Sample Output:
Anagrams

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input:
anagramm
marganaa

Sample Output:
Not Anagrams

*/

import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {

        // 1. Convert to lower case
        a=a.toLowerCase();
        b=b.toLowerCase();

       // 2. If lengths are different cannot be anagrams
        if(a.length() != b.length()){
            return false;
        }

        // 3. Count frequencies of characters
        int[] charCount = new int[26];
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }

        // 4. If all counts are zero, they are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
  return true;
        
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
