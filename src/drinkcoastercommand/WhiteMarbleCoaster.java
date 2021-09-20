
package drinkcoastercommand;

public class WhiteMarbleCoaster {
    String name;
    
    public WhiteMarbleCoaster( String name ){
        this.name = name;
    }
    public void placeCoaster(){
        System.out.println( name + " Coaster placed under cup");
    }
    public void StopCondensation(){
        System.out.println( name + " Stain resistant");
    }
    public void StopTear(){
        System.out.println( name + " Protecting table surface");
    }

    public void removeCoaster(){
        System.out.println( name + " Removed from under cup");
    }    
}
