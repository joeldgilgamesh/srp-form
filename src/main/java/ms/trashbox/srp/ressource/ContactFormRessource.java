package ms.trashbox.srp.ressource;

import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.http.HeaderUtil;
import org.apache.tomcat.util.http.ResponseUtil;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.trashbox.srp.service.ContactFormService;
import ms.trashbox.srp.service.dto.ContactFormDTO;

@RestController
@RequestMapping("/api")
public class ContactFormRessource {
 
	private final String ENTITY_NAME = "ContactFormTrashbox";
	
	private final Logger log = (Logger) LoggerFactory.getLogger(ContactFormRessource.class);
	
	private final ContactFormService contactFormService;

	public ContactFormRessource(ContactFormService contactFormService) {
		this.contactFormService = contactFormService;
	}
	
	@PostMapping("/contactform")
	public ResponseEntity<ContactFormDTO> saveForm(@RequestBody ContactFormDTO contactFormDTO) throws Exception{
		log.debug("Request to save ConatctForm : {}", contactFormDTO);
		if (contactFormDTO.getId() != null) {
			throw new Exception();
		}
		ContactFormDTO result = contactFormService.save(contactFormDTO);
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("/contactform")
	public ResponseEntity<ContactFormDTO>updateForm(@RequestBody ContactFormDTO contactFormDTO) throws Exception{
		log.debug("Request to update ConatctForm : {}", contactFormDTO);
		if (contactFormDTO.getId() == null) {
			throw new Exception();
		}
		ContactFormDTO result = contactFormService.save(contactFormDTO);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/contactform/{id}")
	public ResponseEntity<Optional<ContactFormDTO>> getContactForm(@PathVariable Long id){
		log.debug("Request to get ConatctForm : {}", id);
		Optional<ContactFormDTO> contacFormDTO = contactFormService.findOne(id);
		return ResponseEntity.ok(contacFormDTO);	
	}
	
	/*
	 * @DeleteMapping("/contactform/{id}") public ResponseEntity<ContactFormDTO>
	 * deleteContactForm(@PathVariable Long id){
	 * log.debug("Request to delete ConatctForm : {}", id);
	 * contactFormService.delete(id); return ResponseEntity.noContent().getCla }
	 */
}
