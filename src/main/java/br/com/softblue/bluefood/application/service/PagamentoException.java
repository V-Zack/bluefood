package br.com.softblue.bluefood.application.service;

@SuppressWarnings("serial")
public class PagamentoException extends Exception {

	public PagamentoException() {

	}

	public PagamentoException(String message) {
		super(message);
		
	}

	public PagamentoException(Throwable cause) {
		super(cause);
		
	}

	public PagamentoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PagamentoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
