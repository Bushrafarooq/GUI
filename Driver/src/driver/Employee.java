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
public class Employee {
    
    private int ID;
    private String name;
    private String email;
    private String contact;
    private String Epass;

    public int getID() {
        return ID;
    }

    public boolean setID(int ID) {
        boolean f=false;
        if(ID>=1&&ID<=1000)
        {
            f=true;
        }
        return f;
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
            }
        }
        while(email.charAt(i)!='.')
        {
             if(email.charAt(i)>='0'&&email.charAt(i)<='9'||email.charAt(i)>='A'&&email.charAt(i)<='Z'||email.charAt(i)>='a'&&email.charAt(i)<='z')
            {
                f2=true;
            }
        }
        if(f1==true&&f2==true)
        {
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
            if(Epass.charAt(i)>='A'&&Epass.charAt(i)<='Z'||Epass.charAt(i)>='a'&&Epass.charAt(i)<='z'||Epass.charAt(i)==' '&&Epass.charAt(i)=='.'&&Epass.charAt(i)>='0'&&Epass.charAt(i)<='9')
            {
                f=true;
            }
        }
        return f;

       
    }
    
    
    
    
}
