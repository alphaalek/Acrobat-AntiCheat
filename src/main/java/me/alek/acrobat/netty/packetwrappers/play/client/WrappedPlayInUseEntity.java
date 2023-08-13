package me.alek.acrobat.netty.packetwrappers.play.client;

import me.alek.acrobat.netty.api.packet.IStructureModifier;
import me.alek.acrobat.netty.api.packet.container.PacketContainer;
import me.alek.acrobat.netty.packetwrappers.WrappedPacket;
import me.alek.acrobat.netty.structure.converters.Converters;
import me.alek.acrobat.netty.utility.reflect.NMSUtils;
import org.bukkit.util.Vector;

import java.util.Optional;

public class WrappedPlayInUseEntity extends WrappedPacket<WrappedPlayInUseEntity> {

    private static final Class<Object> enumEntityUseActionClass = NMSUtils.getEntityUseActionClass();
    private static final Class<Object> vec3DClass = NMSUtils.getVec3DClass();

    public WrappedPlayInUseEntity(Object rawPacket, PacketContainer<WrappedPlayInUseEntity> packetContainer) {
        super(rawPacket,packetContainer);
    }

    // TODO: fix til 1.17+

    public int getEntityID() {
        return getContainer().getInts().readField(0);
    }

    public Optional<Vector> getTarget() {
        Vector vector = getContainer().getModifier(vec3DClass, Converters.getVector3DConverter()).readField(0);
        return Optional.ofNullable(vector);
    }

    public void setTarget(Vector vector) {
        if (getAction() != EnumEntityUseAction.INTERACT_AT) return;

        IStructureModifier<Vector> modifier = getContainer().getModifier(vec3DClass, Converters.getVector3DConverter());
        modifier.writeField(0, vector);
    }

    public EnumEntityUseAction getAction() {
        return getContainer().getModifier(enumEntityUseActionClass, Converters.getEntityUseActionConverter()).readField(0);
    }

    public enum EnumEntityUseAction {
        INTERACT, ATTACK, INTERACT_AT
    }

}
