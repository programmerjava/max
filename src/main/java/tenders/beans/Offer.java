package tenders.beans;

import java.math.BigDecimal;
import java.time.Period;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 * Оффер.
 * @author GG
 *
 */
@Entity
@Table(name="offers")
@Access(AccessType.FIELD)
public class Offer {
	
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="purchaseId",nullable=false)
	private Purchase purchase;
	
	
	@ManyToOne
	@JoinColumn(name="contractorId",nullable=false)
	private User contractor;
	
	
	@Column(nullable=false)
	private Period period;

	
	@Column(nullable=false)
	private BigDecimal price;
	
	
	
	private String title;
	
	
	private String text;
	
	private String uniqText;
	
	
	@ElementCollection
	@CollectionTable(name="offer_files")
	@OrderColumn(name="position")
	private List<String> files;
	
	
	@Enumerated(EnumType.STRING)
	private OfferState state;
	
	
	@Embedded
	private OfferNotificationSettings notifications;

	
	
	
	
	/**
	 * �������, � ������� ���������� �����������.
	 */
	public Purchase getPurchase() {
		return purchase;
	}

	/**
	 * �������, � ������� ���������� �����������.
	 */
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}


	/**
	 * ���������.
	 */
	public User getContractor() {
		return contractor;
	}

	/**
	 * ���������.
	 */
	public void setContractor(User contractor) {
		this.contractor = contractor;
	}


	/**
	 * ������ ����������.
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * ������ ����������.
	 */
	public void setPeriod(Period period) {
		this.period = period;
	}

	/**
	 * ���� ����������.
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * ���� ����������.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	/**
	 * ��������� �����������.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * ��������� �����������.
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * ����� �����������.
	 */
	public String getText() {
		return text;
	}

	/**
	 * ����� �����������.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * ����� ����������� �����������.
	 */
	public String getUniqText() {
		return uniqText;
	}

	/**
	 * ����� ����������� �����������.
	 */
	public void setUniqText(String uniqText) {
		this.uniqText = uniqText;
	}

	/**
	 * ������ ������������� ������ �����������.
	 */
	public List<String> getFiles() {
		return files;
	}

	/**
	 * ������ ������������� ������ �����������.
	 */
	public void setFiles(List<String> files) {
		this.files = files;
	}


	/**
	 * ��������� �����������.
	 */
	public OfferState getState() {
		return state;
	}

	/**
	 * ��������� �����������.
	 */
	public void setState(OfferState state) {
		this.state = state;
	}


	/**
	 * ��������� ���������� ����������.
	 */
	public OfferNotificationSettings getNotifications() {
		return notifications;
	}

	/**
	 * ��������� ���������� ����������.
	 */
	public void setNotifications(OfferNotificationSettings notifications) {
		this.notifications = notifications;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
}
