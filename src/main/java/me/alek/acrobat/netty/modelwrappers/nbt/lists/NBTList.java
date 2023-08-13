package me.alek.acrobat.netty.modelwrappers.nbt.lists;

import me.alek.acrobat.netty.modelwrappers.nbt.*;

public class NBTList<T> extends NBTAbstractList<NBTElement<T>> {

    public NBTList(Object base, NBTType typeOf, NBTRoot root, NBTBase<?, ?> owner) {
        super(base, typeOf, root, owner);
    }

}