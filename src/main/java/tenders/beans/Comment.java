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
 * �������� ����������� � ����������� ���������� 
 * ����������� ���� ����� �����������, ���� ����������.
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
	 * �������� ����� �����������.
	 * ���� ����� ���������� ������. 
	 */
	public String getText() {
		return text;
	}

	/**
	 * ���������� ����� �����������.
	 * ���� ����� ���������� ������. 
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * �������� ������ ������������, ������� ������� ���������.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * ���������� ������ ������������, ������� ������� ���������.
	 */
	public void setUser(User user) {
		this.user = user;
	}


	
	/**
	 * �������� ����� �������� �����������.
	 */
	public LocalDateTime getTime() {
		return time;
	}

	/**
	 * ���������� ����� �������� �����������.
	 * �� ��������� ����� �������� -- ������.
	 */
	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	
	/**
	 * �������� �� �����������.
	 */
	public boolean isReaded() {
		return readed;
	}

	/**
	 * �������� �� �����������.
	 */
	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	/**
	 * �������� ������ ������, �� ������� ������������� ��������.
	 */
	public Offer getOffer() {
		return offer;
	}
	
	
	/**
	 * ��������� ���������� �����.
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 * �������� ���������� �������������.
	 */
	public Integer getId() {
		return id;
	}

}
