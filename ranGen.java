/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package understandingjava;

/**
 *
 * @author ElliotFriedman
 */
public class ranGen {
    
    public static void ranChar(int ctr) {
        int x = ctr + (int) (System.currentTimeMillis() % 127);
        while (x <= 32) {
            x++;
            if (x == 32)
                x += (int) (System.currentTimeMillis() % 80);
        }
        System.out.print((char)x);
    }
    
    public static void ran1(int ctr) {
        int x = ctr + (int) (System.currentTimeMillis() % 5);
        int y = ctr + (int) (System.currentTimeMillis() % 2);
        int z = ctr + (int) (System.currentTimeMillis() % 3);
        System.out.print(x + "" + y + "" + z);
        ranChar(ctr);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
        {
            int x = (int) (System.currentTimeMillis() % 5);
            ran1(x + i + i);
        }
    }
}
