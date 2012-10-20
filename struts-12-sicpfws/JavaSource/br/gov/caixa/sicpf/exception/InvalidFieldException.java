package br.gov.caixa.sicpf.exception;

public class InvalidFieldException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8864915027404419584L;

	public InvalidFieldException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InvalidFieldException(final String message) {
		super(message);
	}

	public InvalidFieldException(final Throwable cause) {
		super(cause);
	}
}
