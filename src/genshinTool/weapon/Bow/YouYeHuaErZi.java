package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class YouYeHuaErZi extends Weapon
{
	public YouYeHuaErZi(int lv){
		super.name = "幽夜华尔兹";
		super.ATK_BASE = 510;
		super.ATK_DMG = 0.517 + 0.2 + (lv-1)*0.05;
		super.lv = lv;
	}
}
