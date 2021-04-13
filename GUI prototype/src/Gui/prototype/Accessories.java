/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui.prototype;
import java.util.*;
/**
 *
 * @author Mask
 */

public class Accessories {
    
    private static Accessories Instance;
    private List<Prices> pr;
    private Accessories()
    {
        pr=new ArrayList<Prices>();
        
        
    }
    
 //getter
    public List<Prices> getPr() {
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
}
