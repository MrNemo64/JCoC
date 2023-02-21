package me.nemo_64.jcoc.entity;

import java.util.Optional;

public interface Troop {

    VillageType village();

    Optional<? extends LeveledTroop> withLevel(int level);

}
