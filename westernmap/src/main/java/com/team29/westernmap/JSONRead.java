package com.team29.westernmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author adria
 */
public class JSONRead{
    
    public static void main(String [] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        
        FileReader reader = new FileReader("src/main/java/JSONmetadata/EC.json");

        Object obj = jsonparser.parse(reader);    
        
        JSONArray Elborn = (JSONArray)obj;
        
        for (int i=0; i<Elborn.size(); i++){
            
            JSONObject floor = (JSONObject)Elborn.get(i);
            
            JSONObject catList = (JSONObject)floor.get("POI");
            
            for (Object currentKey: catList.keySet()){
                
                JSONArray poiList = (JSONArray)catList.get((String)currentKey);              
                
                for (int k = 0; k<poiList.size(); k++){
                    
                    JSONObject poi = (JSONObject)poiList.get(k);
                    
                    System.out.println("Name: " + poi.get("name"));
                    System.out.println("Number: " + poi.get("roomNumber"));
                    System.out.println("Category: " + poi.get("category"));
                    System.out.println("X-coordinate: " + poi.get("x-coordinate"));
                    System.out.println("Y-coordinate: " + poi.get("y-coordinate"));
                    System.out.println("Description: " + poi.get("description"));
                    System.out.println("Highlighted: " + poi.get("highlighted") + "\n");
                }
            }         
        }
    }
}

