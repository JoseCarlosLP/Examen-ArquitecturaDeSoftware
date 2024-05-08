package dto;

public class CreditDto {
    private String card_number;
    private String cvv;
    private String expiration_date;
    CreditDto(String cardNumber, String cvv, String expirationDate) {
        this.card_number = cardNumber;
        this.cvv = cvv;
        this.expiration_date = expirationDate;
    }
    public String getCard_number() {return card_number;}
    public String getCvv() {return cvv;}
    public String getExpiration_date() {return expiration_date;}
}
