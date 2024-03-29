/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;


/**
 *
 * @author rathinn
 */
public class BSTNode {

    DataNode tunnel;
    BSTNode left;
    BSTNode right;
    
    
    
    BSTNode(Human data)
    {
        
        this.tunnel=new DataNode(data);
        left=null;
        right=null;
        
    }
    public void printall(){
        DataNode temp=tunnel;
        while(temp!=null){
            temp.data.printDetails();
            temp=temp.next;
        }
    }
    
    
    public void inorder()
    {
        
        if(left!=null){
        left.inorder();
        }
        printall();
        if(right!=null){
        right.inorder();
        }
    }
    
    
    
    public void insert(Human key)
    {
        int q = tunnel.Name.compareToIgnoreCase(key.FirstName);
                    
        if(q<0)
        {
            if(right==null)
            {
                right=new BSTNode(key);
                return;
            }
            else
            {
                right.insert(key);
                return;
            }
        }
        else if (q>0)
                {
                   if(left==null) 
                   {
                       left=new BSTNode(key);
                       return;
                   }
                   else
                   {
                       left.insert(key);
                       return;
                   }
                }
        else if(q==0){
                
                System.out.println("Yes");
                DataNode newNode = new DataNode(key);
                newNode.next=tunnel;
                tunnel=newNode;
                   return;
        }
    }
    
    public boolean search(String key)
    {
    int q = tunnel.Name.compareToIgnoreCase(key);    
        if(q==0)
        {
            printall();
            return true;
        }
        else if(q<0&&right!=null)
        {
            return right.search(key);
        }
        else if(q>0&&left!=null)
        {
            return left.search(key);
            
        }
        else
        {
            System.out.println("Not Found");
            return false;
        }
    }
    
    
    
   
    
    public int height()
    {
    if(left==null&right==null)
    {
        return 0;
        
    }
    else if(left==null&&right!=null)
    {
        return right.height()+1;
    }
    else if(left!=null&&right==null)
    {
        return left.height()+1;
    }
    else {
        int l = left.height();
        int r = right.height();
        if(l>r)
        {
            return l+1;
        }
        else
        {
            return r+1;
        }
    }
    
    
    
    }
    
    public void max()
    {
        if(right==null)
        {
            printall();
        }
        else
        {
            right.max();
        }
    }
    
    
    public void min()
    {
        if(left==null)
        {
            printall();
        }
        else
        {
            left.min();
        }
    }
    
    public void deleteLastName(String LName){
        if(tunnel.data.LastName.equalsIgnoreCase(LName)){
            tunnel=tunnel.next;
            return;
        }
        DataNode temp = tunnel;
        DataNode prev = null;
        while(temp!=null&&!temp.data.LastName.equalsIgnoreCase(LName)){
            prev=temp;
            temp=temp.next;
            
        }
        if(temp==null){
            System.out.println("Not Found");
            
        }
        else{
            prev.next=temp.next;
        }
    }
   
    
    
    
    
    
    
    
   
    
    
    
    
    
    
        
    }
    
    
    


    
    
