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
public class PCVT {
    private CAUTHU cauThu;
    private VITRI viTri;
    private int soTran;

    public PCVT() {
    }

    public PCVT(CAUTHU cauThu, VITRI viTri, int soTran) {
        this.cauThu = cauThu;
        this.soTran = soTran;
        this.viTri = viTri;
    }

    public CAUTHU getCauThu() {
        return cauThu;
    }

    public void setCauThu(CAUTHU cauThu) {
        this.cauThu = cauThu;
    }

    public VITRI getViTri() {
        return viTri;
    }

    public void setViTri(VITRI viTri) {
        this.viTri = viTri;
    }

    public void setSoTran(int soTran) {
        this.soTran = soTran;
    }

    public int getSoTran() {
        return soTran;
    }   
}
