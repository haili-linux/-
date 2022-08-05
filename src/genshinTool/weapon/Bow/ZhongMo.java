package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class ZhongMo extends Weapon
{
	public ZhongMo(int lv){
		super.name = "终末磋叹之诗";
		super.ATK_BASE = 608;
		super.ELEMENT_MASTER = 160 + (lv-1)*40;
		super.ATK_100 = 0.2 + (lv-1)*0.05;
		super.lv = lv;
	}
}
