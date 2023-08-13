package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.modelwrappers.network.WrappedPacketDataSerializer;
import me.alek.acrobat.netty.utility.protocol.Protocol;
import me.alek.acrobat.netty.utility.reflect.Reflection;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedPlayInCustomPayload extends WrappedPacket<WrappedPlayInCustomPayload> {

    private static final boolean MODERN = Protocol.getProtocol().isNewerThan(Protocol.v1_12_2);
    private static Class<?> MINECRAFT_KEY_CLASS;

    public WrappedPlayInCustomPayload(Object rawPacket, PacketContainer<WrappedPlayInCustomPayload> packetContainer) {
        super(rawPacket, packetContainer);

        if (MODERN) {
            MINECRAFT_KEY_CLASS = Reflection.getFuzzyClass("{nms}.MinecraftKey", "{nms}.resources.MinecraftKey");
        }
    }

    public WrappedPacketDataSerializer getDataSerializer() {
        return getContainer().getDataSerializers().readField(0);
    }

    public Object getMinecraftKey() {
        if (MODERN) {
            return getContainer().getObjects(MINECRAFT_KEY_CLASS).readField(0);
        }
        return getContainer().getStrings().readField(0);
    }

    public String getChannel() {
        return getMinecraftKey().toString();
    }

}
