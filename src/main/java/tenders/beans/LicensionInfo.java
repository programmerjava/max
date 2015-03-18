package tenders.beans;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ������ ���������� � ��������.
 * @author GG
 *
 */
@Embeddable
public class LicensionInfo {
	
	
	private boolean haveLicension;
	
	
	@Temporal(TemporalType.DATE)
	private Date licensionDate;


	
	/**
	 * ������� �� ��������.
	 */
	public boolean isHaveLicension() {
		return haveLicension;
	}

	/**
	 * ������� �� ��������.
	 */
	public void setHaveLicension(boolean haveLicension) {
		this.haveLicension = haveLicension;
	}

	/**
	 * �������� ���� ������ ��������.
	 */
	public Date getLicensionDate() {
		return licensionDate;
	}


	/**
	 * ���������� ���� ��������� ��������.
	 */
	public void setLicensionDate(Date licensionDate) {
		this.licensionDate = licensionDate;
	}
	
	

}
