
package com.team29.westernmap;

/**
 *
 * @author adria
 */
public class layer {
    
    private String category;
    private boolean hidden;
    
    public layer (String inputCat){
        this.category = inputCat;
        this.hidden = false;
    }
    
    public void setHidden(boolean Hid){
        this.hidden = Hid;
    }
    
    //public void addPOI()
    //public void editPOI()
    //public void removePOI()
}

