package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.level.LeveledTroop;

import java.util.Optional;

public interface Troop {

    VillageType village();

    Optional<? extends LeveledTroop> withLevel(int level);

}
