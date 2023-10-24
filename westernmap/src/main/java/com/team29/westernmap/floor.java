
package com.team29.westernmap;

/**
 *
 * @author adria
 */
public class floor {
    
    private int floorID;
    private int floorNumber;
    private int buildingID;
    
    public floor (int inputID, int inputNumber, building inputBuild){
        this.floorID = inputID;
        this.floorNumber = inputNumber;
        this.buildingID = inputBuild.getBID();
    }
    
    public int getFID(){
        return this.floorID;
    }
    
    public int getFNumber(){
        return this.floorNumber;
    }
    
    public void setFID(int ID){
        this.floorID = ID;
    }

    public void setFNumber(int Number){
        this.floorNumber = Number;
    }    
}

