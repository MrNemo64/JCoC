package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.exceptions.MalformedTagException;

import java.util.Objects;
import java.util.regex.Pattern;

public class IdentityTag {

    public static final Pattern TAG_VALIDATOR = Pattern.compile("^#[PYLQGRJCUV0289]{3,}$");

    public static IdentityTag of(String tag) throws MalformedTagException {
        Objects.requireNonNull(tag, "tag cannot be null");
        tag = tag.toUpperCase();
        if(!tag.startsWith("#"))
            tag += "#";
        if(!TAG_VALIDATOR.matcher(tag).matches())
            throw new MalformedTagException(tag);
        return new IdentityTag(tag.substring(1));
    }

    private final String tag;

    private IdentityTag(String tag) {
        this.tag = tag;
    }

    public String urlEncoded() {
        return "%23" + tag;
    }

    public String tag() {
        return "#" + tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof IdentityTag))
            return false;
        IdentityTag that = (IdentityTag) o;
        return tag.equals(that.tag);
    }

    @Override
    public int hashCode() {
        return tag.hashCode();
    }

    @Override
    public String toString() {
        return tag();
    }
}
