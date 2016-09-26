
package lexical;

/**
 *
 * @author cessito
 */
import java.util.Scanner;
import java.util.*;
public class Lexer1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something here");
         String [] operator = {"=", "+","-","/","*"};
        String k = input.nextLine();
        StringTokenizer st = new StringTokenizer(k," ");
        
        int count=1;
        
        while(st.hasMoreTokens()){
            
            String Token = (String)st.nextToken();
            if(Token.matches("[a-zA-Z]+[0-9]*")){
                System.out.println(    count  +" is an identifier");
                
            }
            else if(Token.matches("[0-9]*")){
                System.out.println(count + " is a digit" );
                 
               
            }
             else if(Token.matches("[0-9]+[a-zA-Z]*")){
                System.out.println(count + " is a string literal" );
             }
           
                else if(Arrays.asList(operator).contains(Token)){
                        System.out.println(count +" is an operator");
                        
            }
                else {
                    System.out.println(count +" this is not defined");
                } 
            
            
            count ++;
            
            }
        }
    }

    
    

