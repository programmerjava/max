package tenders.beans;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Index;
import javax.persistence.OrderColumn;


/**
 * Контактные данные пользователя.
 * @author GG
 *
 */
@Embeddable
public class ContactInfo {
	

	private String address;
	

	private String company;
	

	@ElementCollection
	@CollectionTable(name="phones")
	private List<String> phones;
	
	
	@Column(nullable=false,unique=true)
	private String email;


	/**
	 * Получить адрес пользователя сервиса.
	 * Может быть не указан.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Установить адрес пользователя сервиса.
	 * Может быть не указан.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Получить название компании пользователя сервиса.
	 * Может быть не указана.
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Установить название компании пользователя сервиса.
	 * Может быть не указана.
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * Получить список номеров.
	 */
	public List<String> getPhones() {
		return phones;
	}

	/**
	 * Установить список номеров.
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	/**
	 * Получить имейл.
	 * Обязателен и уникален.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Установить имейл.
	 * Обязателен и уникален.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
