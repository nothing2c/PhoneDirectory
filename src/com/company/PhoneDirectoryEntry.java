package com.company;

public class PhoneDirectoryEntry implements Comparable<PhoneDirectoryEntry>
{
   private String name;
   private String number;
   
   public PhoneDirectoryEntry(String s, String n)
   {
      name = s;
      number = n;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getNumber()
   {
       return number;
   }


    @Override
    public int compareTo(PhoneDirectoryEntry o) {
        if(this.getName().compareTo(o.getName()) > 0)
            return 1;
        else if(this.getName().compareTo(o.getName()) == 0)
            return 0;
        else
            return -1;
    }

    @Override
    public boolean equals(Object o)
    {
        PhoneDirectoryEntry pde = (PhoneDirectoryEntry)o;

        if(this.getName().equals(pde.getName()))
            return true;
        else
            return false;
    }
}