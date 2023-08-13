package me.alek.acrobat.netty.modelwrappers.network;

import me.alek.acrobat.netty.utility.reflect.NMSUtils;
import me.alek.acrobat.netty.utility.reflect.Reflection;

public enum WrappedEnumProtocolDirection {

    SERVERBOUND,

    CLIENTBOUND;

    public Enum<?> getHandle() {
        return Reflection.getEnumAtIndex(NMSUtils.getEnumProtocolDirectionClass(), ordinal());
    }

}
