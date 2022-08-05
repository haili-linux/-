package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class XiaLiLongYin extends Weapon
{
	public XiaLiLongYin(int lv){
		super.name = "匣里龙吟";
		super.ATK_BASE = 510;
		super.ATK_100 = 0.413;
		super.ATK_DMG = 0.2 + (lv-1) * 0.04;
		super.lv = lv;
	}
}
