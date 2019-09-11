package com.ceshi;

public class filterBean {
    private String request;
    private String clientId;
    private String sign;

    public filterBean() {
    }

    public filterBean(String request, String clientId, String sign) {
        this.request = request;
        this.clientId = clientId;
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "filterBean{" +
                "request='" + request + '\'' +
                ", clientId='" + clientId + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
