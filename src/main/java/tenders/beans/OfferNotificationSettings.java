package tenders.beans;

import javax.persistence.Embeddable;

/**
 * Настройки различных уведомлений для подрядчика, 
 * который сделал предложение по закупке.
 * @author GG
 *
 */
@Embeddable
public class OfferNotificationSettings {
	
	
	/**
	 * Слушать ответы (новые комментарии) к предложению.
	 */
	public boolean listenAnswers;
	
	
	/**
	 * Оповещать о изменениях цены на тендер.
	 */
	public boolean priceChanges;
	
	
}
