package genshinTool.weapon.Sword;

import genshinTool.weapon.Weapon;

public class AnXiangShanGuang extends Weapon
{
	public AnXiangShanGuang(int lv){
		super.name = "暗巷闪光";
		super.ATK_BASE = 620;
		super.ELEMENT_MASTER = 55;
		super.ATK_DMG = 0.12 + (lv-1) * 0.03;
		super.lv = lv;
	}
}
