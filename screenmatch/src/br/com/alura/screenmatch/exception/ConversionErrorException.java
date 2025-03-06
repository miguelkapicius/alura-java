package br.com.alura.screenmatch.exception;

public class ConversionErrorException extends RuntimeException {
    private String message;
    public ConversionErrorException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
