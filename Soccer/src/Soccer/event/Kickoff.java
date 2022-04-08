/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */
public class Kickoff extends GameEvent {  // Really it's a special Pass
    
    public Kickoff() {

    }

    public String toString() {
        return "Kickoff ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new ReceivePass(), new GainPossession()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return true;
    }
    
        // Little bit of a hack maybe as ballPos not used.
    public void setBallPos(int ballPos) {
       //super.setBallPos(50);
       super.ballPos = 50;
    }
    
}
