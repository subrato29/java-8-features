package lambda_concept;

/**
 * 
 * SAM => Single Abstract Method. This is called "FunctionalInterface". 
 * This type of interface can not have more than one abstract method
 *
 */

@FunctionalInterface
public interface WebPage {
	
	void header (String value);
	
}
