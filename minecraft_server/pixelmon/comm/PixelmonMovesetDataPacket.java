package pixelmon.comm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet;
import pixelmon.attacks.Moveset;
import pixelmon.attacks.Type;

public class PixelmonMovesetDataPacket {
	public String attackName;
	public Type type;
	public int pp;
	public int ppBase;

	public static PixelmonMovesetDataPacket createPacket(Moveset moveset, int i) {
		if (moveset.size() <= i)
			return null;
		PixelmonMovesetDataPacket p = new PixelmonMovesetDataPacket();
		p.attackName = moveset.get(i).attackName;
		p.pp = moveset.get(i).pp;
		p.ppBase = moveset.get(i).ppBase;
		p.type = moveset.get(i).attackType;
		return p;
	}

	public static PixelmonMovesetDataPacket createPacket(NBTTagCompound nbt, int i) {
		if (nbt.getInteger("PixelmonNumberMoves") <= i)
			return null;
		PixelmonMovesetDataPacket p = new PixelmonMovesetDataPacket();
		p.attackName = nbt.getString("PixelmonMoveName" + i);
		p.type = Type.parseType(nbt.getInteger("PixelmonMoveType" + i));
		p.pp = nbt.getInteger("PixelmonMovePP" + i);
		p.ppBase = nbt.getInteger("PixelmonMovePPBase" + i);
		return p;
	}

	public void writeData(DataOutputStream data) throws IOException {
		Packet.writeString(attackName, data);
		data.writeShort(type.getIndex());
		data.writeShort(pp);
		data.writeShort(ppBase);
	}
	
	public void readData(DataInputStream data) throws IOException {
		attackName = Packet.readString(data, 64);
		type = Type.parseType(data.readShort());
		pp = data.readShort();
		ppBase = data.readShort();
	}

}
