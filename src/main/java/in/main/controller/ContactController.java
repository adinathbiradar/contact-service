package in.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.main.model.Contact;
import in.main.service.ContactService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // Submit contact
    @PostMapping
    public Contact submitContact(@RequestBody Contact contact) {
        contact.setCreatedAt(LocalDateTime.now());
        return contactService.saveContact(contact);
    }

    // Get all contacts
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    // Delete a contact
    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
