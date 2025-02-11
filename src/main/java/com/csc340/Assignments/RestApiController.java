package com.csc340.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.csc340.Assignments.geonames;
import com.csc340.Assignments.geonamesMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestApiController {
    Map<Integer, List<geonames>> geonamesDatabase = new HashMap<Integer, List<geonames>>();
    /*
     * Hello World API endpoint.
     *
     * @return response string.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    /**
     * understanding postman and debugging
     */
    @GetMapping("/name/{name}")
    public String name(@PathVariable("name") String name) {
        System.out.println("name: " + name);
        return "Hello " + name;
    }

    /**
     *  geonames : http://api.geonames.org/findNearbyPlaceNameJSON?lat=47.3&lng=9&username=demo
     *
     */
    @GetMapping("/geonames")
    public String geonames() {
        return "Geonames" ;
    }


    @GetMapping("/findNearbyPlaceName")
    public Object findNearbyPlaceName() {
        try {
            System.out.println("findNearbyPlaceName begining");
            String url = "http://api.geonames.org/findNearbyPlaceNameJSON?lat=47.3&lng=9&username=raliahm";
            System.out.println("findNearbyPlaceName url: " + url);
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();
            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);


            int id = 0;
            for (JsonNode rt : root) {
                geonames gn;
                List<geonames> geonamesList = new ArrayList<>();
                for( JsonNode geoname : rt) {
                    String adminCode1 = geoname.get("adminCode1").asText();
                    System.out.println("adminCode1: " + adminCode1);
                    String lng = geoname.get("lng").asText();
                    System.out.println("lng: " + lng);
                    String distance = geoname.get("distance").asText();
                    System.out.println("distance: " + distance);
                    int geonameId = geoname.get("geonameId").asInt();
                    System.out.println("geonameId: " + geonameId);
                    String toponymName = geoname.get("toponymName").asText();
                    System.out.println("toponymName: " + toponymName);
                    String countryId = geoname.get("countryId").asText();
                    System.out.println("countryId: " + countryId);
                    String fcl = geoname.get("fcl").asText();
                    System.out.println("fcl: " + fcl);
                    int population = geoname.get("population").asInt();
                    System.out.println("population: " + population);
                    String countryCode = geoname.get("countryCode").asText();
                    System.out.println("countryCode: " + countryCode);
                    String name = geoname.get("name").asText();
                    System.out.println("name: " + name);
                    String fclName = geoname.get("fclName").asText();
                    System.out.println("fclName: " + fclName);
                    String countryName = geoname.get("countryName").asText();
                    System.out.println("countryName: " + countryName);
                    String fcodeName = geoname.get("fcodeName").asText();
                    System.out.println("fcodeName: " + fcodeName);
                    String adminName1 = geoname.get("adminName1").asText();
                    System.out.println("adminName1: " + adminName1);
                    String lat = geoname.get("lat").asText();
                    System.out.println("lat: " + lat);
                    String fcode = geoname.get("fcode").asText();
                    System.out.println("fcode: " + fcode);

                    gn = new geonames(adminCode1,lng,distance,geonameId,toponymName,countryId,fcl,population, countryCode,name,fclName, adminCodes1, countryName,fcodeName,adminName1,lat,fcode);
                    System.out.println("geonames: " + gn.getToponymName());
                    geonamesList.add(gn);
                }
                geonamesDatabase.put(id,geonamesList);
            }
            return geonamesDatabase;
        } catch (JsonProcessingException e) {
            Logger.getLogger(RestApiController.class.getName()).log(Level.SEVERE,
                    null, e);
            return "error in /findNearbyPlaceName";
        }


    }
}
