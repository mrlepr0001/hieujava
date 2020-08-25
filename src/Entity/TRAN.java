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
public class TRAN {
    private int maTran;
    private String tenTran;

    public TRAN() {
    }

    public TRAN(int maTran, String tenTran) {
        this.maTran = maTran;
        this.tenTran = tenTran;
    }

    public int getMaTran() {
        return maTran;
    }

    public void setMaTran(int maTran) {
        this.maTran = maTran;
    }

    public String getTenTran() {
        return tenTran;
    }

    public void setTenTran(String tenTran) {
        this.tenTran = tenTran;
    }
    
    
}

