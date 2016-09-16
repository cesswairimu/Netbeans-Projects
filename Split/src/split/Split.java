
package split;

/**
 *
 * @author cessito
 */
import java.util.Scanner;
public class Split {

    
    public static void main(String[] args) {
       
        Scanner gurl = new Scanner(System.in);
        System.out.println("Enter a new sentence");
         String girl=gurl.nextLine();
          
         
        
        String[] token = girl.split(" ");
        for(int i=0; i< token.length; i++) {
            System.out.println(token[i]);
        }
        
    }
}
