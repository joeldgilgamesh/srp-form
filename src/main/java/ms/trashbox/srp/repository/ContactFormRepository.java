package ms.trashbox.srp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ms.trashbox.srp.domain.ContactForm;


@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

}
