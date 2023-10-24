/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONmetadata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.valueOf;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tristan
 */
public class experiment {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
    String file = "src/main/java/JSONMetaData/userCreated.json";
    JSONParser parser = new JSONParser();
    Object obj = parser.parse(new FileReader(file));
    JSONObject jsonFile = (JSONObject) obj;
    System.out.println(jsonFile);
    JSONArray jsonType = (JSONArray) jsonFile.get("UserCreated");
    System.out.println(jsonType);
    JSONObject poiDetails = (JSONObject) jsonType.get(0);
    System.out.println(poiDetails);
    if(poiDetails.size() == 0){
        System.out.println("this is null");
    }
    for(int i = 0; i < jsonType.size(); i++){
        JSONObject temp = (JSONObject) jsonType.get(i);
        if((temp.get("roomNumber").equals("0234"))){
            temp.put("floor", "it works");
            temp.put("name", "worksSSS");
        }
    }
    
//    poiDetails.put("building", "AHB");
//    poiDetails.put("floor", "Second Floor");
//    poiDetails.put("name", "TEST");
//    poiDetails.put("roomNumber", "0123");
//    poiDetails.put("category", "Washroom");
//    poiDetails.put("description", "This is a description");
//    poiDetails.put("x", "60");
//    poiDetails.put("y", "40");
//    JSONObject poi = new JSONObject();
//    poi.put("building", "AHB");
//    poi.put("floor", "teesting Floor");
//    poi.put("name", "TEST");
//    poi.put("roomNumber", "0234");
//    poi.put("category", "Washroom");
//    poi.put("description", "This is a description");
//    poi.put("x", "60");
//    poi.put("y", "40");
//    jsonType.add(poi);
    System.out.println(jsonFile);
//    try (FileWriter files = new FileWriter(file)) {
//            //We can write any JSONArray or JSONObject instance to the file
//    files.write(jsonFile.toJSONString()); 
//    files.flush();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
    System.out.println(valueOf(true).getClass().getName());
}
    
}
