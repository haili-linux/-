package genshinTool.weapon.Claymore;

import genshinTool.weapon.Weapon;

public class BaiYinJian extends Weapon
{
	public BaiYinJian(int lv){
		super.name = "白影剑";
		super.ATK_BASE = 510;
		super.DEFENS_100 = 0.517 + (0.06 + (lv-1)*0.015 )*4;
		super.ATK_100 = (0.06 + (lv-1)*0.015 )*4;
		super.lv = lv;
	}
}
