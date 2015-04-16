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
 * Описывает собой тендер.
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
	 * Получить уникальный идентификатор тендера.
	 */
	public Integer getId() {
		return id;
	}



	/**
	 * Список категорий тендера.
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * Установить список категорий тендера.
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * Заголовок тендера.
	 * Обязателен.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Установить заголовок тендера.
	 * Обазятелен.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Короткое описание тендера.
	 * Может браться из полного описание если не указано.
	 */
	public String getShortDescr() {
		return shortDescr;
	}

	/**
	 * Короткое описание тендера.
	 * Может браться из полного описание если не указано.
	 */
	public void setShortDescr(String shortDescr) {
		this.shortDescr = shortDescr;
	}

	/**
	 * Полное описание тендера.
	 */
	public String getFullDescr() {
		return fullDescr;
	}

	/**
	 * Полное описание тендера.
	 */
	public void setFullDescr(String fullDescr) {
		this.fullDescr = fullDescr;
	}


	/**
	 * Список файлов тендера.
	 */
	public List<String> getFiles() {
		return files;
	}

	/**
	 * Список файлов тендера.
	 */
	public void setFiles(List<String> files) {
		this.files = files;
	}

	/**
	 * Желаемый адрес проведения тендера.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Желаемый адрес проведения тендера.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Желаемая цена на реализацию тендера.
	 * Обязательно.
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Желаемая цена на реализацию тендера.
	 * Обязательно.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * Желаемая дата реализации тендера.
	 * Обязательно.
	 */
	public Date getActualDate() {
		return actualDate;
	}

	/**
	 * Желаемая дата реализации тендера.
	 * Обязательно.
	 */
	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

	/**
	 * Актуальный период реализации тендера.
	 * Обязательно.
	 */
	public Period getActualTime() {
		return actualTime;
	}

	/**
	 * Актуальный период реализации тендера.
	 * Обязательно.
	 */
	public void setActualTime(Period actualTime) {
		this.actualTime = actualTime;
	}


	/**
	 * Дата реализации тендера.
	 * Обязательно.
	 */
	public Date getRealisationDate() {
		return realisationDate;
	}

	/**
	 * Дата реализации тендера.
	 * Обязательно.
	 */
	public void setRealisationDate(Date realisationDate) {
		this.realisationDate = realisationDate;
	}


	/**
	 * Период реализации тендера.
	 * Обязательно.
	 */
	public Period getRealisationTime() {
		return realisationTime;
	}

	/**
	 * Период реализации тендера.
	 * Обязательно.
	 */
	public void setRealisationTime(Period realisationTime) {
		this.realisationTime = realisationTime;
	}


	/**
	 * Это приватный тендер ??
	 */
	public boolean isPrivatePurchase() {
		return privatePurchase;
	}

	/**
	 * Это приватный тендер ??
	 */
	public void setPrivatePurchase(boolean privatePurchase) {
		this.privatePurchase = privatePurchase;
	}


	/**
	 * Дата публикации тендера.
	 */
	public Date getPublished() {
		return published;
	}

	/**
	 * Дата публикации тендера.
	 */
	public void setPublished(Date published) {
		this.published = published;
	}


	/**
	 * Настройки уведомления по тендеру.
	 */
	public PurchaseNotifications getNotifications() {
		return notifications;
	}

	/**
	 * Настройки уведомления по тендеру.
	 */
	public void setNotifications(PurchaseNotifications notifications) {
		this.notifications = notifications;
	}


	/**
	 * Текущее состояние тендера.
	 * Состояние <b>done</b> должно быть согласовано со свойством победителя.
	 */
	public PurchaseState getState() {
		return state;
	}

	
	/**
	 * Текущее состояние тендера.
	 * Состояние <b>done</b> должно быть согласовано со свойством победителя.
	 */
	public void setState(PurchaseState state) {
		this.state = state;
	}


	/**
	 * Победитель тендера.
	 * Состояние <b>done</b> должно быть согласовано со свойством победителя.
	 */
	public User getWinner() {
		return winner;
	}

	/**
	 * Победитель тендера.
	 * Состояние <b>done</b> должно быть согласовано со свойством победителя.
	 */
	public void setWinner(User winner) {
		this.winner = winner;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
}
