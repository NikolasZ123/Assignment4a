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
public class WaterType extends Pokemon{
    
    public enum WaterMove{
        Squirt, Jet, Blast, Moisten;
    }
    
    private WaterMove wmove = null;
    
    public WaterType(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, WaterMove wm){
        
        super (n, ls, g, r, m, t);   
        wmove = wm;
    }
    
    //getters
    public WaterMove getWmove() {
        return wmove;
    }
    
    //setters
    public void setWmove(WaterMove wmove) {
        this.wmove = wmove;
    }

    
}
