/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.team29.westernmap;

/**
 *
 * @author huiliangxia
 */
public class SearchPOI {
    private String input;

    public SearchPOI(String input) {
        this.input = input;
    }

    public POI searchPOIBar(com.team29.westernmap.POIBar poiBar) {
        int roomNumber;

        try {
            roomNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null; // Invalid input, cannot be parsed as room number
        }

        return poiBar.get(roomNumber);
    }

}
