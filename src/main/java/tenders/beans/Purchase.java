package tenders.beans;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ��������� ����� ������.
 * @author GG
 *
 */
@Entity
@Table(name="purchases")
@Access(AccessType.FIELD)
public class Purchase {
	
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	@OneToMany
	private List<Category> categories;
	

	@Column(nullable=false)
	private String title;


	private String shortDescr;
	
	@Column(nullable=false)
	private String fullDescr;
	
	
	@ElementCollection
	@CollectionTable(name="purchase_files")
	@OrderColumn(name="position")
	private List<String> files;
	
	
	
	private String address;
	
	
	
	@Column(nullable=false)
	private BigDecimal price;
	
	
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date actualDate;
	
	@Column(nullable=false)
	private Period actualTime;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date realisationDate;
	
	@Column(nullable=false)
	private Period realisationTime;
	

	
	private boolean privatePurchase;

	
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date published;
	
	
	
	@Embedded
	private PurchaseNotifications notifications;
	
	@Embedded
	private PurchaseState state;
	

	@OneToMany
	@JoinColumn(name="winnerId",nullable=false)
	private User winner;


	
	/**
	 * �������� ���������� ������������� �������.
	 */
	public Integer getId() {
		return id;
	}



	/**
	 * ������ ��������� �������.
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * ���������� ������ ��������� �������.
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * ��������� �������.
	 * ����������.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * ���������� ��������� �������.
	 * ����������.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * �������� �������� �������.
	 * ����� ������� �� ������� �������� ���� �� �������.
	 */
	public String getShortDescr() {
		return shortDescr;
	}

	/**
	 * �������� �������� �������.
	 * ����� ������� �� ������� �������� ���� �� �������.
	 */
	public void setShortDescr(String shortDescr) {
		this.shortDescr = shortDescr;
	}

	/**
	 * ������ �������� �������.
	 */
	public String getFullDescr() {
		return fullDescr;
	}

	/**
	 * ������ �������� �������.
	 */
	public void setFullDescr(String fullDescr) {
		this.fullDescr = fullDescr;
	}


	/**
	 * ������ ������ �������.
	 */
	public List<String> getFiles() {
		return files;
	}

	/**
	 * ������ ������ �������.
	 */
	public void setFiles(List<String> files) {
		this.files = files;
	}

	/**
	 * �������� ����� ���������� �������.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * �������� ����� ���������� �������.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * �������� ���� �� ���������� �������.
	 * �����������.
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * �������� ���� �� ���������� �������.
	 * �����������.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * �������� ���� ���������� �������.
	 * �����������.
	 */
	public Date getActualDate() {
		return actualDate;
	}

	/**
	 * �������� ���� ���������� �������.
	 * �����������.
	 */
	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

	/**
	 * ���������� ������ ���������� �������.
	 * �����������.
	 */
	public Period getActualTime() {
		return actualTime;
	}

	/**
	 * ���������� ������ ���������� �������.
	 * �����������.
	 */
	public void setActualTime(Period actualTime) {
		this.actualTime = actualTime;
	}


	/**
	 * ���� ���������� �������.
	 * �����������.
	 */
	public Date getRealisationDate() {
		return realisationDate;
	}

	/**
	 * ���� ���������� �������.
	 * �����������.
	 */
	public void setRealisationDate(Date realisationDate) {
		this.realisationDate = realisationDate;
	}


	/**
	 * ������ ���������� �������.
	 * �����������.
	 */
	public Period getRealisationTime() {
		return realisationTime;
	}

	/**
	 * ������ ���������� �������.
	 * �����������.
	 */
	public void setRealisationTime(Period realisationTime) {
		this.realisationTime = realisationTime;
	}


	/**
	 * ��� ��������� ������ ??
	 */
	public boolean isPrivatePurchase() {
		return privatePurchase;
	}

	/**
	 * ��� ��������� ������ ??
	 */
	public void setPrivatePurchase(boolean privatePurchase) {
		this.privatePurchase = privatePurchase;
	}


	/**
	 * ���� ���������� �������.
	 */
	public Date getPublished() {
		return published;
	}

	/**
	 * ���� ���������� �������.
	 */
	public void setPublished(Date published) {
		this.published = published;
	}


	/**
	 * ��������� ����������� �� �������.
	 */
	public PurchaseNotifications getNotifications() {
		return notifications;
	}

	/**
	 * ��������� ����������� �� �������.
	 */
	public void setNotifications(PurchaseNotifications notifications) {
		this.notifications = notifications;
	}


	/**
	 * ������� ��������� �������.
	 * ��������� <b>done</b> ������ ���� ����������� �� ��������� ����������.
	 */
	public PurchaseState getState() {
		return state;
	}

	
	/**
	 * ������� ��������� �������.
	 * ��������� <b>done</b> ������ ���� ����������� �� ��������� ����������.
	 */
	public void setState(PurchaseState state) {
		this.state = state;
	}


	/**
	 * ���������� �������.
	 * ��������� <b>done</b> ������ ���� ����������� �� ��������� ����������.
	 */
	public User getWinner() {
		return winner;
	}

	/**
	 * ���������� �������.
	 * ��������� <b>done</b> ������ ���� ����������� �� ��������� ����������.
	 */
	public void setWinner(User winner) {
		this.winner = winner;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
}
