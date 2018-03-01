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
public class FireType extends Pokemon {

    public enum FireMove{
        Blaze, Roast, Flame, Scorch;
    }
    
    private FireMove fmove = null;
    
    public FireType(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, FireMove fm){
    
        super (n, ls, g, r, m, t);   
        fmove = fm;
    }
    
    //getters
    public FireMove getFmove() {
        return fmove;
    }
  
    
    //setters
    public void setFmove(FireMove fmove) {
        this.fmove = fmove;
    }
    
    
}
