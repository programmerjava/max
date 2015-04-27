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
 * Отображает данные юзера в системе.
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
	 * Получить уникальный логин пользователя.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Установить уникальный логин пользователя.
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	/**
	 * Получить имя пользователя.
	 * Может использоваться сервером для обращения.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Установить имя пользователя.
	 * Может использоваться сервером для обращения.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	/**
	 * Получить фамилию пользователя.
	 * Может использоваться сервером для обращения.
	 */
	public String getLastName() {
		return lastName;
	}




	/**
	 * Установить фамилию пользователя.
	 * Может использоваться сервером для обращения.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	/**
	 * Контактные данные пользователя.
	 */
	public ContactInfo getContactInfo() {
		return contactInfo;
	}




	/**
	 * Контактные данные пользователя.
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}






	/**
	 * Получить данные о лицензии пользователя.
	 */
	public LicensionInfo getLicensionInfo() {
		return licensionInfo;
	}

	/**
	 * Установить данные о лицензии пользователя.
	 */
	public void setLicensionInfo(LicensionInfo licensionInfo) {
		this.licensionInfo = licensionInfo;
	}


	/**
	 * Получить краткие данные о себе в виде текста.
	 */
	public String getDescr() {
		return descr;
	}




	/**
	 * Устанвоить краткие данные о себе в виде текста.
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
	/**
	 * Получить список категорий, 
	 * по которым может работать пользователь в качестве подрядчика.
	 */
	public Set<Category> getCategories() {
		return categories;
	}

	/**
	 * Установить список категорий, 
	 * по которым может работать пользователь в качестве подрядчика.
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
	
	
}
