/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gee;

/**
 *
 * @author cessito
 */
public class Getty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String spliting = "split-this-three-words";
        String[] tee = spliting.split("-");
        for(int p=0, p<tee.length, p++){
            System.out.println(tee[p]);
        }
    }
    
}
