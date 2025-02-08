package com.csc340.Assignments;

import java.util.HashMap;
import java.util.Map;
import com.csc340.Assignments.Place;

public class PlacesMap {
    private Map<Integer, Place> placeMap;
    private int id;
    public PlacesMap() {
        placeMap = new HashMap<Integer, Place>();
        id = 0;
    }
    public void addPlace(Place place) {
        placeMap.put(id, place);
        id++;
    }
    public Place getPlace(int id) {
        return placeMap.get(id);
    }
    public Place[] getPlaces() {
        return placeMap.values().toArray(new Place[placeMap.size()]);
    }
    public Place deletePlace(int id) {
        return placeMap.remove(id);
    }
}
