package me.nemo_64.jcoc.entity.exceptions;

public class MalformedTagException extends RuntimeException {

    public MalformedTagException(String malformedTag) {
        super("The tag '" + malformedTag + "' does not follow the tag format");
    }

}