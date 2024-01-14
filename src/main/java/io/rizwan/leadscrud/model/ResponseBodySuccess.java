package io.rizwan.leadscrud.model;

public class ResponseBodySuccess implements Response {
    private String status;
    private String data;

    public ResponseBodySuccess(String status, String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBodySuccess{" +
                "status='" + status + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
