package tenders.beans;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Хранит информацию о лицензии.
 * @author GG
 *
 */
@Embeddable
public class LicensionInfo {
	
	
	private boolean haveLicension;
	
	
	@Temporal(TemporalType.DATE)
	private Date licensionDate;


	
	/**
	 * Имеется ли лицензия.
	 */
	public boolean isHaveLicension() {
		return haveLicension;
	}

	/**
	 * Имеется ли лицензия.
	 */
	public void setHaveLicension(boolean haveLicension) {
		this.haveLicension = haveLicension;
	}

	/**
	 * Получить дату выдачи лицензии.
	 */
	public Date getLicensionDate() {
		return licensionDate;
	}


	/**
	 * Установить дату получения лицензии.
	 */
	public void setLicensionDate(Date licensionDate) {
		this.licensionDate = licensionDate;
	}
	
	

}
