package me.nemo_64.jcoc.entity;

import java.util.Optional;

public interface Spell {

    Optional<? extends LeveledSpell> withLevel(int level);

}
