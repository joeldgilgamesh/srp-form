package ms.trashbox.srp.serviceImpl;

import java.util.*;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ms.trashbox.srp.domain.ContactForm;
import ms.trashbox.srp.mapper.ContactFormMapper;
import ms.trashbox.srp.repository.ContactFormRepository;
import ms.trashbox.srp.service.ContactFormService;
import ms.trashbox.srp.service.dto.ContactFormDTO;

@Service
@Transactional
public class ContactFormServiceImpl implements ContactFormService {
	
	private final Logger log = (Logger) LoggerFactory.getLogger(ContactFormServiceImpl.class);
	private final ContactFormMapper contactFormMapper;
	private final ContactFormRepository contactFormRepository;
	
	public ContactFormServiceImpl(ContactFormMapper contactFormMapper, ContactFormRepository contactFormRepository){
		this.contactFormMapper = contactFormMapper;
		this.contactFormRepository = contactFormRepository;
	}

	@Override
	public ContactFormDTO save(ContactFormDTO contactFormDTO) {
		log.debug("Request to save ConatctForm : {}", contactFormDTO);
		ContactForm contactForm = contactFormMapper.toEntity(contactFormDTO);
		contactForm = contactFormRepository.save(contactForm);
		return contactFormMapper.toDto(contactForm);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ContactFormDTO> findAll() {
		log.debug("Request to get all contactForm");
		return contactFormRepository.findAll().stream()
				.map(contactFormMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ContactFormDTO> findOne(Long id) {
		log.debug("Request to get ConatctForm : {}", id);
		return contactFormRepository.findById(id).map(contactFormMapper::toDto);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete ConatctForm : {}", id);
		contactFormRepository.deleteById(id);
	}

}
