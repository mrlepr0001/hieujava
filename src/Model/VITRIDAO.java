/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class VITRIDAO {
    private final static String FILE_URL = "CAUTHU.TXT";
    public ArrayList<CAUTHU> docCauThu() {
        ArrayList<String> data = docFile();
        ArrayList<CAUTHU> dsCauThu = null;
        for (String cauThuStr : data) {
            String[] arrCauThu = cauThuStr.split("|");
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
        ArrayList<String> dsCauThuStr = null;
        for (CAUTHU cauThu : dsCauThu) {
            String cauThuStr = "";
            cauThuStr += cauThu.getMaCT() + "|";
            cauThuStr += cauThu.getHoTen() + "|";
            cauThuStr += cauThu.getTuoi() + "|";
            cauThuStr += cauThu.getMucLuong() + "|";
            dsCauThuStr.add(cauThuStr);
        }
        ghiFile(dsCauThuStr);
    }
}
