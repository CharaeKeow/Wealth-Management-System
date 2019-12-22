package controller.validator;

public class InvalidValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidValueException(String field) {		
		super(field + " must be a positive number.");
	}
}