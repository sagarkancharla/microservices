package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.Accounts;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Sagar"
    )
    @NotEmpty(message = "name cannot be null or empty")
    @Size(min = 5, max = 30, message = "the length of the name should be between 5 and 30")
    private String name;

    @Schema(
            description = "email of the customer", example = "Sagar.k@gmail.com"
    )
    @Email(message = "email address should be valid")
    @NotEmpty(message = "email cannot be null or empty")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "9988799887"
    )
    @Pattern(regexp = "^[0-9]{10}$", message = "mobile number should be ten digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
