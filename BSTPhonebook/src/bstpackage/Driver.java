/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;

import java.io.FileNotFoundException;

/**
 *
 * @author dell
 */
public class Driver {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        
        
        
        TreeLibrary tree1=new TreeLibrary();
        
        tree1.read("input.txt");
        
        
        tree1.insert(new Human("Naruto","23","24","25"));
        tree1.search("NaruTo");
    }
    
}
