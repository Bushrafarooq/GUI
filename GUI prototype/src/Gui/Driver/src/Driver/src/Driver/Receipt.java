/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 *
 * @author Mask
 */
public class Receipt {
       private int ID;
    private String name;
    private String Date;                                                 

    public void setName(String name) {
        this.name = name;
    }
    
     public void setID(int ID) {
        this.ID = ID;
    }
            
            

    public String getDate() {
         setDate();
        return Date;
    }                                                                      

    public void setDate() {
        Date date = new Date();  
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
      String strDate= formatter.format(date);  
      this.Date=strDate;
      
       
    }

    public int getID(int ID) {
       // setId(ID);
        return ID;
    }

   

  
    public String getName(int ID) {
      //  this.setName(ID);
        return name;
    }
   /* public void setName(int ID)
    {
        boolean f=false;
          int index=-1;
          for(int i=0;i<Driver.getInstance().getEmp().size();i++)
          {
                    if(Driver.getInstance().getEmp().get(i).getID().equals(ID))
                {
                    index=i;
                    break;

                }

          }
            this.name=Driver.getInstance().getEmp().get(index).getName();
        
    }

  public boolean setId(int ID)
  {
      boolean f=false;
      for(int i=0;i<Driver.getInstance().getEmp().size();i++)
      {
          if(Driver.getInstance().getEmp().get(i).getID().equals(ID))
          {
              this.ID=ID;
              return true;
              
          }
      }
      return f;
  }
*/
  

    
}
