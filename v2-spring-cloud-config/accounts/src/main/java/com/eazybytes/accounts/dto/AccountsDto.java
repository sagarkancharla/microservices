package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {
    @NotEmpty(message = "account number should not be null or empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "account number should be ten digits")
    private Long accountNumber;

    @NotEmpty(message = "account type should not be null or empty")
    private String accountType;

    @NotEmpty(message = "address should not be null or empty")
    private String branchAddress;
}
