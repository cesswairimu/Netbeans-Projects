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
//import java.util.regex.*;
public class AlphaNumeric {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringTokenizer s = new StringTokenizer(input.nextLine());
    
    
    public boolean IsAlphaNumeric(String s){
        String pattern = "^[a-zA-Z0-9]*$";
        if(s.matches(pattern)){
            return true;
            
        }else{
        return false;
    }
    
    }
}

