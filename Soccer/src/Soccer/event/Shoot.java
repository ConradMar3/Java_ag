/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.event;

/**
 *
 * @author ksomervi
 */
public class Shoot extends GameEvent {
    
    // At the simplest, if successful dribbling moves towards the other teams goal
    public Shoot(){
        
        // No change in ballPoss until next event; Goal or Kickout(save)
        
    }
    
    public String toString() {
        return "Shoots ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Goal(), new Kickout()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
        /**
     * @param ballPos the ballPos to set
     */
    public void setBallPos(int currBallPos) {
        //super.setBallPos(currBallPos);
        super.ballPos = currBallPos;

    }
    
}
