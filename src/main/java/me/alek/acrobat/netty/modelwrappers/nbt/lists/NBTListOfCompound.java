package me.alek.acrobat.netty.modelwrappers.nbt.lists;

import me.alek.acrobat.netty.modelwrappers.nbt.*;

public class NBTListOfCompound extends NBTAbstractList<NBTCompound> {

    public NBTListOfCompound(Object base, NBTRoot root, NBTBase<?, ?> owner) {
        super(base, NBTType.COMPOUND, root, owner);
    }
}
