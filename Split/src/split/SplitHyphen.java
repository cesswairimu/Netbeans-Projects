/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author cessito
 */
import java.util.*;
import java.util.Scanner;
public class SplitHyphen {
     public static void main (String [] args){
        
        System.out.println("Enter a list of separated by hyphens");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str, "-");
        System.out.println("------Split by hphens '-'-----------");
        //StringTokenizer
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            
        }
    }
    
}

    
