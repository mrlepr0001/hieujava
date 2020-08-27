/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.CAUTHU;
import Entity.PCVT;
import Entity.VITRI;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author baynv
 */
public class PCVTDAO extends VAORAFILE {
    private final static String FILE_URL = "src/Files/PCVT.TXT";
    ArrayList<CAUTHU> dsCauThu = new CAUTHUDAO().docCauThu();
    ArrayList<VITRI> dsViTri = new VITRIDAO().docViTri();
    
    public PCVTDAO() {
        super(FILE_URL);
    }
    
    public ArrayList<PCVT> docPhanCong() {
        ArrayList<String> data = docFile();
        ArrayList<PCVT> dsPhanCong = new ArrayList<>();
        for (String phanCongStr : data) {
            String[] arrPCVT = phanCongStr.split("-");
            int soTran = Integer.parseInt(arrPCVT[0]);
            int maCT = Integer.parseInt(arrPCVT[1]);
            int maVT = Integer.parseInt(arrPCVT[2]);
            
            int indexCauThu = dsCauThu.stream().map(cauThu -> cauThu.getMaCT()).collect(Collectors.toList()).indexOf(maCT);
            int indexViTri = dsViTri.stream().map(cauThu -> cauThu.getMaVT()).collect(Collectors.toList()).indexOf(maVT);
            
            PCVT phanCong = new PCVT(
                    dsCauThu.get(indexCauThu),
                    dsViTri.get(indexViTri), soTran);
            dsPhanCong.add(phanCong);
        }
        return dsPhanCong;
    }
    
    public void ghiPhanCong(ArrayList<PCVT> dsPCVT) {
        ArrayList<String> dsPCCVStr = new ArrayList<>();
        for (PCVT pcvt : dsPCVT) {
            String PCVTStr = "";
            PCVTStr += pcvt.getSoTran() + "-";
            PCVTStr += pcvt.getCauThu().getMaCT() + "-";
            PCVTStr += pcvt.getViTri().getMaVT();
            dsPCCVStr.add(PCVTStr);
        }
        ghiFile(dsPCCVStr);
    }
    
    public static void main(String[] args) {
        PCVTDAO pcvtDAO = new PCVTDAO();
        ArrayList<PCVT> dsPCVT = new ArrayList<>();
        dsPCVT.add(new PCVT(new CAUTHU(1), new VITRI(1), 2));
        dsPCVT.add(new PCVT(new CAUTHU(2), new VITRI(2), 3));
        dsPCVT.add(new PCVT(new CAUTHU(3), new VITRI(3), 5));
        pcvtDAO.ghiPhanCong(dsPCVT);
        
        ArrayList<PCVT> dsPCVTDoc = new ArrayList<>();
        dsPCVTDoc = pcvtDAO.docPhanCong();
        
        for (PCVT pcvt : dsPCVTDoc) {
            System.out.println(
                pcvt.getSoTran()
                + "-" + pcvt.getCauThu().getHoTen()
                + "-" + pcvt.getViTri().getTenVT());
        }
    }
}
