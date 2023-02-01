package ms.trashbox.srp.service;


import java.util.List;
import java.util.Optional;

import ms.trashbox.srp.service.dto.ContactFormDTO;

public interface ContactFormService {
	
	ContactFormDTO save(ContactFormDTO contactForm);
	
	List<ContactFormDTO> findAll();
	
	Optional<ContactFormDTO> findOne(Long id);
	
	void delete(Long id);

}
