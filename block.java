/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ElliotFriedman
 */

public class block
{
    private static int g_index = 0;
    int c_index;
    
    public int getindex()
    {
        return g_index - 1;
    }
    
    public block()
    {
        c_index = getindex() + 1;
        g_index++;
        
        System.out.println("current block: " + getindex());
    }

    public void setindex(int cur)
    {
        if (cur >= 0)
        {
            g_index = cur;
        }
        System.out.println("current block: " + g_index);
    }
}