package dto;

public class ResponseLoginDto {
    private String token;
    private String timestamp;
    public ResponseLoginDto(String token, String timestamp) {
        this.token = token;
        this.timestamp = timestamp;
    }
    public String getToken() { return this.token; }
    public String getTimestamp() { return this.timestamp; }
}
