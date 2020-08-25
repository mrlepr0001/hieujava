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
    private TRAN tran;
    private VITRI viTri;

    public PCVT() {
    }

    public PCVT(CAUTHU cauThu, TRAN tran, VITRI viTri) {
        this.cauThu = cauThu;
        this.tran = tran;
        this.viTri = viTri;
    }

    public CAUTHU getCauThu() {
        return cauThu;
    }

    public void setCauThu(CAUTHU cauThu) {
        this.cauThu = cauThu;
    }

    public TRAN getTran() {
        return tran;
    }

    public void setTran(TRAN tran) {
        this.tran = tran;
    }

    public VITRI getViTri() {
        return viTri;
    }

    public void setViTri(VITRI viTri) {
        this.viTri = viTri;
    }
    
    
}
