/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */
public class Dribble extends GameEvent {
    
    // At the simplest, if successful dribbling moves towards the other teams goal
    public Dribble(){
        
        super();
        
    }
    
    public String toString() {
        return "Dribble ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
