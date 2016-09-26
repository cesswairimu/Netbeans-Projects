
package lexical;


import java.util.*;
import java.util.Scanner;
//import java.util.regex.*;
public class AlphaNumeric {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You might want to put smth here");
        StringTokenizer s = new StringTokenizer(input.nextLine());
    AlphaNumeric a = new AlphaNumeric();
    if(a.IsAlphaNumeric(s.nextToken())){
    System.out.println("input in the pattern");
    }else{
    System.out.println("input not in the pattern");
    }
    
    }
    public boolean IsAlphaNumeric(String s){
        String pattern = "^[a-zA-Z0-9]*$";
        if(s.matches(pattern)){
            return true;
            
            
        }else{
        return false;
    }
    }
}

