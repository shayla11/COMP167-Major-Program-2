/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author shayla
 */
public class PushReelMower extends WalkBehindMower {
    
    private int numWheels;
    
    public PushReelMower() {
        numWheels = 0;
        
    }
    
    public String toString() {
        return getManufacturer() + "\n"+ getYear() + "\n" +getSerialNumber() + "\n" +"P\n"+ getCutWidth() + "\n" + getWheelDiameter() + "\n" + getNumWheels() + "\n";
        
    }

    /**
     * @return the numWheels
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * @param numWheels the numWheels to set
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
    
    
    
}
