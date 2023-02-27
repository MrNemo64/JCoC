package me.nemo_64.jcoc.entity.level;

import me.nemo_64.jcoc.entity.Troop;

import java.util.Optional;

public interface LeveledTroop extends Leveled {

    Troop baseTroop();

    @Override
    Optional<? extends LeveledTroop> withLevel(int level);
}
