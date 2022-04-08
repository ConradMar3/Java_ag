/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer.play;

/**
 *
 * @author ksomervi
 */
public interface IDisplayDataItem {
    
    public boolean isDetailAvailable ();
    public String getDisplayDetail();
    public int getID();
    public String getDetailType();    // return simple text String or return the actual object?
    
}
