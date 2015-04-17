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
 * Предложение подрядчика.
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
	 * Закупка, к которой выставлено предложение.
	 */
	public Purchase getPurchase() {
		return purchase;
	}

	/**
	 * Закупка, к которой выставлено предложение.
	 */
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}


	/**
	 * Подрядчик.
	 */
	public User getContractor() {
		return contractor;
	}

	/**
	 * Подрядчик.
	 */
	public void setContractor(User contractor) {
		this.contractor = contractor;
	}


	/**
	 * Период выполнения.
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * Период выполнения.
	 */
	public void setPeriod(Period period) {
		this.period = period;
	}

	/**
	 * Цена выполнения.
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Цена выполнения.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	/**
	 * Заголовок предложения.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Заголовок предложения.
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * Текст предложения.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Текст предложения.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Текст уникального предложения.
	 */
	public String getUniqText() {
		return uniqText;
	}

	/**
	 * Текст уникального предложения.
	 */
	public void setUniqText(String uniqText) {
		this.uniqText = uniqText;
	}

	/**
	 * Список прикрепленных файлов предложения.
	 */
	public List<String> getFiles() {
		return files;
	}

	/**
	 * Список прикрепленных файлов предложения.
	 */
	public void setFiles(List<String> files) {
		this.files = files;
	}


	/**
	 * Состояние предложения.
	 */
	public OfferState getState() {
		return state;
	}

	/**
	 * Состояние предложения.
	 */
	public void setState(OfferState state) {
		this.state = state;
	}


	/**
	 * Настройки оповещения подрядчика.
	 */
	public OfferNotificationSettings getNotifications() {
		return notifications;
	}

	/**
	 * Настройки оповещения подрядчика.
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
