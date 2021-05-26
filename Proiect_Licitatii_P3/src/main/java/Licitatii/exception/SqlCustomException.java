package Licitatii.exception;

public class SqlCustomException extends RuntimeException{

    public SqlCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
