package me.nemo_64.jcoc.entity.level;

import java.util.Optional;

public interface LeveledHero extends Leveled {

    @Override
    Optional<? extends LeveledHero> withLevel(int level);
}
