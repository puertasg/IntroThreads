/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introthreads;

/**
 *
 * @author diginamic05
 */
public class Counter implements Runnable {
    
    public void run()
    {
        int counter = 0;
        
        while(counter < 10)
        {
            System.out.println(counter + " ");
            counter++;
        }
    }
}
