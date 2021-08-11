package com.epam_training;

public class MyCustomException extends Exception {
    private String myException;
    private int severity;

    public MyCustomException(String message) {
        super(message);
        this.myException = myException;
        this.severity = severity;
    }

    public MyCustomException(String message, Throwable cause, String myException, int severity) {
        super(message, cause);
        this.myException = myException;
        this.severity = severity;
    }

    public MyCustomException(Throwable cause, String myException, int severity) {
        super(cause);
        this.myException = myException;
        this.severity = severity;
    }

    public String getMyException() {
        return myException;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "MyCustomException{" +
                "myException=" + myException + '\'' +
                ", severity=" + severity +
                '}';
    }
}
