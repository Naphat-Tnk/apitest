package com.example.apitest.model;

public class SsoResponse {
    private String responseCode;
    private String responseMessage;
    private ResponseData responseData;

    public static class ResponseData {
        private String userId;
        private String token;

        public String getUserId() {
            return userId;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public ResponseData getResponseData() {
        return responseData;
    }
    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }


}
