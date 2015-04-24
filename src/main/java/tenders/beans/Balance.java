package tenders.beans;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * �������� ������� ������ ������������ �������.
 * @author GG
 *
 */
@Entity
@Table(name="balance")
@Access(AccessType.FIELD)
public class Balance {
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	
	@OneToOne
	private User user;
	
	
	@Column(nullable = false)
	private BigDecimal value;



	
	/**
	 * �������� ���������� ������������� �����.
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * �������� ������������, ������� �������� ����������� �����.
	 */
	public User getCutomer() {
		return user;
	}



	/**
	 * ��������� ������������, ������� �������� ����������� �����.
	 */
	public void setCutomer(User cutomer) {
		this.user = cutomer;
	}


	/**
	 * �������� ������. 
	 */
	public BigDecimal getValue() {
		return value;
	}


	/**
	 * ���������� ������. 
	 * ������ ����� ���� �������������, �� �� ����� ���� ����� null.
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
	

}
