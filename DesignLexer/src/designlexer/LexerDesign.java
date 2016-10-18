
//import java.util.Arrays;
import java.util.*; //allows input for scanner
public class LexerDesign { //class 
    public static void main(String[] args) { //main method
     
    String [] keywords = {"each","do","while","break","finally","if","this","null","long","new","short"};
  
    String operators [] = {"+","=", "-", "/","%","*","++","--","!","==","!=","<",">","<=",">=","&&",
                            "||", "?:", "~","<<",">>",">>>","&","^","|"};
    String separators [] = {";",",",".",":","(",")", "[","]","{","}"}; 
   
    
    System.out.println("Input anything."); 
     Scanner getty = new Scanner(System.in);
    String str = getty.nextLine(); 
    StringTokenizer st = new StringTokenizer(str);
  
 
    while (st.hasMoreTokens()){ 
        String token = st.nextToken();
        if (Arrays.asList(keywords).contains(token)){
            System.out.println(token + " is a keyword");
            
        }
        else if(token.matches("[0-9]*")){
                System.out.println(token + " is a digit" );
        }
        
        
        
        else if(Arrays.asList(operators).contains(token)){
            System.out.println(token +" is an operator");
        }
        
        else if(token.matches("[a-zA-Z]+[0-9]*")){
                System.out.println( token +" is an identifier");
        }
                else if(token.matches("[+,-]+[0-9]*")){
                System.out.println(token + " is a signed digit" );
                }
         
         
         else if(Arrays.asList(separators).contains(token)){
             System.out.println(token + " is a separator");
         }
                 else if(token.matches("[//]+[A-Za-z0-9]*")){ //("(/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+/ )|(//.*)"{
               System.out.println( token+" is a comment");
         }
           
         else{
       System.out.println("Sorry" +token +" is not recognized by java");
    
        
                 
    }

   
    
       
    }
    
    }
}

