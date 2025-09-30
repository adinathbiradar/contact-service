package in.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.Contact;
import in.main.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Save contact
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    // Get all contacts
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // Delete contact
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
