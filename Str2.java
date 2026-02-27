/*Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description: Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns:
string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints:
1<=|s|<=1000
consists of English alphabetic letters only (i.e., [a-zA-Z]).

Sample Input 0:
welcometojava
3

Sample Output 0:
ava
wel

*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currentVal = s.substring(0,k);
        String smallest = currentVal ;
        String largest = currentVal;

        // Iterate through the string to compare all substrings of length k
        for(int i = 0; i<=s.length()- k; i++){
            currentVal=s.substring(i,i+k);
            
            if(currentVal.compareTo(smallest)<0){
                smallest=currentVal;
            }
            else if(currentVal.compareTo(largest)>0){
                largest=currentVal;
            }
            
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
