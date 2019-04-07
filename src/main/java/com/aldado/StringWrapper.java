package com.aldado;

public class StringWrapper implements CacheAble {

    private String s;

    public StringWrapper(String s) {
        this.s = s;
    }

    @Override
    public boolean isCacheAble() {
        return true;
    }
}
