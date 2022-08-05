package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class HePuYuan extends Weapon
{
	public HePuYuan(int lv){
		super.name = "和璞鸢";
		super.ATK_BASE = 674;
		super.RATE = 0.221;
		super.ATK_DMG = 0.12 + (lv-1) * 0.03;
		super.ATK_100 = (0.032 + (lv-1) * 0.007) * 7;
		super.lv=lv;
	}
}
