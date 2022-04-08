/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */

// Perhaps break this into Tackle and InterceptPass

public class GainPossession extends GameEvent {
    
    public GainPossession(){
        
        super();
        
    }
    
    public String toString() {
        return "Won possession ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Pass(), new Dribble(), new Shoot()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return true;
    }
    
}
