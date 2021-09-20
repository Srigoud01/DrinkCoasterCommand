
package srikanth.command.drinkcoaster;

public class LeatherCoaster {
    String name;
    
    public LeatherCoaster( String name ){
        this.name = name;
    }
    public void placeCoaster(){
        System.out.println( name + " Coaster placed under cup");
    }    
    public void stainResistant(){
        System.out.println( name + " Stain resistant");
    }
    public void absorbLiquid(){
        System.out.println( name + " Absorbing Liquid");
    }
    public void absorbHeat(){
        System.out.println( name + " absorbing Heat from cup");
    }

    public void removeCoaster(){
        System.out.println( name + " removed from under cup");
    }    
}
