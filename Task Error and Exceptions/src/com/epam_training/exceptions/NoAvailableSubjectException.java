package com.epam_training.exceptions;

public class NoAvailableSubjectException extends Exception{
    private String myException;
    private int severity;

    public NoAvailableSubjectException(String message) {
        super(message);
        this.myException = myException;
        this.severity = severity;
    }

    public NoAvailableSubjectException(String message, Throwable cause, String myException, int severity) {
        super(message, cause);
        this.myException = myException;
        this.severity = severity;
    }

    public NoAvailableSubjectException(Throwable cause, String myException, int severity) {
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
        return "NoAvailableFGroupsException{" +
                "myException=" + myException + '\'' +
                ", severity=" + severity +
                '}';
    }
}
