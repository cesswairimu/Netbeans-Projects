
package split;

import java.util.*;
public class Tokenizer {
    public static void main(String []args){
        String k="This is a string Tokenizer";
        StringTokenizer st=new StringTokenizer(k," ");
        
        while(st.hasMoreTokens()){
            System.out.println("Token:"+ st.nextToken());
        }
       
        }
    }
    

