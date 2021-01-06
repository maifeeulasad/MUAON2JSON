package com.mua.muaon;

public class Application {
    public static void main(String[] args) {

        new MuaonDecoder().decode(
                new MuaonLoader().getMuaonFromResources("1.muaon")
        );

    }
}
