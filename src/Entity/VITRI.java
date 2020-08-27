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
public class VITRI {
    private int maVT;
    private String tenVT;
    private double mucThuong;

    public VITRI() {
    }
    
    public VITRI(int maVT) {
        this.maVT = maVT;
    }
    
    public VITRI(int maVT, String tenVT, double mucThuong) {
        this.maVT = maVT;
        this.tenVT = tenVT;
        this.mucThuong = mucThuong;
    }

    
    public int getMaVT() {
        return maVT;
    }

    public void setMaVT(int maVT) {
        this.maVT = maVT;
    }

    public String getTenVT() {
        return tenVT;
    }

    public void setTenVT(String tenVT) {
        this.tenVT = tenVT;
    }

    public double getMucThuong() {
        return mucThuong;
    }

    public void setMucThuong(double mucThuong) {
        this.mucThuong = mucThuong;
    }

    @Override
    public String toString() {
        return getTenVT();
    }
}


