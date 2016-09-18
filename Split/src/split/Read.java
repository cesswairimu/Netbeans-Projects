/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package split;
import java.util.*;

/** @author cessito
 */

import java.util.Scanner;
 class Read {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase here");
       // String st = input.nextLine();
        
        StringTokenizer str =new StringTokenizer(input.nextLine());
        
        while (str.hasMoreElements()){
            System.out.println("Element next : "+ str.nextElement());
        }
            
    }
    
}
