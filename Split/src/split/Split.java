/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author cessito
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String girl = "Cess is a good girl and passionate about programming";
        String[] tokens = girl.split(" ");
        for(String s:tokens){
            System.out.println(s);
        }
        girl = "This     program  splits a string based on space";
        tokens =girl.split("\\s+");
    }
}
