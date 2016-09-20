
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
        System.out.println("Weka vitu hapa");
         String [] operator = {"=",",","+","-","/","*"};
        String k = input.nextLine();
        StringTokenizer st = new StringTokenizer(k," ");
        while(st.hasMoreTokens()){
            //int count=1;
            String Token = (String)st.nextToken();
            if(Token.matches("[a-zA-Z]+[0-9]*")){
                System.out.println(Token  +" is an identifier");
                //count ++;
            }
            else if(Token.matches("[0-9]*")){
                System.out.println(Token + " is a digit" );
                 
               
            }
           
                else if(Arrays.asList(operator).contains(Token)){
                        System.out.println(Token +"is an operator");
                        
            }

            
            
            
            }
        }
    }
}
    
    

