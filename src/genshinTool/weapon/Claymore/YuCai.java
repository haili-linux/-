package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class YuCai extends Weapon
{
	public YuCai(int lv){
		super.name = "雨裁";
		super.ATK_BASE = 510;
		super.ELEMENT_MASTER = 165;
		super.ATK_DMG = 0.2 + (lv-1)*0.04;
		super.lv = lv;
	}
}
