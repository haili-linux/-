package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class HeiJian extends Weapon
{
	public HeiJian(int lv){
		super.name = "黑剑";
		super.ATK_BASE = 510;
		super.RATE = 0.276;
		super.ATK_DMG = 0.2 + (lv-1) * 0.05;
		super.lv = lv;
	}
}
