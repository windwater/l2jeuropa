package lineage2.gameserver.network.serverpackets;

import lineage2.gameserver.model.entity.events.impl.DuelEvent;

public class ExDuelEnd extends L2GameServerPacket
{
	private int _duelType;

	public ExDuelEnd(DuelEvent e)
	{
		_duelType = e.getDuelType();
	}

	@Override
	protected final void writeImpl()
	{
		writeEx(0x50);
		writeD(_duelType);
	}
}