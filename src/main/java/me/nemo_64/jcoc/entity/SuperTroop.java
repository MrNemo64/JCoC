package me.nemo_64.jcoc.entity;

public interface SuperTroop extends Troop {

    Troop normalTroop();

    @Override
    default VillageType village() {
        return VillageType.HOME;
    }

}
