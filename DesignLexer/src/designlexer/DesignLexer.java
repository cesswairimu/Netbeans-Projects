
package designlexer;


import java.util.Arrays;
import java.util.*; //allows input for scanner
public class DesignLexer { //class 
    public static void main(String[] args) { //main method
    Scanner cess = new Scanner(System.in); // reading the scanner input
    String [] keywords = {"abstract","boolean","goto", "const", "native", "volatile","break","byte","case", "catch",
    "char", "class", "continue", "default", "do","double","else","extends","enum","false",
    "final", "finally","float","for","if","implements","import", "instanceof", "int", "interface",
    "long", "new", "null", "package", "public","private", "protected", "return"
    , "short", "static", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "true", "void", "while"};
  
    String operators [] = {"+","=", "-", "/","%","*","++","--","!","==","!=","<",">","<=",">=","&&",
                            "||", "?:", "~","<<",">>",">>>","&","^","|"};
    String separators [] = {"()", "{}", "[]",";",",",".",":"}; //"(",")","[","]","{","}"};
    
    System.out.println("You might wonna type something here"); //prompting the user to input something
    String str = cess.nextLine(); // storing the input(scanner) in a vacriable "str"
    StringTokenizer st = new StringTokenizer(str); //spliting the input string using delimeter space
  
 
    while (st.hasMoreTokens()){ //looping through the string
        String token = st.nextToken(); //output ing each token of the input string
        if (Arrays.asList(keywords).contains(token)){
            System.out.println(token + " is a keyword");
            
        }
        else if(Arrays.asList(operators).contains(token)){
            System.out.println(token +" is an operator");
        }
        
        else if(token.matches("[a-zA-Z]+[0-9]*")){
                System.out.println( token +" is an identifier");
        }
         else if(Arrays.asList(separators).contains(token)){
             System.out.println(token + " is a separator");
         }
         
                 //else if(token.matches("[a-z]")){//("(/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+/ )|(//.*)"{
               // System.out.println( token+" is a comment");
         //}
         else{
       System.out.println("the word is " +token);
       
        
        
    }

   
    
       
    }
    
}
