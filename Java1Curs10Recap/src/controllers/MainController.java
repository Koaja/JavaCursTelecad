package controllers;

import java.util.ArrayList;
import model.Sejur;

public class MainController {
    private static MainController singleton;
    private static SejurController sejurController;
    
    private MainController(){    
        sejurController = new SejurController();
    }
    
    public static MainController getInstance() {
        if(singleton == null){
            singleton = new MainController();
        }
        
        return singleton;
    }
    
    public void adaugaSejur(Sejur s){    
        sejurController.adaugaSejur(s);   
    }
    
    public ArrayList<Sejur> getSejururi(){
        return sejurController.getSejururi();
    }
    
}
