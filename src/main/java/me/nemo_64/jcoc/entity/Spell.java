package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.level.LeveledSpell;

import java.util.Optional;

public interface Spell {

    Optional<? extends LeveledSpell> withLevel(int level);

}
