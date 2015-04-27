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
 * ќтражает текущий баланс пользовател€ сервиса.
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
	 * ѕолучить уникальный идентификатор счета.
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * ѕолучить пользовател€, который €вл€етс€ обладателем счета.
	 */
	public User getCutomer() {
		return user;
	}



	/**
	 * ѕрив€зать пользовател€, который €вл€етс€ обладателем счета.
	 */
	public void setCutomer(User cutomer) {
		this.user = cutomer;
	}


	/**
	 * ѕолучить баланс. 
	 */
	public BigDecimal getValue() {
		return value;
	}


	/**
	 * ”становить баланс. 
	 * Ѕаланс может быть отрицательным, но не может быть равен null.
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
	

}
