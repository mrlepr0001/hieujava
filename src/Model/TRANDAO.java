/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.TRAN;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TRANDAO extends VAORAFILE{
    private final static String FILE_URL = "TRAN.TXT";
    public ArrayList<TRAN> docTran() {
        ArrayList<String> data = docFile();
        ArrayList<TRAN> dsTran = null;
        for (String tranStr : data) {
            String[] arrTran = tranStr.split("|");
            int maTran = Integer.parseInt(arrTran[0]);
            String tenTran = arrTran[1];  
            TRAN tran = new TRAN(maTran, tenTran);
            dsTran.add(tran);
        }
        return dsTran;
    }
    
    public void ghiTran(ArrayList<TRAN> dsTran) {
        ArrayList<String> dsTranStr = null;
        for (TRAN tran : dsTran) {
            String tranStr = "";
            tranStr += tran.getMaTran() + "|";
            tranStr += tran.getTenTran() + "|";
            dsTranStr.add(tranStr);
        }
        ghiFile(dsTranStr);
    }
}
