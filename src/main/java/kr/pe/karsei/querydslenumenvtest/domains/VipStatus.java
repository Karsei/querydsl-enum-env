package kr.pe.karsei.querydslenumenvtest.domains;

import lombok.Getter;

@Getter
public enum VipStatus {
    WAITING("WA"),
    ENTERED("EN"),
    EATING("EA"),
    RESTING("RE"),
    INVALID("IN")
    ;

    private final String value;

    VipStatus(String value) {
        this.value = value;
    }
}
