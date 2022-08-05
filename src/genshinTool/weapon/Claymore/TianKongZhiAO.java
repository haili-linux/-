package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class TianKongZhiAO extends Weapon
{
	public TianKongZhiAO(int lv){
		super.name = "天空之傲";
		super.ATK_BASE = 674;
		super.Power_Efficiency = 0.368;
		super.ATK_DMG = 0.08 + (lv-1)*0.02;
		super.lv = lv;
	}
}
