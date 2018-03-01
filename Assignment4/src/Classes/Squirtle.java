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
public class Squirtle extends WaterType{
    
    public enum SquirtleMove{
        Shell, Hydroblast;
    }
    
    private SquirtleMove smove = null;
    
    public Squirtle(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, WaterMove wm, SquirtleMove sm){
        
        super (n, ls, g, r, m, t, wm);   
        smove = sm;
    }

    //getters
    public SquirtleMove getSmove() {
        return smove;
    }
    
    
    
}
