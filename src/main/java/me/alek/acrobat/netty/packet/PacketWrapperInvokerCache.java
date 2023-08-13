package me.alek.acrobat.netty.packet;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packet.type.PacketTypeEnum;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import me.alek.acrobat.netty.utility.reflect.MethodInvoker;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PacketWrapperInvokerCache {

    public static Map<PacketTypeEnum, MethodInvoker<Object>> WRAPPER_CACHE = new ConcurrentHashMap<>();

    public static synchronized WrappedPacket<?> getWrapper(PacketTypeEnum type, Object rawPacket, PacketContainer<?> packetContainer) {
        return (WrappedPacket<?>) getWrapperInvoker(type).invoke(null, rawPacket, packetContainer);
    }

    public static MethodInvoker<Object> getWrapperInvoker(PacketTypeEnum type) {
        return WRAPPER_CACHE.computeIfAbsent(type, packetType -> {
            Class<?> nmsClass = packetType.getNmsClass();

            return PacketWrapperFactory.createWrapperInvoker(packetType.getState(), nmsClass);
        });
    }
}
