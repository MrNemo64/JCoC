package me.nemo_64.jcoc.entity;

import java.util.Optional;

public interface LeveledSpell extends Leveled {

    @Override
    Optional<? extends LeveledSpell> withLevel(int level);
}
