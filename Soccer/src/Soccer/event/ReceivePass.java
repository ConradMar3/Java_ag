/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */
public class ReceivePass extends GameEvent {
    
    public ReceivePass(){
        
        super();
        
    }    
    public String toString() {
        return "Receive pass ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Dribble(), new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
