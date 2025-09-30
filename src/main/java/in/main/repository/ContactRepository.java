package in.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.main.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
