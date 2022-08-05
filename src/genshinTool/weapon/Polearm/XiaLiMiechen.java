package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class XiaLiMiechen extends Weapon
{
	public XiaLiMiechen(int lv){
		super.name = "匣里灭辰";
		super.ATK_BASE = 454;
		super.ELEMENT_MASTER = 221;
		super.ATK_DMG = 0.2 + (lv-1) * 0.04;
		super.lv=lv;
	}
}
