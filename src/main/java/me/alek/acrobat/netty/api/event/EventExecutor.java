package me.alek.acrobat.netty.api.event;

public interface EventExecutor {

    void call(Event event);
}
