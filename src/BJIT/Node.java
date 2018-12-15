/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJIT;

/**
 *
 * @author ASHIM
 */
public class Node {
    int data;
    Node link;
    public Node(){
        data=0;
        link=null;
    }
    public Node(int d,Node n){
        data=d;
        link=n;
    }
    public void setLink(Node n){
        link=n;
    }
    public void setData(int d){
        data=d;
    }
    public Node getLink(){
        return link;
    }
    public int getData(){
        return data;
    }
}
