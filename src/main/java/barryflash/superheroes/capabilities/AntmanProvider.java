package barryflash.superheroes.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class AntmanProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(IAntman.class)
	public static final Capability<IAntman> ANTMAN_CAP = null;
	private IAntman instance = ANTMAN_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == ANTMAN_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return capability == ANTMAN_CAP ? ANTMAN_CAP.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		// TODO Auto-generated method stub
		return ANTMAN_CAP.getStorage().writeNBT(ANTMAN_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		// TODO Auto-generated method stub
		ANTMAN_CAP.getStorage().readNBT(ANTMAN_CAP, this.instance, null, nbt);
	}

}
