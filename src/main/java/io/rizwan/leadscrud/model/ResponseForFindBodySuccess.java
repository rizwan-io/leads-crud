package io.rizwan.leadscrud.model;

import io.rizwan.leadscrud.entity.Leads;

import java.util.List;

public class ResponseForFindBodySuccess implements Response {
    private String status;
    private List<Leads> data;

    public ResponseForFindBodySuccess(String status, List<Leads> data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Leads> getData() {
        return data;
    }

    public void setData(List<Leads> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseForFindBodySuccess{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
