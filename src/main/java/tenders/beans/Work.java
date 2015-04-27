package tenders.beans;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;



/**
 * Этот объект отображает данные о когда-то выполненной работе.
 * Может использоваться для составления портфолио подрядчика.
 * @author GG
 */
@Entity
@Table(name="works")
@Access(AccessType.FIELD)
public class Work {
	

	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	@Column(nullable=false)
	private String title;
	

	@Column(nullable=false)
	private String descr;
	
	
	@ElementCollection
	@OrderColumn(name="position")
	private List<String> photos;

	
	
	
	/**
	 * Получить уникальный идентификатор работы.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Пользователь, который когда-то выполнил работу.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Пользователь, который когда-то выполнил работу.
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * Заголовок. Обязательный элемент.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Заголовок. Обязательный элемент.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Описание. Обязательный элемент.
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * Описание. Обязательный элемент.
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}


	/**
	 * Список фотографий по работе.
	 */
	public List<String> getPhotos() {
		return photos;
	}

	/**
	 * Список фотографий по работе.
	 */
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	
	
	
	
	
	
	
	
}
