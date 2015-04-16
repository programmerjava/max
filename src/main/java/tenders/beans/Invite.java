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
 * Инвайт. Отображает заявку пользователя на добавление к закупке 
 * подрядчика, которого нет в базе данных площадки.
 * Сервер обрабатывает информацию из объекта и посылает сообщение по почте или смс.
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
	 * Получить текстовый заголовок для приглашения. 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Установить текстовый заголовок для приглашения. 
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * Получить имейл компании. 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Установить имейл компании. 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Получить название компании.
	 * Обязательное свойство объекта. 
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Установить название компании. 
	 * Обязательное свойство объекта. 
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	/**
	 * Закупка, на которую компания приглашается.
	 */
	public Purchase getPurchase() {
		return purchase;
	}

	/**
	 * Закупка, на которую компания приглашается.
	 */
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	/**
	 * Обработана ? Используется сервером для установления факта отправки приглашения.
	 */
	public boolean isHandled() {
		return handled;
	}

	/**
	 * Обработана ? Используется сервером для установления факта отправки приглашения.
	 */
	public void setHandled(boolean handled) {
		this.handled = handled;
	}


	public Integer getId() {
		return id;
	}
	
	
	
	
}
