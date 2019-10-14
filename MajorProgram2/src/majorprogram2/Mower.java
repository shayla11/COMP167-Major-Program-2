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
public abstract class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;
    
    public Mower(){
        manufacturer = "";
        year = 0;
        serialNumber = "";
    }
    
    public Mower(String man, int y, String sn){
        manufacturer = man;
        year = y;
        serialNumber = sn;     
    }
    
    public String toString(){
        return getManufacturer() + "\n" + getYear() + "\n" + getSerialNumber();
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    

    
}
