package me.nemo_64.jcoc.entity;

import com.google.gson.JsonElement;

import java.util.Objects;
import java.util.Optional;

public enum ClanRole {

    NOT_MEMBER("notMember"),
    MEMBER("member"),
    ELDER("admin"),
    CO_LEADER("coLeader"),
    LEADER("leader");

    private final String role;

    ClanRole(String role) {
        this.role = role;
    }

    public static Optional<ClanRole> from(JsonElement element) {
        Objects.requireNonNull(element, "element");
        if (!element.isJsonPrimitive() || !element.getAsJsonPrimitive().isString())
            return Optional.empty();
        switch (element.getAsJsonPrimitive().getAsString()) {
            case "notMember":
                return Optional.of(NOT_MEMBER);
            case "member":
                return Optional.of(MEMBER);
            case "admin":
                return Optional.of(ELDER);
            case "coLeader":
                return Optional.of(CO_LEADER);
            case "leader":
                return Optional.of(LEADER);
            default:
                return Optional.empty();
        }
    }

    public String role() {
        return role;
    }
}
