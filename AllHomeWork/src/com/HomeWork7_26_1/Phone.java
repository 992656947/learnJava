package com.HomeWork7_26_1;

public class Phone {
    private String selfPhoneNumber;
    private String objectPhoneNumber;

    private CallType CallType;

    public Phone() {}

    public Phone(String selfPhoneNumber, String objectPhoneNumber, CallType callType) {
        this.selfPhoneNumber = selfPhoneNumber;
        this.objectPhoneNumber = objectPhoneNumber;
        CallType = callType;
    }

    public String getSelfPhoneNumber() {
        return selfPhoneNumber;
    }

    public void setSelfPhoneNumber(String selfPhoneNumber) {
        this.selfPhoneNumber = selfPhoneNumber;
    }

    public String getObjectPhoneNumber() {
        return objectPhoneNumber;
    }

    public void setObjectPhoneNumber(String objectPhoneNumber) {
        this.objectPhoneNumber = objectPhoneNumber;
    }

    public CallType getCallType() {
        return CallType;
    }

    public void setCallType(CallType callType) {
        CallType = callType;
    }
}
