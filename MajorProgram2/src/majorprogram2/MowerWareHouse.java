
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shayla
 */
public class MowerWareHouse {
    
    private String storeName;
    private ArrayList<Mower> mowers;
    private ArrayList<Mower> lawnTractorMowers;
    private ArrayList<Mower> commercialMowers;
    private ArrayList<Mower> gasPoweredMowers;
    private ArrayList<Mower> pushReelMowers;
    
    public MowerWareHouse() {
        storeName=  "";
        mowers = new ArrayList<Mower>();
                lawnTractorMowers = new ArrayList<Mower>();        
                commercialMowers = new ArrayList<Mower>();
                gasPoweredMowers = new ArrayList<Mower>();
                pushReelMowers = new ArrayList<Mower>();
        
    }
    
    public void readMowerData(String inputFileName) {
        try {
            Scanner scan = new Scanner(new File(inputFileName));
            
            storeName = (scan.nextLine());
            while(scan.hasNext()) {
                
                String manu = scan.nextLine();
                int year = scan.nextInt(); scan.nextLine();
                String sn = scan.nextLine();
                String mowerType = scan.nextLine();
                
                if ("L".equals(mowerType)) {
                    LawnTractor lt = new LawnTractor();
                    mowerSetter(lt,manu,year,sn); 
                    
                    Engine e = new Engine();
                    e.setManufacturer(scan.nextLine());
                    e.setHorsePower(scan.nextDouble()); scan.nextLine();
                    e.setCylinders(scan.nextInt()); scan.nextLine();
                    
                    lt.setEngine(e);
                    
                    lt.setModel(scan.nextLine());
                    lt.setDeckWidth(scan.nextDouble()); scan.nextLine();
                    lawnTractorMowers.add(lt);

                    mowers.add(lt);
     
                }
                else if ("C".equals(mowerType)) {
                    CommericalMower cm = new CommericalMower();
                    mowerSetter(cm,manu,year,sn);
                    
                    Engine e = new Engine();
                    e.setManufacturer(scan.nextLine());
                    e.setHorsePower(scan.nextDouble());scan.nextLine();
                    e.setCylinders(scan.nextInt());scan.nextLine();
                    
                    cm.setEngine(e);
                    
                    cm.setModel(scan.nextLine());
                    cm.setDeckWidth(scan.nextDouble());scan.nextLine();
                    cm.setOperatingHours(scan.nextDouble());scan.nextLine();
                    cm.setZeroTurnRadius(scan.nextBoolean());scan.nextLine();

                    mowers.add(cm);
                    commercialMowers.add(cm);
                }
                else if ("G".equals(mowerType)) {
                    GasPoweredMower gpm = new GasPoweredMower();
                    mowerSetter(gpm,manu,year,sn);
                    
                    gpm.setCutWidth(scan.nextDouble());scan.nextLine();
                    gpm.setWheelDiameter(scan.nextDouble()); scan.nextLine();
                    
                    Engine e = new Engine();
                    e.setManufacturer(scan.nextLine());
                    e.setHorsePower(scan.nextDouble()); scan.nextLine();
                    e.setCylinders(scan.nextInt()); scan.nextLine();
                    gpm.setEngine(e);
                    
                    gpm.setSelfPropelled(scan.nextBoolean()); scan.nextLine();

                    mowers.add(gpm);
                    gasPoweredMowers.add(gpm);
                    
                }
                else if ("P".equals(mowerType)) {
                    PushReelMower prm = new PushReelMower();
                    mowerSetter(prm,manu,year,sn);
                    
                    prm.setCutWidth(scan.nextDouble()); scan.nextLine();
                    prm.setWheelDiameter(scan.nextDouble()); scan.nextLine();
                    prm.setNumWheels(scan.nextInt()); scan.nextLine();

                    mowers.add(prm);
                    pushReelMowers.add(prm);
   
                }
            }       
        } catch (FileNotFoundException ex){
            System.err.println("couldnt find the file buddy");
            System.exit(-1);            
        }
        
    }
    
    public void saveMowerData(String outputFileName) {
        try{
            PrintWriter output = new PrintWriter(outputFileName);
            output.println(toString());

            output.close();
            
        }catch(FileNotFoundException ex) {
            System.err.println("couldnt find the file buddy");
            System.exit(-1);
            
        }
        
        
    }
    
    //@Override
    public String toString() {
        String concat = "";
        for (int i = 0; i< mowers.size(); i++ ) {
            concat += mowers.get(i).toString();
        }
        return  storeName + "\n" +concat;           
    }
    
    //method that sets the Manufacturer Year and SerialNumber
    public void mowerSetter(Mower mow, String manufac, int year, String SN){
        mow.setManufacturer(manufac);
        mow.setYear(year);
        mow.setSerialNumber(SN);
    }
    
    public void engineSetter(Mower mow, String manu, Double horse, int cyl){
        Engine e = new Engine();
        e.setManufacturer(manu);
        e.setHorsePower(horse);
        e.setCylinders(cyl);
        
    }
    
    //Mower Arraylist Methods
    public int getNumMowers() {
        return mowers.size();
    }
    public Mower getMowers(int num) {
        return mowers.get(num);
    }
    public void setMowers(int num, Mower mow) {
        mowers.set(num, mow);
    }
    public void addMower(Mower item){
        mowers.add(item);
    }
    public Mower removeMower(int num) {
        return mowers.remove(num);

    }
    
        //LT Mower Arraylist Methods
    public int getNumLTMowers() {
        return lawnTractorMowers.size();
    }
    public Mower getLTMowers(int num) {
        return lawnTractorMowers.get(num);
    }
    public void setLTMowers(int num, Mower mow) {
        lawnTractorMowers.set(num, mow);
    }
    public void addLTMower(Mower item){
        lawnTractorMowers.add(item);
    }
    public Mower removeLTMower(int num) {
        return lawnTractorMowers.remove(num);
    }
   public String LTtoString(){
        String mowers = "";
        for (int i = 0; i < lawnTractorMowers.size(); i++){
            mowers += lawnTractorMowers.get(i) + "\n";
        }
        return mowers;
    }
    
    
    
    
    //LT Mower Arraylist Methods
    public int getNumCMowers() {
        return commercialMowers.size();
    }
    public Mower getCMowers(int num) {
        return commercialMowers.get(num);
    }
    public void setCMowers(int num, Mower mow) {
        commercialMowers.set(num, mow);
    }
    public void addCMower(Mower item){
        commercialMowers.add(item);
    }
    public Mower removeCMower(int num) {
        return commercialMowers.remove(num);
    }
    public String CtoString(){
        String mowers = "";
        for (int i = 0; i < commercialMowers.size(); i++){
            mowers += commercialMowers.get(i) + "\n";
        }
        return mowers;
    }
    
    
        //GSP Mower Arraylist Methods
    public int getNumGSPMowers() {
        return gasPoweredMowers.size();
    }
    public Mower getGSPMowers(int num) {
        return gasPoweredMowers.get(num);
    }
    public void setGSPMowers(int num, Mower mow) {
        gasPoweredMowers.set(num, mow);
    }
    public void addGSPMower(Mower item){
        gasPoweredMowers.add(item);
    }
    public Mower removeGSPMower(int num) {
        return gasPoweredMowers.remove(num);
    }
    public String GSPtoString(){
        String mowers = "";
        for (int i = 0; i < gasPoweredMowers.size(); i++){
            mowers += gasPoweredMowers.get(i) + "\n";
        }
        return mowers;
    }
    
    
    
    
    //PR Mower Arraylist Methods
    public int getNumPRMowers() {
        return pushReelMowers.size();
    }
    public Mower getPRMowers(int num) {
        return pushReelMowers.get(num);
    }
    public void setPRMowers(int num, Mower mow) {
        pushReelMowers.set(num, mow);
    }
    public void addPRMower(Mower item){
        pushReelMowers.add(item);
    }
    public Mower removePRMower(int num) {
        return pushReelMowers.remove(num);
    }
    public String PRtoString(){
        String mowers = "";
        for (int i = 0; i < pushReelMowers.size(); i++){
            mowers += pushReelMowers.get(i) + "\n";
        }
        return mowers;
    }
    
    
 
}
