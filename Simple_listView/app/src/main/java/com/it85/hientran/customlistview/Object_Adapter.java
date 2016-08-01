package com.it85.hientran.customlistview;

/**
 * Created by hientran on 3/22/2016.
 */
public class Object_Adapter {
    String tenversion;
    String version;
    int hinh;

    public Object_Adapter() {
    }

    public Object_Adapter(String tenversion, String version, int hinh) {
        this.tenversion = tenversion;
        this.version = version;
        this.hinh = hinh;
    }

    public String getTenversion() {
        return tenversion;
    }

    public void setTenversion(String tenversion) {
        this.tenversion = tenversion;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
