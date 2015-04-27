package tenders.beans;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * ������. ���������� ������ ������������ �� ���������� � ������� 
 * ����������, �������� ��� � ���� ������ ��������.
 * ������ ������������ ���������� �� ������� � �������� ��������� �� ����� ��� ���.
 * @author GG
 *
 */
@Entity
@Table(name="invites")
@Access(AccessType.FIELD)
public class Invite {
	
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	private String title;
	
	@Column(nullable=false)
	private String email;

	
	@Column(nullable=false)
	private String companyName;
	

	@ManyToOne
	@JoinColumn(name="purchaseId", nullable = false)
	private Purchase purchase;
	
	
	private boolean handled;


	
	/**
	 * �������� ��������� ��������� ��� �����������. 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * ���������� ��������� ��������� ��� �����������. 
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * �������� ����� ��������. 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ���������� ����� ��������. 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * �������� �������� ��������.
	 * ������������ �������� �������. 
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * ���������� �������� ��������. 
	 * ������������ �������� �������. 
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	/**
	 * �������, �� ������� �������� ������������.
	 */
	public Purchase getPurchase() {
		return purchase;
	}

	/**
	 * �������, �� ������� �������� ������������.
	 */
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	/**
	 * ���������� ? ������������ �������� ��� ������������ ����� �������� �����������.
	 */
	public boolean isHandled() {
		return handled;
	}

	/**
	 * ���������� ? ������������ �������� ��� ������������ ����� �������� �����������.
	 */
	public void setHandled(boolean handled) {
		this.handled = handled;
	}


	public Integer getId() {
		return id;
	}
	
	
	
	
}
