/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voetbal;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class SpelersOverzicht {
    ArrayList<Speler> Spelers;
    
    public SpelersOverzicht() {
        Spelers = new ArrayList<Speler>();
        try {
            this.readFile("C:\\Users\\kevin\\Documents\\NetBeansProjects\\voetbalapp\\web\\text\\voetballers.txt");
        } catch(IOException i) {
            System.out.println(i);
        }
   }
    
    public void voegSpelerToe(Speler e) {
 		Spelers.add(e);
     }
    
   
    private void readFile( String file ) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (file));
        String line = null;
         while( ( line = reader.readLine() ) != null ) {
        	this.voegSpelerToe(new Speler(line.split(",")));
         }
        
        reader.close();
    }
    
    public ArrayList<Speler> getSpelers(String land, String positie) {
           ArrayList<Speler> selectie=new ArrayList<>();
        for(Speler s : Spelers)
            
            if(s.getLand().equals(land)&& s.getPositie().equals(positie)){
                selectie.add(s);
            }
         return  selectie;
    }
}

    
    

