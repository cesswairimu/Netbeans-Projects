package split;

/**
 *
 * @author cessito
 */
import java.util.*;
import java.util.Scanner;
public class CountMe {
    public static void main(String[] args){
        Scanner anything = new Scanner(System.in);
        System.out.println("You might wonna put something here");
        
        StringTokenizer st = new StringTokenizer(anything.nextLine());
        System.out.println("Total tokens:" + st.countTokens());
    }
    
}
