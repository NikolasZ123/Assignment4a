/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author zbaraszewski-n
 */
public class Chikorita extends GrassType{
    
    public enum ChikoritaMove{
        Synthesis, Grassknot;
    }
    
    private ChikoritaMove cmove = null;
    
    public Chikorita(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, GrassMove gm, ChikoritaMove cm) {
        
        super (n, ls, g, r, m, t, gm); 
        cmove = cm;
    }

    //getters
    public ChikoritaMove getCmove() {
        return cmove;
    }
    
    
}
