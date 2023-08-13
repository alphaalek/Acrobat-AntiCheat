package me.alek.acrobat.netty.modelwrappers.nbt.lists;

import me.alek.acrobat.netty.modelwrappers.nbt.NBTAbstractList;
import me.alek.acrobat.netty.modelwrappers.nbt.NBTBase;
import me.alek.acrobat.netty.modelwrappers.nbt.NBTRoot;
import me.alek.acrobat.netty.modelwrappers.nbt.NBTType;

public class NBTListOfList extends NBTAbstractList<NBTAbstractList<?>> {

    public NBTListOfList(Object base, NBTRoot root, NBTBase<?, ?> owner) {
        super(base, NBTType.LIST, root, owner);
    }
}
