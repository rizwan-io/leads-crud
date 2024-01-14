package io.rizwan.leadscrud.model;

public class ResponseBodyError implements Response {
    private String status;
    private ErrorResponse errorResponse;

    public ResponseBodyError(String status, ErrorResponse errorResponse) {
        this.status = status;
        this.errorResponse = errorResponse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public static class ErrorResponse {
        private String code;
        private String errorResponse;

        public ErrorResponse(String code, String errorResponse) {
            this.code = code;
            this.errorResponse = errorResponse;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getErrorResponse() {
            return errorResponse;
        }

        public void setErrorResponse(String errorResponse) {
            this.errorResponse = errorResponse;
        }
    }
}
