package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class FengYingJian extends Weapon
{
	public FengYingJian(int lv){
		super.name = "风鹰剑";
		super.ATK_BASE = 674;
		super.ATK_100 = 0.2 + (lv-1) * 0.05;
		super.ATK_DMG = 0.413;
		super.lv = lv;
	}
}
