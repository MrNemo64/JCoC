package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.level.LeveledHero;
import me.nemo_64.jcoc.entity.level.LeveledSpell;
import me.nemo_64.jcoc.entity.level.LeveledTroop;

import java.util.Collection;

public interface Player {

    IdentityTag tag();

    String name();

    int expLevel();

    Collection<LeveledTroop> unlockedTroops();

    Collection<LeveledSpell> unlockedSpells();

    Collection<LeveledHero> unlockedHeroes();

}
