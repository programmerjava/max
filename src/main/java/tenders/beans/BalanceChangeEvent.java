package tenders.beans;

import java.math.BigDecimal;
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
 * —обытие изменени€ значени€ счета.
 * ћожет использоватьс€ дл€ пересчета, дл€ просмотра истории пополнени€.
 */
@Entity
@Table(name="balance_history")
@Access(AccessType.FIELD)
public class BalanceChangeEvent {
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="balanceId")
	private Balance balance;
	
	
	@Column(nullable=false)
	private BigDecimal oldValue;
	
	@Column(nullable=false)
	private BigDecimal newValue;
	
	@Column(nullable = false)
	private LocalDateTime time;
	
	
	
	private String descr;



	
	/**
	 * ѕолучить уникальный идентификатор записи\объекта.
	 */
	public Integer getId() {
		return id;
	}




	/**
	 *  арточка баланса, с которой св€зано событие изменени€ счета.
	 */
	public Balance getBalance() {
		return balance;
	}


	/**
	 * ѕрив€зать карточку баланса, с которой св€зано событие изменени€ счета.
	 */
	public void setBalance(Balance balance) {
		this.balance = balance;
	}


	/**
	 * ѕолучить старое значение счета до изменени€.
	 */
	public BigDecimal getOldValue() {
		return oldValue;
	}


	/**
	 * ”становить старое значение счета до изменени€.
	 */
	public void setOldValue(BigDecimal oldValue) {
		this.oldValue = oldValue;
	}


	/**
	 * ѕолучить новое значение счета до изменени€.
	 */
	public BigDecimal getNewValue() {
		return newValue;
	}


	/**
	 * ”становить новое значение счета до изменени€.
	 */
	public void setNewValue(BigDecimal newValue) {
		this.newValue = newValue;
	}


	/**
	 * ѕолучить временную метку изменени€.
	 */
	public LocalDateTime getTime() {
		return time;
	}


	/**
	 * ”становить временную метку изменени€.
	 */
	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	/**
	 * ѕолучить текстовое описание изменени€.
	 * Ёто вспомогательное свойство.
	 * ћожет хранить информацию например о способе пополнени€ или списани€.
	 */
	public String getDescription() {
		return descr;
	}


	/**
	 * ”становить текстовое описание изменени€.
	 * Ёто вспомогательное свойство.
	 * ћожет хранить информацию например о способе пополнени€ или списани€.
	 */
	public void setDescription(String descr) {
		this.descr = descr;
	}
	
	


}
