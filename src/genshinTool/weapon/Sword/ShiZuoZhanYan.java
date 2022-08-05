package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class ShiZuoZhanYan extends Weapon
{
	public ShiZuoZhanYan(int lv){
		super.name = "试作斩岩";
		super.ATK_BASE = 565;
		super.ATK_100 = (0.04 + (lv-1) * 0.01) * 4;
		super.ATK_DMG = 0.345;
		super.lv = lv;
	}
}
