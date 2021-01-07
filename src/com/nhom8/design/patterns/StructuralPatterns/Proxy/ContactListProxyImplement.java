package com.nhom8.design.patterns.StructuralPatterns.Proxy;

import java.util.List;

public class ContactListProxyImplement implements ContactList{
 
    private ContactList contactList;
    
    @Override
    public List<Employee> getEmployeeList() {
        if(contactList == null){
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImplement();                   
        }
        else
        {
        	System.out.println("Contact list already existed");
        }
        return contactList.getEmployeeList();

    }
 
}
