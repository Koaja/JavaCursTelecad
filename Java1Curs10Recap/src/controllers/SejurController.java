
package controllers;

import java.util.ArrayList;
import model.Sejur;

public class SejurController {
     private ArrayList<Sejur> sejururi = new ArrayList<>(); 
     
     public void adaugaSejur(Sejur s){
         sejururi.add(s);
     
     }
     
     public ArrayList<Sejur> getSejururi(){
         return sejururi;    
     }
}
