/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */
public class Pass extends GameEvent {
    
    public Pass(){
        
        super();
        
    }
    
    public String toString() {
        return "Pass attempt ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new ReceivePass(), new GainPossession()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
