/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ADMIN
 */
public class CAUTHU {
    private int maCT;
    private String hoTen;
    private int tuoi;
    private double mucLuong;
    
    public CAUTHU() {
    }

    public CAUTHU(int maCT, String hoTen, int tuoi, double mucLuong) {
        this.maCT = maCT;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.mucLuong = mucLuong;
    }

    public int getMaCT() {
        return maCT;
    }

    public void setMaCT(int maCT) {
        this.maCT = maCT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }
}


