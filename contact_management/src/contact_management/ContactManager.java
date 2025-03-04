/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact_management;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author thais
 */
public class ContactManager {

    private List<CONTACT> contacts = new ArrayList<>();
//
//    public boolean addContact(String fullName, String group, String address, String phone) {
//        contacts.add(new CONTACT(fullName, group, address, phone));
//        System.out.println("Contact added successfully.");
//        return true;
//    }
//
//    public void displayAll() {
//        if (contacts.isEmpty()) {
//            System.out.println(" khong ton tai");
//        } else {
//            System.out.println("ID | FULL NAME | Group | Address | Phone ");
//            contacts.forEach(System.out::println);
//        }
//    }
//
//    public boolean deleteContact(int id) {
//        return contacts.removeIf(c -> c.getId() == id);
//    }

    public boolean addContact( String fullName , String phone, String group, String address){
        contacts.add(new CONTACT(fullName , phone , address, group));
        System.out.println(" da them thanh cong");
        return true ;
    }
    public void displayAll(){
        if(contacts.isEmpty()){
            System.out.println("khong ton tai");
            
        }else{
            System.out.println(" fullName| phone|group | address");
            contacts.forEach(System.out:: println);
        }
    }
    public boolean deleteContact(int id){
        return contacts.removeIf(c-> c.getId()== id) ;
    }
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact("John Doe", "Family", "123 Main St", "123-456-7890");
        manager.displayAll();
        manager.deleteContact(1);

    }
}
