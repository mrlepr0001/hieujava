/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class VAORAFILE {
    private String fileURL;

    public VAORAFILE(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
   
    public ArrayList<String> docFile() {
        InputStream inputStream = null;
        ArrayList<String> data = new ArrayList<>();
        try {
            File file = new File(fileURL);
            inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = "";
            while((line = reader.readLine()) != null){
                data.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return data;
    }
    
    public void ghiFile(ArrayList<String> data) {
        OutputStream outputStream = null;
        try {
            File file = new File(fileURL);
            outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            for (String item: data){
                outputStreamWriter.write(item);
                outputStreamWriter.write("\n");
            }
            outputStreamWriter.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                outputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(VAORAFILE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
