package racingcar.model;

import racingcar.constant.ExceptionMessage;

public class Name {
    private static final int CAR_MAX_NAME_LENGTH = 5;

    private final String name;

    public Name(String name) {
        validCarName(name);
        this.name = name.trim();
    }

    private void validCarName(String name) {
        if (name.isEmpty() || name.length() > CAR_MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(
                    ExceptionMessage.EXCEPTION_MESSAGE.getExceptionMessage());
        }
        if (isOnlySpace(name)) {
            throw new IllegalArgumentException(
                    ExceptionMessage.EXCEPTION_SPACE_MESSAGE.getExceptionMessage());
        }
    }

    private boolean isOnlySpace(String name) {
        return name.isBlank();
    }

    public String getName() {
        return this.name;
    }
}
