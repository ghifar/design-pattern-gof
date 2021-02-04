package com.company.creational.initialbuilder;

public class InitialBuilder {

    private String paramku;
    private String paramku2;

    public String getParamku() {
        return paramku;
    }


    public String getParamku2() {
        return paramku2;
    }

    public static InitialBuilder Builder() {
        return new InitialBuilder();
    }

    public InitialBuilder satu(String paramku) {
        this.paramku = paramku;
        return this;
    }
    public InitialBuilder dua(String paramku2) {
        this.paramku2 = paramku2;
        return this;
    }

}
