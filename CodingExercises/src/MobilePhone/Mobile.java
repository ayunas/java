package MobilePhone;

import java.util.ArrayList;

public class Mobile {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public static void main(String[] args) {
        Mobile phone = new Mobile();
        phone.addContact("Amir","4694001380");
        phone.addContact("suzie","23412344654");
        phone.showContacts();
        Contact contact = phone.findContact("Air");
        if (contact == null) System.out.println("no contacts found.");
        else System.out.println(contact.name);

        phone.updateContact("Amir","Yunas");
        phone.showContacts();

        phone.updateContact("suzie","Mory");
        phone.showContacts();

    }

    void addContact(String name, String phone) {
        Contact contact = new Contact(name,phone);
        this.contacts.add(contact);
    }

    void showContacts() {
//        System.out.println(this.contacts);
        this.contacts.forEach(c -> c.showContact());
    }

    void updateContact(String contactName, String updatedContact) {
        Contact contact = this.findContact(contactName);
        if (contact == null) {
            System.out.println("Unable to find contact");
        } else {
            contact.name = updatedContact;
        }


    }

    Contact findContact(String contactName) {
        //loop through the contacts ArrayList
        // Create a variable conntact for each contact.get(i).
        // if that contact.name == the contactName parameter passed into the function, return the contact.  if there are no contacts found, return null.
//        int index = this.contacts.indexOf(contact);
//        return this.contacts.get(index);
        for (int i=0; i<this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.name.equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    void removeContact(Contact contact) {
        int index = contacts.indexOf(contact);
        this.contacts.remove(index);
    }

}
