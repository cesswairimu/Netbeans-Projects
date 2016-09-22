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
public class Regexample {
    public static void main(String [] args){
    while(true){
    Scanner input = new Scanner(System.in);
    String s  = input.nextLine();
    System.out.println(s.matches("[a-zA-Z]+[0-9]*{4}"));
    }
    
}
}
