
package designlexer;

/**
 *
 * @author cessito
 */
import java.util.*; //allows input for scanner
public class DesignLexer { //class 
    public static void main(String[] args) { //main method
    Scanner cess = new Scanner(System.in); // reading the scanner input
    System.out.println("You might wonna type something here"); //prompting the user to input something
    String str = cess.nextLine(); // storing the input(scanner) in a variable "str"
    StringTokenizer st = new StringTokenizer(str, " "); //spliting the input string using delimeter space
   
    while (st.hasMoreTokens()){ //looping through the string
        System.out.println(st.nextToken()); //output ing each token of the input string
        
    }

    
    
       
    }
    
}
