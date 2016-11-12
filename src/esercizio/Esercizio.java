/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenzo
 */
public class Esercizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]v=new int[100];
        
        ClasseP t1=new ClasseP(v);
        t1.start();
        
        try 
        {
            t1.join(200);
        }catch (InterruptedException ex) {}
        
        Thread t2=new Thread(new ClasseS(v));
        t2.start();
        try 
        {
            t2.join(200);
        }catch (InterruptedException ex) {}
        
    }
    
}
