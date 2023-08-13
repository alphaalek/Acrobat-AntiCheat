package me.alek.acrobat.netty.structure.converters;

public interface ApplicableConverter<T, C> extends JavaConverter<T, C> {

    ApplicableConverter<T, C> apply(T mapping);

    C fakeApply(T mapping);
}
