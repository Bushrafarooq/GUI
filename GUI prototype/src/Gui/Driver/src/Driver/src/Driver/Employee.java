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
public class Employee {
     private int ID;
    private String name;
    private String email;
    private String contact;
    private String Epass;
   
    private List<Accessories> Acc;
    

    //list getter
    public List<Accessories> getAcc() {
        return Acc;
    }
    //get instance
    
//constructor
         public Employee()
    {
        Acc=new ArrayList<Accessories>();
        
        
    }
    

//id getter
    public int getID() {
        return ID;
    }

 
    //set
    public void setID(int ID)
    {
    this.ID=ID;
    
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
          boolean f=false;
        int size=name.length();
        for(int i=0;i<size;i++)
        {
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'||name.charAt(i)>='a'&&name.charAt(i)<='z'||name.charAt(i)==' ')
            {
                this.name=name;
                f=true;
            }
        }
        return f;
    

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        int size=email.length();
        boolean f1=false;
        boolean f2=false;
        int i=0;
        while(email.charAt(i)!='@')
        {
            if(email.charAt(i)>='0'&&email.charAt(i)<='9'||email.charAt(i)>='A'&&email.charAt(i)<='Z'||email.charAt(i)>='a'&&email.charAt(i)<='z')
            {
                f1=true;
                i++;
            }
            else
            {
                
                return false;
            }
            
        }
        i++;
        while(email.charAt(i)!='.')
        {
             if(email.charAt(i)>='0'&&email.charAt(i)<='9'||email.charAt(i)>='A'&&email.charAt(i)<='Z'||email.charAt(i)>='a'&&email.charAt(i)<='z')
            {
                f2=true;
                i++;
            }
               else
            {
                
                return false;
            }
          
        }
        if(f1==true&&f2==true)
        {
            this.email=email;
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public String getContact() {
        return contact;
    }

    public boolean setContact(String contact) {
        int size=contact.length();
        boolean f=false;
        if(size==11)
        {
            for(int i=0;i<size;i++)
            {
                if(contact.charAt(i)>='0'&&contact.charAt(i)<='9')
                {
                    this.contact=contact;
                   f=true; 
                }
            }
        }
        return f;
    }

    public String getEpass() {
        return Epass;
    }

    public boolean setEpass(String Epass) {
          boolean f=false;
        int size=Epass.length();
        for(int i=0;i<size;i++)
        {
            if((Epass.charAt(i)>='A'&&Epass.charAt(i)<='Z')||(Epass.charAt(i)>='a'&&Epass.charAt(i)<='z')||(Epass.charAt(i)==' ')||(Epass.charAt(i)=='.')||(Epass.charAt(i)>='0'&&Epass.charAt(i)<='9'))
            {
                this.Epass=Epass;
                f=true;
            }
        }
        return f;

       
    }
    
    
}

