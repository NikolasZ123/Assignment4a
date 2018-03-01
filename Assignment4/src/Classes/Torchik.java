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
public class Torchik extends FireType{
    
    public enum TorchikMove{
        Peck, Flamethrower;
    }
    
    private TorchikMove tmove = null;
    
    public Torchik(String n, int ls, Gender g, Rarity r, BasicMove m, Type t, FireMove fm, TorchikMove tm){
        
        super (n, ls, g, r, m, t, fm);   
        tmove = tm;
    }

    //getters
    public TorchikMove getTmove() {
        return tmove;
    }
    
    
}
