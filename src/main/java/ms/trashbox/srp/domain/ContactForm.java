package ms.trashbox.srp.domain;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contactForm")
public class ContactForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fisrtName")
	private String fisrtName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "emailAdress")
	private String emailAdress;
	
	@Column(name = "confirmEmail")
	private String confirmEmail;
	
	@Column(name = "organizationName")
	private String organizationName;
	
	@Column(name = "nameEvent")
	private String nameEvent;
	
	@Column(name = "descriptionEvent")
	private String descriptionEvent;
	
	@Column(name = "eventDate")
	private LocalDate eventDate;
	
	@Column(name = "eventTime")
	private LocalDate eventTime;
	
	@Column(name = "zipCode")
	private String zipCode;
	
	@Column(name = "approxAttendance")
	private Integer approxAttendance;
	
	@Column(name = "numberOfTrashBoxes")
	private Integer numberOfTrashBoxes;
	
	@Column(name = "numberOfRecycledMaterialLids")
	private Integer numberOfRecycledMaterialLids;
	
	
	

	public ContactForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public String getDescriptionEvent() {
		return descriptionEvent;
	}

	public void setDescriptionEvent(String descriptionEvent) {
		this.descriptionEvent = descriptionEvent;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public LocalDate getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDate eventTime) {
		this.eventTime = eventTime;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getApproxAttendance() {
		return approxAttendance;
	}

	public void setApproxAttendance(Integer approxAttendance) {
		this.approxAttendance = approxAttendance;
	}

	public Integer getNumberOfTrashBoxes() {
		return numberOfTrashBoxes;
	}

	public void setNumberOfTrashBoxes(Integer numberOfTrashBoxes) {
		this.numberOfTrashBoxes = numberOfTrashBoxes;
	}

	public Integer getNumberOfRecycledMaterialLids() {
		return numberOfRecycledMaterialLids;
	}

	public void setNumberOfRecycledMaterialLids(Integer numberOfRecycledMaterialLids) {
		this.numberOfRecycledMaterialLids = numberOfRecycledMaterialLids;
	}

	@Override
	public String toString() {
		return "ContactForm [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", phone=" + phone
				+ ", emailAdress=" + emailAdress + ", confirmEmail=" + confirmEmail + ", organizationName="
				+ organizationName + ", nameEvent=" + nameEvent + ", descriptionEvent=" + descriptionEvent
				+ ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", zipCode=" + zipCode
				+ ", approxAttendance=" + approxAttendance + ", numberOfTrashBoxes=" + numberOfTrashBoxes
				+ ", numberOfRecycledMaterialLids=" + numberOfRecycledMaterialLids + "]";
	}
	

}
