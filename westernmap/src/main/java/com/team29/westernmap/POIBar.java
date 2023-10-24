/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.team29.westernmap;
import java.util.Hashtable;

/**
 *
 * @author huiliangxia
 */
public class POIBar {
    private Hashtable<Integer, com.team29.westernmap.POI> table;
    private int records;

    public POIBar() {
        table = new Hashtable<>();
        records = 0;
    }

    public int put(POI poi) {
        int roomNumber = poi.getRm();
        if (table.containsKey(roomNumber)) {
            return -1; // Room number already exists
        }
        
        table.put(roomNumber, poi);
        records++;
        return roomNumber;
    }

    public void remove(int roomNumber) {
        if (table.containsKey(roomNumber)) {
            table.remove(roomNumber);
            records--;
        }
    }

    public POI get(int roomNumber) {
        return table.get(roomNumber);
    }

    public int getRecords() {
        return records;
    }

}
