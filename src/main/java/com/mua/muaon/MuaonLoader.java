package com.mua.muaon;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class MuaonLoader {

    public String getMuaonFromResources(String filename) {
        String result = "";

        try {
            result = IOUtils.toString(getClass().getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
