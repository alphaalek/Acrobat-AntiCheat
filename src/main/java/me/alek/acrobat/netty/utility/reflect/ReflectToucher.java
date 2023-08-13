package me.alek.acrobat.netty.utility.reflect;

public interface ReflectToucher<T> {

    Class<T> getType();

    String getName();
}
