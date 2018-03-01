/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Classes.Chikorita;
import Classes.Chikorita.ChikoritaMove;
import Classes.FireType;
import Classes.FireType.FireMove;
import Classes.GrassType;
import Classes.GrassType.GrassMove;
import Classes.Pokemon;
import Classes.Pokemon.BasicMove;
import Classes.Pokemon.Gender;
import Classes.Pokemon.Rarity;
import Classes.Pokemon.Type;
import Classes.Squirtle;
import Classes.Squirtle.SquirtleMove;
import Classes.Torchik;
import Classes.Torchik.TorchikMove;
import Classes.WaterType;
import Classes.WaterType.WaterMove;
import javax.swing.JOptionPane;

/**
 *
 * @author zbaraszewski-n
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        FireType Fireguy = new FireType("Flame", 10, Gender.Male, Rarity.Legendary, BasicMove.Pound, 
                Type.Fire, FireMove.Roast);
        
        WaterType Waterguy = new WaterType("Splash", 1000, Gender.Female, Rarity.Rare, BasicMove.Scratch, 
                Type.Water, WaterMove.Moisten);
        
        GrassType Grassguy = new GrassType("Grassy", 22, Gender.Male, Rarity.Legendary, BasicMove.Tackle, 
                Type.Grass, GrassMove.Vinewhip);
        
        Squirtle Waterturtle = new Squirtle("Squirtle", 33, Gender.Female, Rarity.Common, BasicMove.Leer, 
                Type.Water, WaterMove.Blast, SquirtleMove.Hydroblast); 
        
        Chikorita Grassthing = new Chikorita("Chikorita", 30, Gender.Male, Rarity.Legendary, BasicMove.Pound,
                Type.Grass, GrassMove.Vinewhip, ChikoritaMove.Synthesis);
        
        Torchik Firebird = new Torchik("Torchik", 30, Gender.Female, Rarity.Common, BasicMove.Scratch, 
                Type.Fire, FireMove.Blaze, TorchikMove.Flamethrower);
        
        
       
        
        
        System.out.println("Fire type pokemon: Fireguy");
        System.out.println("Lifespan = " +Fireguy.getLifespan());
        System.out.println("Gender = " +Fireguy.getGender());
        System.out.println("Rarity = " +Fireguy.getRarity());
        System.out.println("Type = " +Fireguy.getType());
        System.out.println("Basic Move = " +Fireguy.getMove());
        System.out.println("Fire Move = " +Fireguy.getFmove());
        System.out.println();
        
        System.out.println("Squirtle pokemon: Waterturtle");
        System.out.println("Lifespan = " +Waterturtle.getLifespan());
        System.out.println("Gender = " +Waterturtle.getGender());
        System.out.println("Rarity = " +Waterturtle.getRarity());
        System.out.println("Type = " +Waterturtle.getType());
        System.out.println("Basic Move = " +Waterturtle.getMove());
        System.out.println("Water Move = " +Waterturtle.getWmove());
        System.out.println("Squirtle Move = " +Waterturtle.getSmove());
        System.out.println();
        
        System.out.println("Torchik pokemon: Firebird");
        System.out.println("Lifespan = " +Firebird.getLifespan());
        System.out.println("Gender = " +Firebird.getGender());
        System.out.println("Rarity = " +Firebird.getRarity());
        System.out.println("Type = " +Firebird.getType());
        System.out.println("Basic Move = " +Firebird.getMove());
        System.out.println("Fire Move = " +Firebird.getFmove());
        System.out.println("Torchik Move = " +Firebird.getTmove());
    }
    
   
    
    
}
