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
public class LinkedList {
    public Node start;
    public Node end;
    public int size;
    public LinkedList(){
        start=null;
        end=null;
        size=0;
    }
    public void insertAtFirst(int val){
        Node nptr=new Node(val,null);
        size++;
        if(start==null){
            start=nptr;
            end=start;
        }
        else
        {
            nptr.setLink(start);
            start=nptr;
        }
    }
    
    public void insertAtLast(int val){
        Node nptr=new Node(val,null);
        size++;
        if(start==null){
            start=nptr;
            end=start;
        }
        else{
            end.setLink(nptr);
            end=nptr;
        }
    }
    
    public void insertAtAnyPosition(int val,int pos){
        Node nptr=new Node(val,null);
        Node ptr=start;
        pos=pos-1;
        for(int i=1;i<size;i++)
        {
            if(i==pos){
                Node tmp=ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr=ptr.getLink();
        }
        size++;
    }
    
    
    public void DeleteAtAnyPosition(int pos){
        if(pos==1){
            start=start.getLink();
            size--;
            return;
        }
        if(pos==size)
        {
            Node s=start;
            Node t=start;
            while(s!=end)
            {
                t=s;
                s=s.getLink();
            }
            end=t;
            end.setLink(null);
            size--;
            return;
        }
        
        Node ptr=start;
        pos=pos-1;
        for(int i=1;i<size;i++)
        {
            if(i==pos)
            {
                Node tmp=ptr.getLink();
                tmp=tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr=ptr.getLink();
        }
        size--;
    }
    
    public void Display()
    {
        if(size==0)
        {
            System.out.println("Empty");
            return;
        }
        if(start.getLink()==null)
        {
            System.out.println(start.getData());
            return;
        }
        Node ptr=start;
        System.out.println(start.getData());
        ptr=start.getLink();
        while(ptr.getLink()!=null)
        {
            System.out.println(ptr.getData());
            ptr=ptr.getLink();
        }
        System.out.println(ptr.getData());
    }
    
    
}
