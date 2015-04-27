package tenders.beans;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * ���������� ������ ����� � �������.
 * @author GG
 *
 */
@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User {

	
	@Id
	private String login;
	
	
	@Column(nullable = false)
	private String firstName;
	
	

	@Column(nullable = false)
	private String lastName;
	
	
	@Embedded
	@Basic(fetch=FetchType.LAZY)
	private ContactInfo contactInfo;
	
	
	
	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private LicensionInfo licensionInfo;
	
	
	
	private String descr;


	@OneToMany
	private Set<Category> categories;
	



	/**
	 * �������� ���������� ����� ������������.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * ���������� ���������� ����� ������������.
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	/**
	 * �������� ��� ������������.
	 * ����� �������������� �������� ��� ���������.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * ���������� ��� ������������.
	 * ����� �������������� �������� ��� ���������.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	/**
	 * �������� ������� ������������.
	 * ����� �������������� �������� ��� ���������.
	 */
	public String getLastName() {
		return lastName;
	}




	/**
	 * ���������� ������� ������������.
	 * ����� �������������� �������� ��� ���������.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	/**
	 * ���������� ������ ������������.
	 */
	public ContactInfo getContactInfo() {
		return contactInfo;
	}




	/**
	 * ���������� ������ ������������.
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}






	/**
	 * �������� ������ � �������� ������������.
	 */
	public LicensionInfo getLicensionInfo() {
		return licensionInfo;
	}

	/**
	 * ���������� ������ � �������� ������������.
	 */
	public void setLicensionInfo(LicensionInfo licensionInfo) {
		this.licensionInfo = licensionInfo;
	}


	/**
	 * �������� ������� ������ � ���� � ���� ������.
	 */
	public String getDescr() {
		return descr;
	}




	/**
	 * ���������� ������� ������ � ���� � ���� ������.
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
	/**
	 * �������� ������ ���������, 
	 * �� ������� ����� �������� ������������ � �������� ����������.
	 */
	public Set<Category> getCategories() {
		return categories;
	}

	/**
	 * ���������� ������ ���������, 
	 * �� ������� ����� �������� ������������ � �������� ����������.
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
	
	
}
