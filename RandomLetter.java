/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author ElliotFriedman
 */
public class RandomLetter 
{
    public static void main(String[] args)
    {
        int ij = 0;
        while (ij < 5)
        {
        int a, b, c, d, e, f, g, h, i, j;
        char a1, b1, c1, d1, e1, f1, g1, h1, i1, j1;
        
        a = (int)Math.random()*((26) + 1) + 71;
        b = (int)Math.random()*((26) + 1) + 71;
        c = (int)Math.random()*((26) + 1) + 71;
        d = (int)Math.random()*((26) + 1) + 71;
        e = (int)Math.random()*((26) + 1) + 71;
        f = (int)Math.random()*((26) + 1) + 71;
        g = (int)Math.random()*((26) + 1) + 71;
        h = (int)Math.random()*((26) + 1) + 71;
        i = (int)Math.random()*((26) + 1) + 71;
        j = (int)Math.random()*((26) + 1) + 71;
        
        a1 = (char) a;
        b1 = (char) b;
        c1 = (char) c;
        d1 = (char) d;
        e1 = (char) e;
        f1 = (char) f;
        g1 = (char) g;
        h1 = (char) h;
        i1 = (char) i;
        j1 = (char) j;
        
        System.out.println(a1+""+b1+""+c1+""+d1+""+e1+""+f1+""+g1+h1+i1+j1);
        ij++;
        } 
    }        
    
}
