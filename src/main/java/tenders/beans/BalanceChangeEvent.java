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
 * ������� ��������� �������� �����.
 * ����� �������������� ��� ���������, ��� ��������� ������� ����������.
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
	 * �������� ���������� ������������� ������\�������.
	 */
	public Integer getId() {
		return id;
	}




	/**
	 * �������� �������, � ������� ������� ������� ��������� �����.
	 */
	public Balance getBalance() {
		return balance;
	}


	/**
	 * ��������� �������� �������, � ������� ������� ������� ��������� �����.
	 */
	public void setBalance(Balance balance) {
		this.balance = balance;
	}


	/**
	 * �������� ������ �������� ����� �� ���������.
	 */
	public BigDecimal getOldValue() {
		return oldValue;
	}


	/**
	 * ���������� ������ �������� ����� �� ���������.
	 */
	public void setOldValue(BigDecimal oldValue) {
		this.oldValue = oldValue;
	}


	/**
	 * �������� ����� �������� ����� �� ���������.
	 */
	public BigDecimal getNewValue() {
		return newValue;
	}


	/**
	 * ���������� ����� �������� ����� �� ���������.
	 */
	public void setNewValue(BigDecimal newValue) {
		this.newValue = newValue;
	}


	/**
	 * �������� ��������� ����� ���������.
	 */
	public LocalDateTime getTime() {
		return time;
	}


	/**
	 * ���������� ��������� ����� ���������.
	 */
	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	/**
	 * �������� ��������� �������� ���������.
	 * ��� ��������������� ��������.
	 * ����� ������� ���������� �������� � ������� ���������� ��� ��������.
	 */
	public String getDescription() {
		return descr;
	}


	/**
	 * ���������� ��������� �������� ���������.
	 * ��� ��������������� ��������.
	 * ����� ������� ���������� �������� � ������� ���������� ��� ��������.
	 */
	public void setDescription(String descr) {
		this.descr = descr;
	}
	
	


}
