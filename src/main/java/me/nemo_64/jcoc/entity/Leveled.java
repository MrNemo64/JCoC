package me.nemo_64.jcoc.entity;

import java.util.Optional;

public interface Leveled {

    int level();

    Optional<? extends Leveled> withLevel(int level);

}
