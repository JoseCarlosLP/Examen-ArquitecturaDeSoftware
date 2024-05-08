package dto;

public class ResponsePaymentDto {
    private String statusCode;
    private String message;
    public ResponsePaymentDto(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
    public String getStatusCode() { return this.statusCode; }
    public String getMessage() { return this.message; }
    public void setStatusCode(String statusCode) { this.statusCode = statusCode; }
    public void setMessage(String message) { this.message = message; }
}
