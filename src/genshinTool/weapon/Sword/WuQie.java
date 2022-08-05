package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class WuQie extends Weapon
{
	public WuQie(int lv){
		super.name = "雾切之回光";
		super.ATK_BASE = 674;
		super.RATE_DMG = 0.441;
		super.ATK_DMG = 0.12 + (lv-1)*0.03 + 0.28 + (lv-1)*0.07;
		super.lv = lv;
	}
}
