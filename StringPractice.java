/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author ElliotFriedman
 */
public class StringPractice {
    
    public static void main(String[] args){
        
        String s1 = "Welcome to Java"; 
        String s2 = "Programming is fun"; 
        String s3 = "Welcome to Java";
        
        boolean a = s1 == s2;
        boolean b = s2 == s3;
        boolean c = s1.equals(s2);
        boolean d = s1.equals(s3);
        int e = s1.compareTo(s2);
        int f = s2.compareTo(s3);
        int g = s2.compareTo(s2);
        char h = s1.charAt(0);
        int i = s1.indexOf('J');
        int j = s1.indexOf("to");
        int k = s1.lastIndexOf('a');
        int l = s1.lastIndexOf("o", 15);
        int m = s1.length();
        String n = s1.substring(5);
        String o = s1.substring(5, 11);
        boolean p = s1.startsWith("Welc");
        boolean q = s1.endsWith("Java");
        String t = s1.concat(s2);
        boolean u = s1.contains(s2);
        String v = "\t Wel \t".trim();
        
        System.out.println(""
        + a +" "
        + "\n"+ b 
        + "\n"+ c
        + "\n"+ d
        + "\n"+ e
        + "\n"+ f
        + "\n"+ g
         + "\n"+ h
        + "\n"+ i
        + "\n"+ j
        + "\n"+ k
        + "\n"+ l
        + "\n"+ m
        + "\n"+ n
        + "\n"+ o
        + "\n"+ p
        + "\n"+ q
        + "\n"+ t
        + "\n"+ u
        + "\n"+ v
        );
        
        
        
        
    }
    
}
