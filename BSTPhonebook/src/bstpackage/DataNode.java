/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;

/**
 *
 * @author dell
 */
public class DataNode {
    String Name;
    Human data;
    DataNode next;

    public DataNode(Human data) {
        this.data = data;
        next=null;
    }
    
    public void insert(Human n){
        if(next==null){
            next=new DataNode(n);
        }
        else{
            next.insert(n);
        }
        
    }
    
    
    
}
