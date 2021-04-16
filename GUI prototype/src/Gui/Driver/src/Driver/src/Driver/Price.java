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
public class Price extends Product{
      
    private int price;



        public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        boolean f=false;
        if(price>=0&&price<=1000000)
        {
            f=true;
        }
        return f;
    }
    
    


    
}
