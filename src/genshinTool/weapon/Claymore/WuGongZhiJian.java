package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class WuGongZhiJian extends Weapon
{
	public WuGongZhiJian(int lv){
		super.name = "无工之剑";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496 + (0.04 + (lv-1) * 0.01) * 5 * 2;
		super.lv=lv;
	}
}
