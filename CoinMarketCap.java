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
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
public class CoinMarketCap {
    
    public static void main(String[] args) throws IOException {
        
        //Scanner crypto = new Scanner(System.in);
        
        //System.out.println("Enter a CryptoCurrency's name to find its price");
        //String currency = crypto.nextLine();
        
        URL coinmktcap = new URL("https://api.coinmarketcap.com/v1/ticker/");
        
        URLConnection con = coinmktcap.openConnection();
        InputStream is = con.getInputStream();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

            // read each line and write to System.out
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
       
        System.out.println("This project has compiled successfully");
            
        }    
                 
}
