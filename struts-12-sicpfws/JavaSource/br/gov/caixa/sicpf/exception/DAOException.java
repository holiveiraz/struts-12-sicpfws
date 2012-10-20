package br.gov.caixa.sicpf.exception;

public final class DAOException extends RuntimeException {

	private static final long serialVersionUID = 3444066624086692635L;

	public DAOException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DAOException(final String message) {
		super(message);
	}

	public DAOException(final Throwable cause) {
		super(cause);
	}

}
