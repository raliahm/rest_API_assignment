package com.csc340.Assignments;

import java.util.HashMap;
import java.util.Map;

public class geonamesMap {
    private Map<Integer, geonames> geonamesMap;
    private int id;
    public geonamesMap() {
        geonamesMap = new HashMap<Integer, geonames>();
        id = 1;
    }
    public void addGeonames(geonames geonames) {
        geonamesMap.put(id, geonames);
        id++;
    }
    public geonames getGeonames(int id) {
        return geonamesMap.get(id);
    }
    public geonames[] getGeonames() {
        return geonamesMap.values().toArray(new geonames[geonamesMap.size()]);
    }
    public geonames deleteGeonames(int id) {
        return geonamesMap.remove(id);
    }
}
