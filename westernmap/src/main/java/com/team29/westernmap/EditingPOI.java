/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cs2212.editingpoi;

/**
 *
 * @author 16214
 */
public class EditingPOI {

    public class User{
        private String name;
	public User(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
    }
    public boolean isEditor(User user){
	return user.getName().startsWith("editor_");
    }
    
    public class POI {
        private String name;
        private double latitude;
        private double longitude;
        private String description;
        public POI(String name, double latitude, double longitude, String description) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
            this.description = description;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getLatitude() {
            return latitude;
        }
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
        public double getLongitude() {
            return longitude;
        }
        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }
        
    public void editPOI (POI poi){
	poi.setName("New POI Name");
	poi.setLatitude(0);
        poi.setLongitude(0);
        poi.setDescription("description");
    }
    
    public void deletePOI(POI poi){
        poi = null;
    }
}
