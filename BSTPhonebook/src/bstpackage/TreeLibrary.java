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
    
    public BSTNode getPredecessor(BSTNode del)
    {
        BSTNode current = del.left;
        BSTNode predecessor=null;
        BSTNode parent=null;
        while(current!=null)
        {
            parent=predecessor;
            
            predecessor=current;
           
            current=current.right;
        }
        if(parent!=null)
        {
            parent.right=predecessor.left;
            
        }
        return predecessor;
        
        
    }
    
    public boolean delete(String id,String Lname)
    {
        if(root==null)
        {
            return false;
        }
        else
        {
            BSTNode current=root;
            BSTNode parent=root;
            boolean isLeft=false;
            while(!current.tunnel.Name.equalsIgnoreCase(id))
            {
                int q = current.tunnel.Name.compareToIgnoreCase(id);
                if(q>0&&current.left!=null)
                {
                    parent=current;
                    current=current.left;
                    isLeft=true;
                }
                else if(q<0&&current.right!=null)
                {
                    parent=current;
                    current=current.right;
                    isLeft=false;
                }
                else
                {
                    System.out.println("Not found");
                    return false;
                }
            }
            
            if(current.tunnel.next!=null){
                
                current.deleteLastName(Lname);
                
            }
            else if(current.left==null&&current.right==null)
            {
                if(current==root)
                {
                    root=null;
                }
                else if(isLeft)
                {
                    parent.left=null;
                }
                else
                {
                    parent.right=null;
                }
            }
            else if(current.left==null||current.right==null)
            {
                if(current.left==null)
                {
                    if(current==root)
                    {
                        root=current.right;
                    }
                    else if(isLeft)
                    {
                        parent.left=current.right;
                    }
                    else
                    {
                        parent.right=current.right;
                    }
                }
                
                else
                {
                    if(current==root)
                    {
                        root=current.left;
                    }
                    else if(isLeft)
                    {
                        parent.left=current.left;
                    }
                    else
                    {
                        parent.right=current.left;
                    }
                }
                
                    
                
            }
          
          else
            {
                BSTNode predecessor = getPredecessor(current);
                
                
                if(current.left!=predecessor)
                {
                    predecessor.left=current.left;
                    
                }
                predecessor.right=current.right;
                if(current==root)
                {
                    root=predecessor;
                }
                else if(isLeft)
                {
                    parent.left=predecessor;
                }
                else 
                {
                    parent.right=predecessor;
                }
            }
            return true;
        }
    }
}
