package com.db.lombok_examples;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
@Builder
public class Client {
    private final String name;
    private final int bonus;
    private final int debt;

}
