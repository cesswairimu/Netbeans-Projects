/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexical;

/**
 *
 * @author cessito
 */
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;
public class Lexical {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a sentence here");
         StringTokenizer st = new StringTokenizer(str.nextLine());
        Pattern tr = Pattern.compile("[a-zA-Z0-9]");
       
       // String Z [] = [A-Z a-z]+[0-9]*;
        
       
                while( st.hasMoreTokens()){
                    if(tr.matcher(st.nextToken()).matches()){
                        System.out.println(st.nextToken() + "is an identifier");
                    }
                    else{
                        System.out.println("si hiyo");
                        
                    }
                }
       
    }
    
}
