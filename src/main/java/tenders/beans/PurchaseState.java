package tenders.beans;

/**
 * Состояние тендера\закупки.
 * @author GG
 *
 */
public enum PurchaseState {

	/**
	 * проводится.
	 */
	running,
	/**
	 * отменен клиентом или время истекло ?
	 */
	cancelled,
	
	
	/**
	 * закончен, есть победитель
	 */
	done
	
	
}
