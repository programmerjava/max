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
 * ���� ������ ���������� ������ � �����-�� ����������� ������.
 * ����� �������������� ��� ����������� ��������� ����������.
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
	 * �������� ���������� ������������� ������.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * ������������, ������� �����-�� �������� ������.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * ������������, ������� �����-�� �������� ������.
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * ���������. ������������ �������.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * ���������. ������������ �������.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * ��������. ������������ �������.
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * ��������. ������������ �������.
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}


	/**
	 * ������ ���������� �� ������.
	 */
	public List<String> getPhotos() {
		return photos;
	}

	/**
	 * ������ ���������� �� ������.
	 */
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	
	
	
	
	
	
	
	
}
