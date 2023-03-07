package me.nemo_64.jcoc.entity;

import me.nemo_64.jcoc.entity.level.LeveledHero;
import me.nemo_64.jcoc.entity.level.LeveledSpell;
import me.nemo_64.jcoc.entity.level.LeveledTroop;

import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;

public interface Player {

    IdentityTag tag();

    String name();

    int expLevel();

    ClanRole clanRole();

    Optional<PlayerClan> clan();

    Object league(); // TODO: type of this??

    int trophies();

    int bestTrophies();

    int donations();

    int donationsReceived();

    int attackWins();

    int defenseWins();

    int townHallLevel();

    OptionalInt townHallWeaponLevel();

    int versusBattleWins();

    int builderHallLevel();

    int versusTrophies();

    int bestVersusTrophies();

    int versusBattleWinCount();

    int warStars();

    Object achievements(); // TODO: type of this??

    int clanCapitalContributions();

    Object playerHouse(); // TODO: type of this??

    Collection<LeveledTroop> unlockedTroops();

    Collection<LeveledSpell> unlockedSpells();

    Collection<LeveledHero> unlockedHeroes();

}
