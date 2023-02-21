package me.nemo_64.jcoc.entity;

import java.util.Optional;

public interface LeveledTroop extends Leveled {

    Troop baseTroop();

    @Override
    Optional<? extends LeveledTroop> withLevel(int level);
}
