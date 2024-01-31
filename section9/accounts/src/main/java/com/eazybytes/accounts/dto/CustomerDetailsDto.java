package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDetailsDto {

    @NotEmpty(message = "name cannot be null or empty")
    @Size(min = 5, max = 30, message = "the length of the name should be between 5 and 30")
    private String name;
    @Email(message = "email address should be valid")
    @NotEmpty(message = "email cannot be null or empty")
    private String email;
    @Pattern(regexp = "^[0-9]{10}$", message = "mobile number should be ten digits")
    private String mobileNumber;
    private AccountsDto accountsDto;

    private CardsDto cardsDto;

    private LoansDto loansDto;
}
