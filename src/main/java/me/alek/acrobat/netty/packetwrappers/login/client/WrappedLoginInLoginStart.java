package me.alek.acrobat.netty.packetwrappers.login.client;

import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.modelwrappers.WrappedGameProfile;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;

public class WrappedLoginInLoginStart extends WrappedPacket<WrappedLoginInLoginStart> {

    public WrappedLoginInLoginStart(Object rawPacket, PacketContainer<WrappedLoginInLoginStart> packetContainer) {
        super(rawPacket, packetContainer);
    }

    public WrappedGameProfile getProfile() {
        return getContainer().getGameProfiles().readField(0);
    }
}
