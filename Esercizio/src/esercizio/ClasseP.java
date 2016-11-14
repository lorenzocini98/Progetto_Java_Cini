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
public class ClasseP extends Thread
{ 
    //Aggiornamento 14 Novembre
    private  int[]vettore;

    public ClasseP(int[] vettore) {
        this.vettore = vettore;
    }
    
    public int[] genera(int[] vettore)
    {
        for(int i=0;i<this.vettore.length;i++)
        {
            vettore[i]= (int) (Math.random()*100);
        }
        return vettore;
    }
    
    public int[]ordina(int[]vettore)
    {
        for(int i=0;i<this.vettore.length;i++)
        {
            for(int k=0;k<this.vettore.length;k++)
            {
                if(vettore[i]<vettore[k])
                {
                    int app=vettore[i];
                    vettore[i]=vettore[k];
                    vettore[k]=app;
                }
            }
        }
        return vettore;
    }
    @Override
    public void run()
    {
       genera(this.vettore); 
        try 
        {
            sleep(200);
        }catch (InterruptedException ex){} 
       
        ordina(this.vettore);   
       
        try {
            join(400);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClasseP.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
       
       for(int i=0;i<this.vettore.length;i++)
       {
           System.out.println("Valore Vettore t1 : "+this.vettore[i]);
       }
    }
    
}
