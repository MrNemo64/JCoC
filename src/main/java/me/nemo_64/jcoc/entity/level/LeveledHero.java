package me.nemo_64.jcoc.entity.level;

import me.nemo_64.jcoc.entity.Hero;

import java.util.Optional;

public interface LeveledHero extends Leveled {

    Hero baseHero();

    @Override
    Optional<? extends LeveledHero> withLevel(int level);
}
