
package split;

/**
 @author cessito
 */
import java.util.Scanner;
import java.util.*;
public class Read2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something here");
        
        StringTokenizer st = new StringTokenizer(input.nextLine());
        
        //System.out.println("Total tokens :" + st.countTokens());
       
        while  (st.hasMoreTokens()){
            System.out.println("Next token :" + st.nextToken());
            
        }
        
    }
}
    

