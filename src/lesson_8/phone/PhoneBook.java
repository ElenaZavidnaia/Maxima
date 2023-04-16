package lesson_8.phone;

public class PhoneBook {
    // fields
    Contact[] contacts = new Contact[100];

    // constructor
    public PhoneBook() {
    }


    // methods
    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public Contact searchContact(String nameOfContact) {
        Contact result = null;
        for (Contact record : contacts) {
            if (record.getName().equals(nameOfContact)) {
                result = record;
                break;
            }
        }
        return result;
    }

    public void deleteContact(String nameOfContact) {
        for (int i = 0; i < contacts.length; i++) {
            if ((contacts[i] != null) && (contacts[i].getName().equals(nameOfContact))) {
                contacts[i] = null;
                break;
            }
        }
    }

    public Contact editContact(String searchContact, String newnameOfContact) {
        Contact newContact = null;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equals(searchContact)) {
                    contacts[i].setName(newnameOfContact);
                    newContact = contacts[i];
                    break;
                } else if (contacts[i].getPhoneNumber().equals(searchContact)) {
                    contacts[i].setPhoneNumber(newnameOfContact);
                    newContact = contacts[i];
                    break;
                } else if (contacts[i].getEmail().equals(searchContact)) {
                    contacts[i].setEmail(newnameOfContact);
                    newContact = contacts[i];
                    break;
                }
            }
        }
        return newContact;
    }
}
