package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class LangDeMoLu extends Weapon
{
	public LangDeMoLu(int lv){
		super.name = "狼的末路";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496 + 0.6 + (lv-1)*0.15;
		super.lv = lv;
	}
}
