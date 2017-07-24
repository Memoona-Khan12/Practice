package Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by memoona on 7/24/17.
 */

public class Reader {
    public static void main(String[] args) throws IOException {
        String filePath = "//Users//memoona//Desktop//filereader.pages";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String text="";
            while((text = br.readLine())!=null) {
                System.out.println(text);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            System.out.println("Let's close all the resources so they can be reused");
            if(br!=null){
               try{
                    br.close();
               }  catch (IOException e) {
                   e.printStackTrace();
               }

             if(fr!=null){
                   try {
                       fr.close();
                   }catch (IOException e) {
                       e.printStackTrace();
                   }}
             }
            }

        }
    }





