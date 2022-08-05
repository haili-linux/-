package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class HeiYanJian extends Weapon
{
	public HeiYanJian(int lv){
		super.name = "黑岩长剑";
		super.ATK_BASE = 565;
		super.RATE_DMG = 0.368;
		super.ATK_100 = 3 * (0.12 + (lv-1)*0.03);
		super.lv = lv;
	}
}
