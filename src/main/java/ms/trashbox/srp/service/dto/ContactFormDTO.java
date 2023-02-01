package ms.trashbox.srp.service.dto;

import java.time.LocalDate;
import java.util.Objects;



public class ContactFormDTO {
	
	private Long id;
	
	
	private String fisrtName;
	
	
	private String lastName;
	
	
	private String phone;
	
	
	private String emailAdress;
	
	
	private String confirmEmail;
	
	
	private String organizationName;
	
	
	private String nameEvent;
	
	
	private String descriptionEvent;
	
	
	private LocalDate eventDate;
	
	
	private LocalDate eventTime;
	
	
	private String zipCode;
	
	
	private Integer approxAttendance;
	
	
	private Integer numberOfTrashBoxes;
	
	
	private Integer numberOfRecycledMaterialLids;

	

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
	public int hashCode() {
		return 31;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactFormDTO other = (ContactFormDTO) obj;
		return Objects.equals(approxAttendance, other.approxAttendance)
				&& Objects.equals(confirmEmail, other.confirmEmail)
				&& Objects.equals(descriptionEvent, other.descriptionEvent)
				&& Objects.equals(emailAdress, other.emailAdress) && Objects.equals(eventDate, other.eventDate)
				&& Objects.equals(eventTime, other.eventTime) && Objects.equals(fisrtName, other.fisrtName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(nameEvent, other.nameEvent)
				&& Objects.equals(numberOfRecycledMaterialLids, other.numberOfRecycledMaterialLids)
				&& Objects.equals(numberOfTrashBoxes, other.numberOfTrashBoxes)
				&& Objects.equals(organizationName, other.organizationName) && Objects.equals(phone, other.phone)
				&& Objects.equals(zipCode, other.zipCode);
	}


	@Override
	public String toString() {
		return "ContactFormDTO [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", phone=" + phone
				+ ", emailAdress=" + emailAdress + ", confirmEmail=" + confirmEmail + ", organizationName="
				+ organizationName + ", nameEvent=" + nameEvent + ", descriptionEvent=" + descriptionEvent
				+ ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", zipCode=" + zipCode
				+ ", approxAttendance=" + approxAttendance + ", numberOfTrashBoxes=" + numberOfTrashBoxes
				+ ", numberOfRecycledMaterialLids=" + numberOfRecycledMaterialLids + "]";
	}
	
	
}
