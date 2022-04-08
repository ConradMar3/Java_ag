/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author Administrator
 */
public class Goal extends GameEvent {
    
    public Goal(){
       
    }
    public String toString() {
        return "GOAL! ";
    }
     
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new Kickoff()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
    
    // Little bit of a hack maybe as ballPos not used.
    public void setBallPos(int ballPos) {
       //super.setBallPos(100);
        super.ballPos = 100;
    }
     
}
