/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.CAUTHU;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class CAUTHUDAO extends VAORAFILE {
    private final static String FILE_URL = "src/Files/CAUTHU.TXT";

    public CAUTHUDAO() {
        super(FILE_URL);
    }
    
    public ArrayList<CAUTHU> docCauThu() {
        ArrayList<String> data = docFile();
        ArrayList<CAUTHU> dsCauThu = new ArrayList<>();
        for (String cauThuStr : data) {
            String[] arrCauThu = cauThuStr.split("-");
            int maCauThu = Integer.parseInt(arrCauThu[0]);
            String hoTen = arrCauThu[1];
            int tuoi = Integer.parseInt(arrCauThu[2]);
            double mucLuong = Double.parseDouble(arrCauThu[3]);
            CAUTHU cauThu = new CAUTHU(maCauThu, hoTen, tuoi, mucLuong);
            dsCauThu.add(cauThu);
        }
        return dsCauThu;
    }
    
    public void ghiCauThu(ArrayList<CAUTHU> dsCauThu) {
        ArrayList<String> dsCauThuStr = new ArrayList<>();
        for (CAUTHU cauThu : dsCauThu) {
            String cauThuStr = "";
            cauThuStr += cauThu.getMaCT() + "-";
            cauThuStr += cauThu.getHoTen() + "-";
            cauThuStr += cauThu.getTuoi() + "-";
            cauThuStr += cauThu.getMucLuong();
            dsCauThuStr.add(cauThuStr);
        }
        ghiFile(dsCauThuStr);
    }
    
    public static void main(String[] args) {
        CAUTHUDAO cauThuDAO = new CAUTHUDAO();
        ArrayList<CAUTHU> dsCauThu = new ArrayList<>();
        dsCauThu.add(new CAUTHU(1, "BAY", 20, 100.0));
        dsCauThu.add(new CAUTHU(2, "HIEU", 20, 100.0));
        dsCauThu.add(new CAUTHU(3, "DUNG", 20, 100.0));
        cauThuDAO.ghiCauThu(dsCauThu);
        
        ArrayList<CAUTHU> dsCauThuDoc = new ArrayList<>();
        dsCauThuDoc = cauThuDAO.docCauThu();
        
        for (CAUTHU cauthu : dsCauThuDoc) {
            System.out.println(cauthu.getHoTen());
        }
    }
}
