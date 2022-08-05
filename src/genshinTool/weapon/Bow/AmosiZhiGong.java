package genshinTool.weapon.Bow;

import genshinTool.weapon.Weapon;

public class AmosiZhiGong extends Weapon
{
	public AmosiZhiGong(int lv){
		super.name = "阿莫斯之弓";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496;
		super.ATK_DMG = 0.12 + (lv-1)*0.03
		           + ( 0.08 + (lv-1)*0.02 ) * 5;
		super.lv = lv;
	}
}
