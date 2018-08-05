/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptoalertapp;

/**
 *
 * @author ElliotFriedman
 */
import java.io.*;
public class WriteAFileTake2 {
    
    public static void main(String[] args) throws Exception{
        
        try {
             
        File file = new File("newFile.txt");
        
        if(!file.exists()){
           file.createNewFile(); 
        }
        
        PrintWriter pw = new PrintWriter(file);
        pw.println("This is sparta");
        pw.close();
        System.out.println("This project has compiled successfully");
            
        }    
            catch (IOException e){
                e.printStackTrace();
            }
    }
      
}