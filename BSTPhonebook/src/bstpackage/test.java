/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author dell
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException{
        
        TreeLibrary tree1= new TreeLibrary();
        
                    tree1.read("input.txt");
        
        tree1.insert(new Human("NAruto","1","2","3"));
        tree1.delete("Naruto","1");
        tree1.inorder();
    
    }
    
}
