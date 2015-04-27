package tenders.beans;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Index;
import javax.persistence.OrderColumn;


/**
 * ���������� ������ ������������.
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
	 * �������� ����� ������������ �������.
	 * ����� ���� �� ������.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * ���������� ����� ������������ �������.
	 * ����� ���� �� ������.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * �������� �������� �������� ������������ �������.
	 * ����� ���� �� �������.
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * ���������� �������� �������� ������������ �������.
	 * ����� ���� �� �������.
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * �������� ������ �������.
	 */
	public List<String> getPhones() {
		return phones;
	}

	/**
	 * ���������� ������ �������.
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	/**
	 * �������� �����.
	 * ���������� � ��������.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ���������� �����.
	 * ���������� � ��������.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
