package com.uuhnaut69.customer.api.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public record CustomerRequest(@NotBlank String username, @NotBlank String fullName, @NotNull BigDecimal balance) {
}
