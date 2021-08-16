package com.epam_training.exceptions;

public class NoMarksException extends Exception{
    private String myException;
    private int severity;

    public NoMarksException(String message) {
        super(message);
        this.myException = myException;
        this.severity = severity;
    }

    public NoMarksException(String message, Throwable cause, String myException, int severity) {
        super(message, cause);
        this.myException = myException;
        this.severity = severity;
    }

    public NoMarksException(Throwable cause, String myException, int severity) {
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
        return "NoAvailableFacultiesException{" +
                "myException=" + myException + '\'' +
                ", severity=" + severity +
                '}';
    }
}
