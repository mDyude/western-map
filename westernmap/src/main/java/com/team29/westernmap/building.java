
package com.team29.westernmap;

/**
 *
 * @author adria
 */
public class building {
    
    private int buildingID;
    private String buildingName;
    
    public building(int inputID, String inputName){
        this.buildingID = inputID;
        this.buildingName = inputName;
    }
    
    public int getBID() {
        return this.buildingID;
    }
    
    public String getBName(){
        return this.buildingName;
    }
    
    public void setBID(int ID){
        this.buildingID = ID;
    }
    
    public void setBName(String Name) {
        this.buildingName = Name;
    }
    
}

