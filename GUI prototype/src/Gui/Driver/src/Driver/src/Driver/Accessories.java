/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import java.util.*;
/**
 *
 * @author Mask
 */
public class Accessories {
    
  
    private List<Price> pr;
    public Accessories()
    {
        pr=new ArrayList<Price>();
        
        
    }
    
 //getter
    public List<Price> getPr() {
        return pr;                                                                  
    }
    

    
    
    public void addAccessories(Price pr)   
    {
       this.pr.add(pr);
       
    }
    public boolean delAccessories(String name)
    {
        int index=-2;
        boolean f=false;
        for(int i=0;i<pr.size();i++)
        {
            if(this.pr.get(i).getPname().equals(name))
            {
                index=i;
                break;
            }
            else 
            {
                f=false;
            }
        }
       if(index==-2) 
       {
           return false;
       }
       else
       {
           this.pr.remove(index);
           f=true;
           return f;
       }
       
    }
}

