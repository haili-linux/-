package genshinTool.weapon.Catalyst;

import genshinTool.weapon.Weapon;

public class ChenSiZhiSuo extends Weapon
{
	public ChenSiZhiSuo(int lv){
		super.name = "尘世之锁";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496 + (0.04 + (lv-1) * 0.001) * 5 * 2;
		super.lv = lv;
	}
}
