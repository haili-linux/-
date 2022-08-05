package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class GangLunGong extends Weapon
{
	public GangLunGong(int lv){
		super.name = "钢轮弓";
		super.ATK_BASE = 454;
		super.ATK_DMG = 0.69;
		super.ATK_100 = ( 0.04 + (lv-1)*0.01 ) * 4;
		super.lv = lv;
	}
}
