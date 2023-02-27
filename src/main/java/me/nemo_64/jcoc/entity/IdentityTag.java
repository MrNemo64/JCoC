package me.nemo_64.jcoc.entity;

public class IdentityTag {

    public static IdentityTag of(String tag) {
        return new IdentityTag(tag);
    }


    private final String tag;

    private IdentityTag(String tag) {
        this.tag = tag;
    }
}
