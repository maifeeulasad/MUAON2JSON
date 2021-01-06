package com.mua.muaon.internal;

import java.util.HashMap;
import java.util.Map;

public class MObject {
    public Map<String, MValue> pairs=new HashMap<String, MValue>();

    @Override
    public String toString() {
        boolean first=true;
        String res = "{";
        for(String key:pairs.keySet()){
            res+=(first?"":",") + "\"" + key+ "\"" +" : "+pairs.get(key);
            first=false;
        }
        return res+"}";
    }
}
