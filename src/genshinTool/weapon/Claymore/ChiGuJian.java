package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class ChiGuJian extends Weapon
{
	public ChiGuJian(int lv){
		super.name = "螭骨剑";
		super.ATK_BASE = 510;
		super.RATE = 0.276;
		super.ATK_DMG = (0.06 + (lv-1)*0.01) * 5;
		super.lv = lv;
	}
}
