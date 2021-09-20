
package drinkcoastercommand;


public class Diner {
    Command[] placeCommands;
    Command[] unplaceCommands;
    
    public Diner(){
        placeCommands = new Command[7];
        unplaceCommands = new Command[7];
        
        
        
        for (  int i = 0; i < 7; i ++ ){
            placeCommands[i] = () -> {};
            unplaceCommands[i] = () -> {};
        }
    }
    public void setCommand(int slot, Command placeCommand, Command unplaceCommand){
        placeCommands[slot] = placeCommand;
        unplaceCommands[slot] = unplaceCommand;
    }
    public void placeCoaster( int slot ){
        placeCommands[slot].execute();
    }
    public void unplaceCoaster(int slot){
        unplaceCommands[slot].execute();
    }
    public String toString(){
        StringBuilder buffer = new StringBuilder();
        
        buffer.append("\n ----- " + " Penisula Diner -------\n");
        for( int i = 0; i < placeCommands.length; i++){
            System.out.println("[slot "+i + "]" + placeCommands[i].getClass().getName() + "    " + unplaceCommands[i].getClass().getName() + "\n");
        }
        
        return buffer.toString();
    }
}
