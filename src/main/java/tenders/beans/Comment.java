package tenders.beans;

import java.time.LocalDateTime;

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
 * Отражает комментарий к предложению подрядчика 
 * оставленный либо самим подрядчиком, либо заказчиком.
 * 
 * @author GG
 */
@Entity
@Table(name = "comments")
@Access(AccessType.FIELD)
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;

	@Column(nullable=false)
	private String text;

	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	@Column(nullable=false)
	private LocalDateTime time;

	
	private boolean readed;

	@ManyToOne
	@JoinColumn(name="offerId")
	private Offer offer;

	
	/**
	 * Получить текст комментария.
	 * Этот текст набирается юзером. 
	 */
	public String getText() {
		return text;
	}

	/**
	 * Установить текст комментария.
	 * Этот текст набирается юзером. 
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Получить объект пользователя, который оставил сообщение.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Установить объект пользователя, который оставил сообщение.
	 */
	public void setUser(User user) {
		this.user = user;
	}


	
	/**
	 * Получить время отправки комментария.
	 */
	public LocalDateTime getTime() {
		return time;
	}

	/**
	 * Установить время отправки комментария.
	 * По умолчанию время отправки -- сейчас.
	 */
	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	
	/**
	 * Прочитан ли комментарий.
	 */
	public boolean isReaded() {
		return readed;
	}

	/**
	 * Прочитан ли комментарий.
	 */
	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	/**
	 * Получить объект оффера, на который привязываются комменты.
	 */
	public Offer getOffer() {
		return offer;
	}
	
	
	/**
	 * Привязать конкретный оффер.
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 * Получить уникальный идентификатор.
	 */
	public Integer getId() {
		return id;
	}

}
