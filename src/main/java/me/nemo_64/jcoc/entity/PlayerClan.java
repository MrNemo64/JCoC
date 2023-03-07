package me.nemo_64.jcoc.entity;

import java.util.concurrent.CompletableFuture;

public interface PlayerClan {

    IdentityTag tag();

    int level();

    String name();

    Object badgeUrl(); // TODO: type of this??

    CompletableFuture<Clan> clan();

}
