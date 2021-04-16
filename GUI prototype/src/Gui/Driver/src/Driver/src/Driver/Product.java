/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

/**
 *
 * @author Mask
 */
public class Product {
     private String pname;
     private int count;

    public void setCount(int count) {
        this.count=count;
          }

    public String getPname() {
        return pname;
    }
      public int getCount() {
        return count;
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
        this.pname=pname;
        return f;
    }
}
