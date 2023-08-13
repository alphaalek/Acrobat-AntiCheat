package me.alek.acrobat.netty.packet.type;

import me.alek.acrobat.netty.utility.protocol.ProtocolRange;

public interface RangedPacketTypeEnum extends PacketTypeEnum {

    ProtocolRange getRange();
}
