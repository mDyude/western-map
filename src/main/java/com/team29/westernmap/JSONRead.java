
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
        
        FileReader reader = new FileReader("The JSON file location");
        
        Object obj = jsonparser.parse(reader);
        
        JSONObject MCobj = (JSONObject)obj;
        
        JSONArray POIarray = (JSONArray)MCobj.get("POI");
        
        for (int i=0; i<POIarray.size(); i++){
            JSONObject poi = (JSONObject)POIarray.get(i);
            
            System.out.println("Name: " + poi.get("name"));
            System.out.println("Number: " + poi.get("roomNumber"));
            System.out.println("Category: " + poi.get("category"));
            System.out.println("Position: " + poi.get("position"));
            System.out.println("Description: " + poi.get("description"));
            System.out.println("Highlighted: " + poi.get("highlighted") + "\n");
            
        }
    }
}
