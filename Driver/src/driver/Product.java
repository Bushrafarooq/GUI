/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author Mask
 */
public class Product extends Price {
   private String pname;

    public String getPname() {
        return pname;
    }

    public boolean setPname(String pname) {
        boolean f=false;
        int size=pname.length();
        for(int i=0;i<size;i++)
        {
            if(pname.charAt(i)>='A'&&pname.charAt(i)<='Z'||pname.charAt(i)>='a'&&pname.charAt(i)<='z'||pname.charAt(i)==' ')
            {
                f=true;
            }
        }
        return f;
    }
   
    
}
