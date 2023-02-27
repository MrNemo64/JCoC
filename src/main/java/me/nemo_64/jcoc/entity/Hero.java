package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.level.LeveledHero;

import java.util.Optional;

public interface Hero {

    VillageType village();

    Optional<? extends LeveledHero> withLevel(int level);

}
