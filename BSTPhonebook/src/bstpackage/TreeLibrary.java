/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class TreeLibrary {
    BSTNode root;
    TreeLibrary(){
        root=null;
    }
    public void insert(Human h){
        if(root==null){
            root=new BSTNode(h);
            return;
        }
        root.insert(h);
    }
    
    public void read(String Filename) throws FileNotFoundException{
        File file = new File(Filename);
        Scanner sc = new Scanner(file);
        
        String[] arry;
        
        
        while(sc.hasNext())
        {
            arry = sc.nextLine().split(" ",0);
            insert(new Human(arry[0],arry[1],arry[2],arry[3]));
            
        }
        
    
        
    }
    
    public void inorder(){
        if (root==null){
            System.out.println("Empty");
        }
        else{
            root.inorder();
        }
    }
    
    public void search(String FirstName){
        if(root==null){
            System.out.println("Empty");
            
        }
        else{
            root.search(FirstName);
        }
            
    }
}
