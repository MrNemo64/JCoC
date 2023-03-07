package me.nemo_64.jcoc.entity;

import com.google.gson.JsonElement;

import java.util.Objects;
import java.util.Optional;

public enum WarPreference {

    IN("in"),
    OUT("out");

    private final String preference;

    WarPreference(String preference) {
        this.preference = preference;
    }

    public static Optional<WarPreference> from(JsonElement element) {
        Objects.requireNonNull(element, "element");
        if (!element.isJsonPrimitive() || !element.getAsJsonPrimitive().isString())
            return Optional.empty();
        switch (element.getAsJsonPrimitive().getAsString()) {
            case "in":
                return Optional.of(IN);
            case "out":
                return Optional.of(OUT);
            default:
                return Optional.empty();
        }
    }

    public String preference() {
        return preference;
    }
}
