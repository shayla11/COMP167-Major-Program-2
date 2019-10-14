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
public class Engine {
    
    private String manufacturer;
    private double horsePower;
    private int cylinders;
    
    public Engine() {
        manufacturer = "";
        horsePower = 0.0;
        cylinders = 0;
        
    }
    
    public Engine(String man, double horse, int cyln) {
        manufacturer = man;
        horsePower = horse;
        cylinders = cyln;
    }
    
    public String toString() {
        return getManufacturer() + "\n" + getHorsePower() + "\n" + getCylinders();
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the horsePower
     */
    public double getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * @return the cylinders
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * @param cylinders the cylinders to set
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    
    
    
    
}
