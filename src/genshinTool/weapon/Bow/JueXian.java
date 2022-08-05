package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class JueXian extends Weapon
{
	public JueXian(int lv){
		super.name = "绝弦";
		super.ATK_BASE = 510;
		super.ELEMENT_MASTER = 165;
		super.ATK_DMG = 0.24 + (lv-1)*0.06;
		super.lv = lv;
	}
}
