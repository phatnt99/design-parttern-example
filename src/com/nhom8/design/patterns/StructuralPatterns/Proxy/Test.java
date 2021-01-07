package com.nhom8.design.patterns.StructuralPatterns.Proxy;

import java.util.List;

public class Test {
	public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImplement();
        Company company = new Company("C�ng Ty ABC", "Vietnam", "3801128455", contactList);
 
        System.out.println("Company Name: "+company.getCompanyName());
        System.out.println("Company Address: "+company.getCompanyAddress());
        System.out.println("Company Contact No.: "+company.getCompanyContactNo());
 
        System.out.println("Requesting for contact list");
 
        contactList = company.getContactList();
 
        List<Employee>empList1 = contactList.getEmployeeList();
        for(Employee emp : empList1){
            System.out.println(emp);
        }
        
        System.out.println("\n");
        
        contactList = company.getContactList();
        List<Employee>empList2 = contactList.getEmployeeList();
        for(Employee emp : empList2){
            System.out.println(emp);
        }

    }
}
