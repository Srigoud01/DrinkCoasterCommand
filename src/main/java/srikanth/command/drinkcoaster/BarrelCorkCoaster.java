
package srikanth.command.drinkcoaster;


public class BarrelCorkCoaster {
    String name;
    
    public BarrelCorkCoaster( String name ){
        this.name = name;
    }
    public void placeCoaster(){
        System.out.println( name + " Coaster placed under cup");
    }    
    public void stainStopCondensation(){
        System.out.println( name + " Stopping Condensation");
    }
    public void absorbLiquid(){
        System.out.println( name + " Absorbing Liquid");
    }

    public void removeCoaster(){
        System.out.println( name + " removed from under cup");
    }  
}
