package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class AnXiangLieShou extends Weapon
{
	public AnXiangLieShou(int lv){
		super.name = "暗巷猎手";
		super.ATK_BASE = 565;
		super.ATK_100 = 0.276;
		super.ATK_DMG = 0.2 + (lv-1)*0.05;
		super.lv = lv;
	}
}
