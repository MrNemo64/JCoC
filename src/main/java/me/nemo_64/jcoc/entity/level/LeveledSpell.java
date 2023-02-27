package me.nemo_64.jcoc.entity.level;

import me.nemo_64.jcoc.entity.Spell;

import java.util.Optional;

public interface LeveledSpell extends Leveled {

    Spell baseSpell();

    @Override
    Optional<? extends LeveledSpell> withLevel(int level);
}
