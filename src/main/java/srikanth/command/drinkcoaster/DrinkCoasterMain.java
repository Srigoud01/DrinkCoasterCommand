
package srikanth.command.drinkcoaster;

public class DrinkCoasterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Diner diner = new Diner();
        
        BarrelCorkCoaster barrelCorkCoaster = new BarrelCorkCoaster("Barrel Cork Coaster");
        GrafLantzCoaster granfLantzCoaster = new GrafLantzCoaster("Graf Lantz Coaster");
        LeatherCoaster leatherCoaster = new LeatherCoaster("Leather Coaster ");
        WhiteMarbleCoaster whiteMarbleCoaster = new WhiteMarbleCoaster("White Marble Coaster");
        
        Command placeBarrelCorkCommand =  () -> {
                barrelCorkCoaster.placeCoaster();
                barrelCorkCoaster.stainStopCondensation();
                barrelCorkCoaster.absorbLiquid();
        };
        diner.setCommand(0, placeBarrelCorkCommand, barrelCorkCoaster::removeCoaster);
        
        Command placeGrafLantzCommand = () -> {
                granfLantzCoaster.placeCoaster();
                granfLantzCoaster.absorbLiquid();
                granfLantzCoaster.stainResistant();
        };
        
        diner.setCommand(1, placeGrafLantzCommand, granfLantzCoaster::removeCoaster);
        
        Command placeLeatherCommand = () -> {
                leatherCoaster.placeCoaster();
                leatherCoaster.absorbLiquid();
                leatherCoaster.stainResistant();
                leatherCoaster.absorbHeat();
        };
        
        diner.setCommand(2, placeLeatherCommand, leatherCoaster::removeCoaster);
        
        Command placeWhiteMarbleCommand = () -> {
                whiteMarbleCoaster.placeCoaster();
                whiteMarbleCoaster.StopCondensation();
                whiteMarbleCoaster.StopTear();
                
        };
        
        diner.setCommand(3, placeWhiteMarbleCommand, whiteMarbleCoaster::removeCoaster);
        
        System.out.println(diner);
        
        diner.placeCoaster(0);
        System.out.println("\n");
        diner.placeCoaster(1);
        System.out.println("\n");
        diner.placeCoaster(2);
        System.out.println("\n");
        diner.placeCoaster(3);
        System.out.println("\n");
        System.out.println("-------------Undoing Previous Commands ------- \n");
        diner.unplaceCoaster(0);  
        System.out.println("\n");
        diner.unplaceCoaster(1); 
        System.out.println("\n");
        diner.unplaceCoaster(2);
        System.out.println("\n");
        diner.unplaceCoaster(3);       
    }
}
