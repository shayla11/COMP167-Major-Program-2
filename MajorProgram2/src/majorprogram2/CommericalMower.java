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
public class CommericalMower extends LawnTractor {
    
    private double operatingHours;
    private boolean zeroTurnRadius;
    
    public CommericalMower(){
        operatingHours = 0.0;
        zeroTurnRadius = false;
    }
    
    public String toString() {
        return getManufacturer() +"\n"+getYear()+ "\n"+ getSerialNumber() + "\n"+ "C\n" +getEngine() +"\n"+ getModel() 
                +"\n" + getDeckWidth() + "\n"+getOperatingHours() + "\n" + isZeroTurnRadius() + "\n" ;
    }

    /**
     * @return the operatingHours
     */
    public double getOperatingHours() {
        return operatingHours;
    }

    /**
     * @param operatingHours the operatingHours to set
     */
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    /**
     * @return the zeroTurnRadius
     */
    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    /**
     * @param zeroTurnRadius the zeroTurnRadius to set
     */
    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
    
    
    
}
