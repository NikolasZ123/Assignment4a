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
public class GrassType extends Pokemon{
    
    public enum GrassMove{
        Razorleaf, Growth, Spore, Vinewhip;
    }
    
    private GrassMove gmove = null;
    
    public GrassType(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, GrassMove gm){
        
        super (n, ls, g, r, m, t);   
        gmove = gm;
    }
    
    //getters
    public GrassMove getGmove() {
        return gmove;
    }
    
    //setters
    public void setGmove(GrassMove gmove) {
        this.gmove = gmove;
    }

    
    
}
