package packageTest.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 *
 */
/**
 * @author Dharmpal
 *
 */

public class DeleteFiles {
       public static void read() throws IOException {

        try {
        	String inDateFolder = "E:\\Delete";
            /*for(int i=0; i<inDateFolder.length; i++) {
    			System.out.println("Here First");
    			System.out.println("A : "+inDateFolder[i]);
    		}*/
            /*16/12/2016*/
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".jpg");
                }
            };
            /*16/12/2016*/
            File folder = new File(inDateFolder);
            File[] listOfFiles = folder.listFiles(filter);
            int count = 0;
            for (int i = 0; i < listOfFiles.length; i++) {

                File file = listOfFiles[i];
                file.getName().endsWith(".txt");
                FileInputStream fin = new FileInputStream(file);
                byte[] bt = new byte[fin.available()];
                fin.read(bt, 0, bt.length - 1);
                String str = new String(bt);
                String data[] = str.split("\n");
                fin.close();
                count++;
            File fil = new File(inDateFolder+ ".jpg");
            if(!fil.exists()){
            	System.out.println("asdfgh");
            }
            else{
            	fil.delete();
                System.out.println("File Deleted.....");
            }
            }
        } catch (Exception ex) {
            Logger.getLogger(DeleteFiles.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

}
