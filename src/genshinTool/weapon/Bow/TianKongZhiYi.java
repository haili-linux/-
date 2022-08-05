package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class TianKongZhiYi extends Weapon
{
	public TianKongZhiYi(int lv){
		super.name = "天空之翼";
		super.ATK_BASE = 674;
		super.RATE = 0.221;
		super.RATE_DMG = 0.2 + (lv-1)*0.05;
		super.lv = lv;
	}
}
