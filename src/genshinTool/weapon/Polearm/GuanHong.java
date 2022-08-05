package genshinTool.weapon.Polearm;

import genshinTool.weapon.Weapon;

public class GuanHong extends Weapon
{
	public GuanHong(int lv){
		super.name = "贯虹之槊";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496 + (0.04 + (lv-1) * 0.01) * 5 * 2;
		super.lv=lv;
	}
}
