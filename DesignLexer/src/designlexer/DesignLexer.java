
package designlexer;

/**
 *
 * @author cessito
 */
import java.util.*;
public class DesignLexer {
    public static void main(String[] args) {
    Scanner cess = new Scanner(System.in);
    System.out.println("You might wonna type somthing here");
    String str = cess.nextLine();
    StringTokenizer st = new StringTokenizer(str, " ");
   
    while (st.hasMoreTokens()){
        System.out.println(st.nextToken());
        
    }

    
    
       
    }
    
}
