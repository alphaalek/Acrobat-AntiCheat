package me.alek.acrobat.netty.structure.converters;

public interface JavaConverter<T, C> {

    C convertDelegate(T delegate, Object... params);

    T convertDeclaring(C object);

}
