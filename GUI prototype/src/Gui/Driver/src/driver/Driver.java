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
public class Driver {

    private static Driver instance;
    public static Driver getInstance()
    {
        if(instance==null)
        {
            instance=new Driver();
        }
        return instance;
    }
    private List<Employee> emp;
    private List<Receipt> rec;

    public List<Employee> getEmp() {
        return emp;
    }

    public List<Receipt> getRec() {
        return rec;
    }
    private Driver()
    {
        emp=new ArrayList<Employee>();
        rec=new ArrayList<Receipt>();
        
    }
     public void addEmployee(Employee emp)
     {
         Driver.getInstance().getEmp().add(emp);
        
     }
          public void addReceipt(Receipt rec)
     {
         Driver.getInstance().getRec().add(rec);
        
     }
    public boolean delEmployee(String name)
    {
        int index=-1;
        boolean f=false;
        for(int i=0;i<emp.size();i++)
        {
            if(Driver.getInstance().getEmp().get(i).getName().equals(name))
            {
                index=i;
                break;
            }
            else
            {
                f=false;
            }
            if(index==-1) 
       {
           return false;
       }
            else
            {
                Driver.getInstance().getEmp().remove(index);
                f=true;
                return f;
            }
        } 
        
    return f;
    }
      public static void main(String[] args) {
          Main f=new Main();
         f.setVisible(true);
          
      }
}
