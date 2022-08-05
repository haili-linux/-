package genshinTool.weapon.Catalyst;
import genshinTool.weapon.Weapon;
public class SiFengYuanDian extends Weapon
{
	public SiFengYuanDian(int lv){
		super.name = "四风原典";
		super.ATK_BASE = 608;
		super.RATE = 0.331;
		super.ATK_DMG = (0.08 + (lv-1)*0.02) * 4;
		super.lv = lv;
	}
}
