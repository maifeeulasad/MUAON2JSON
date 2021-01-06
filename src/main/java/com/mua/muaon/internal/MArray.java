package com.mua.muaon.internal;

import java.util.ArrayList;
import java.util.List;

public class MArray {
    public List<MValue> mValues =new ArrayList<MValue>();

    public MArray(){

    }

    public MArray(List<MValue> mValues){
        this.mValues=mValues;
    }

    @Override
    public String toString() {
        String res="[";
        boolean first=true;
        for(MValue mValue:mValues){
            res+=(first?"":",") + mValue.toString();
            first=false;
        }
        return res+"]";
    }
}
