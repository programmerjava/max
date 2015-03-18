package tenders.beans;

import javax.persistence.Embeddable;

/**
 * ��������� ��������� ����������� ��� ����������, 
 * ������� ������ ����������� �� �������.
 * @author GG
 *
 */
@Embeddable
public class OfferNotificationSettings {
	
	
	/**
	 * ������� ������ (����� �����������) � �����������.
	 */
	public boolean listenAnswers;
	
	
	/**
	 * ��������� � ���������� ���� �� ������.
	 */
	public boolean priceChanges;
	
	
}
