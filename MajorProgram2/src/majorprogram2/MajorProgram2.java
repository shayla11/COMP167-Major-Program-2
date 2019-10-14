/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author shayla
 */
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MowerWareHouse house = new MowerWareHouse();
        Menu test = new Menu();
        test.show();


               
           //Original Engine
        Engine e = new Engine("Engine", 4000, 6);    
//        
//        //LawnTractor
//        LawnTractor lt = new LawnTractor();
//        lt.setDeckWidth(34.45);
//        lt.setModel("model for lt");
//        lt.setEngine(e);
//        lt.setManufacturer("manufacturer for lt");
//        lt.setYear(2019);
//        lt.setSerialNumber("SN for lt");
//        house.addMower(lt);
//        
//    
//        //Commerical Mower
//        CommericalMower cm = new CommericalMower();
//        cm.setManufacturer("manufacturer for cm");
//        cm.setSerialNumber("SN for cm");
//        cm.setYear(2022);
//        cm.setOperatingHours(5.67);
//        cm.setZeroTurnRadius(true);
//        cm.setEngine(e);
//        house.addMower(cm);
//        
//        
//        //Gaspowered Mower
//        GasPoweredMower gpm = new GasPoweredMower();
//        gpm.setManufacturer("manufacturer for gpm");
//        gpm.setSerialNumber("SN for phm");
//        gpm.setYear(2022);
//        gpm.setCutWidth(48);
//        gpm.setWheelDiameter(3.14);
//        gpm.setSelfPropelled(true);
//        gpm.setEngine(e);        
//        house.addMower(gpm);
//        
//  
        //PushReel Mower Test 
        PushReelMower prm = new PushReelMower();
        prm.setCutWidth(.23);
        prm.setNumWheels(4);
        prm.setCutWidth(.123);
        prm.setWheelDiameter(3.14);
        prm.setManufacturer("TeslaPRM");
        prm.setYear(2020);
        prm.setSerialNumber("TSL3477");
        house.addMower(prm);
        
       //JOptionPane.showMessageDialog(null, house);

        
        //System.out.println(house.toString());
        house.readMowerData(args[0]);
        //System.out.println(house.toString());
        house.saveMowerData("Mower Data");
        //System.out.println(house.toString());
       
        
        //WAIT TILL YOU GET HELP FOR THIS PART, UNTIL THEN KEEP IT TRUCKING
        
        
//        if (args.length== 0) {
//            house.readMowerData(args[0]);
//            house.saveMowerData("Mower Data");
//
//        } else{
//            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//            int returnValue = jfc.showOpenDialog(null);            
//            File selectedFile = jfc.getSelectedFile();
//            house.readMowerData(selectedFile.toString());
//            house.saveMowerData("sFile");
//            System.out.println(selectedFile.getAbsolutePath());
//        }

        
        }


        
    }
    
