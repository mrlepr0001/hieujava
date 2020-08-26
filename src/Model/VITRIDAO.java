/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.VITRI;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class VITRIDAO extends VAORAFILE {
    private final static String FILE_URL = "src/Files/VITRI.TXT";

    public VITRIDAO() {
        super(FILE_URL);
    }
    
    public ArrayList<VITRI> docViTri() {
        ArrayList<String> data = docFile();
        ArrayList<VITRI> dsViTri = new ArrayList<>();
        for (String viTriStr : data) {
            String[] arrViTri = viTriStr.split("-");
            int maVT = Integer.parseInt(arrViTri[0]);
            String tenVT = arrViTri[1];            
            double mucThuong = Double.parseDouble(arrViTri[2]);
            VITRI viTri = new VITRI(maVT, tenVT, mucThuong);
            dsViTri.add(viTri);
        }
        return dsViTri;
    }
    
    public void ghiViTri(ArrayList<VITRI> dsViTri) {
        ArrayList<String> dsViTriStr = new ArrayList<>();
        for (VITRI viTri : dsViTri) {
            String viTriStr = "";
            viTriStr += viTri.getMaVT() + "-";
            viTriStr += viTri.getTenVT() + "-";
            viTriStr += viTri.getMucThuong();
            dsViTriStr.add(viTriStr);
        }
        ghiFile(dsViTriStr);
    }
    
    public static void main(String[] args) {
        VITRIDAO viTriDAO = new VITRIDAO();
        ArrayList<VITRI> dsVitris = new ArrayList<>();
        dsVitris.add(new VITRI(1, "TIEN DAO", 100.0));
        dsVitris.add(new VITRI(2, "HAU VE", 100.0));
        dsVitris.add(new VITRI(3, "TRUNG VE", 100.0));
        viTriDAO.ghiViTri(dsVitris);
        
        ArrayList<VITRI> dsViTriDoc = new ArrayList<>();
        dsViTriDoc = viTriDAO.docViTri();
        
        for (VITRI viTri : dsViTriDoc) {
            System.out.println(viTri.getTenVT());
        }
    }
}
