package com.it85.hientran.customlistview;

/**
 * Created by HienTran on 8/1/2016.
 */
public class Android {
    String tenversion;
    String version;
    int hinh;

    public Android(String tenversion, String version, int hinh) {
        this.tenversion = tenversion;
        this.version = version;
        this.hinh = hinh;
    }

    public Android() {

    }

    public String getTenversion() {
        return tenversion;
    }

    public void setTenversion(String tenversion) {
        this.tenversion = tenversion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
