package com.linkedin.events.customer;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CustomerRegisteredEvent {

    private final Customer customer;

}
