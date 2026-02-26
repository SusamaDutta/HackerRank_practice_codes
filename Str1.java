/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints : A will consist at most  lower case english letters.

Sample Input : madam
Sample Output : Yes
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String S = new StringBuilder(A).reverse().toString();
        
        if(A.equals(S)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
