/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package lineage2.gameserver.network.clientpackets;

/**
 * @author Mobius
 * @version $Revision: 1.0 $
 */
public class RequestExEventMatchObserverEnd extends L2GameClientPacket
{
	/**
	 * Field unk2. Field unk.
	 */
	@SuppressWarnings("unused")
	private int unk, unk2;
	
	/**
	 * Method readImpl.
	 */
	@Override
	protected void readImpl()
	{
		unk = readD();
		unk2 = readD();
	}
	
	/**
	 * Method runImpl.
	 */
	@Override
	protected void runImpl()
	{
	}
}
