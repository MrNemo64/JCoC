package me.nemo_64.jcoc;

import java.util.Objects;

public class ApiKey {

    private final String key;

    public ApiKey(String key) {
        this.key = Objects.requireNonNull(key, "key");
    }

    public String key() {
        return key;
    }
}
