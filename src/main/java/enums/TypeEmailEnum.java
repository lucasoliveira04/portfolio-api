package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TypeEmailEnum {
    WORK("Work"),
    PERSONAL("Personal");

    private final String label;
}