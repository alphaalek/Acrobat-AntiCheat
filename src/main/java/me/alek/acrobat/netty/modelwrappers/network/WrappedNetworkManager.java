package me.alek.acrobat.netty.modelwrappers.network;

import io.netty.util.AttributeKey;
import me.alek.acrobat.netty.api.packet.IStructureModifier;
import me.alek.acrobat.netty.modelwrappers.WrappedObject;
import me.alek.acrobat.netty.structure.ReflectStructure;
import me.alek.acrobat.netty.structure.ReflectStructureCache;
import me.alek.acrobat.netty.utility.reflect.NMSUtils;

public class WrappedNetworkManager extends WrappedObject<WrappedNetworkManager> {

    public static AttributeKey<Object> getEnumProtocolKey() {
        ReflectStructure<Object, ?> structure = ReflectStructureCache.acquireStructure(NMSUtils.getNetworkManagerClass());
        ReflectStructure<AttributeKey<Object>, AttributeKey<Object>> specificStructure
                = structure.withWeakType(AttributeKey.class);
        IStructureModifier<AttributeKey<Object>> modifier = specificStructure.withTarget(null);
        return modifier.readField(0);
    }

    public WrappedNetworkManager(Object handle) {
        super(handle);
    }
}
