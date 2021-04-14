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
    
    private static Accessories Instance;
    private List<Price> pr;
    private Accessories()
    {
        pr=new ArrayList<Price>();
        
        
    }
    
 //getter
    public List<Price> getPr() {
        return pr;                                                                  
    }
    
    public static Accessories getInstance()
    {
        if(Instance==null)
        {
            Instance=new Accessories();
           
        }
        return Instance;
    } 
    
    
    public void addAccessories(Price pr)   
    {
        Accessories.getInstance().pr.add(pr);
       
    }
    public boolean delAccessories(String name)
    {
        int index=-2;
        boolean f=false;
        for(int i=0;i<pr.size();i++)
        {
            if(Accessories.getInstance().pr.get(i).getPname().equals(name))
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
           Accessories.getInstance().pr.remove(index);
           f=true;
           return f;
       }
       
    }
}

