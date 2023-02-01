package ms.trashbox.srp.mapper;

import javax.persistence.MappedSuperclass;

import org.mapstruct.Mapper;

import ms.trashbox.srp.domain.ContactForm;
import ms.trashbox.srp.service.dto.ContactFormDTO;

@Mapper(componentModel = "spring", uses= {})
public interface ContactFormMapper extends EntityMapper<ContactFormDTO, ContactForm> {
	
	default ContactForm fromId(Long id) {
		if(id==null) {
			return null;
		}
		
		ContactForm contactForm = new ContactForm();
		contactForm.setId(id);
		return contactForm;
	}

}
