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
public class LawnTractor extends Mower {
    
    private Engine engine;
    private String model;
    private double deckWidth;
    
    public LawnTractor() {
        engine = null;
        model = "";
        deckWidth = 0.0;
    }
    
    public String toString() {
        return super.toString()+"\n" + "L\n" + getEngine() + "\n" + getModel() + "\n" + getDeckWidth()+"\n";
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the deckWidth
     */
    public double getDeckWidth() {
        return deckWidth;
    }

    /**
     * @param deckWidth the deckWidth to set
     */
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    
    
    
}
