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
public class Pokemon {
    
    public enum Gender{
        Male, Female;
    }
    
    public enum Rarity {
        Common, Rare, Legendary;
    }
    
    public enum BasicMove {
        Leer, Tackle, Scratch, Pound;
    }
    
    public enum Type {
        Fire, Water, Grass;
    }
    
    
    private String name = "";
    private int lifespan = 0;
    private Gender gender = null;
    private Rarity rarity = null;
    private BasicMove move = null;
    private Type type = null;
    
    //constructors
    /*********************************
    *purpose: create a pokemon object
    *Interface: 
    *          name n: String
    *     lifespan ls: int
    *        gender g: Gender
    *        rarity r: Rarity
    *          move m: BasicMove
    ************************************/
    public Pokemon(String n, int ls, Gender g, Rarity r, BasicMove m, Type t){
    
    name = n;
    lifespan = ls;
    gender = g;
    rarity = r;
    move = m;
    type = t;
    
}
    
    public Pokemon(){
        
    }
    
    //Getters

    public String getName() {
        return name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public Gender getGender() {
        return gender;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public BasicMove getMove() {
        return move;
    }

    public Type getType() {
        return type;
    }
    
    
    
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public void setMove(BasicMove move) {
        this.move = move;
    }
    
    
    
    
    
    
    
    
    
    
}
