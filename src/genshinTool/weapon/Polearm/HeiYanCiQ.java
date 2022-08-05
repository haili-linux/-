package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class HeiYanCiQ extends Weapon
{
	public HeiYanCiQ(int lv){
		super.name = "黑岩刺枪";
		super.ATK_BASE = 510;
		super.RATE_DMG = 0.551;
		super.ATK_100 = (0.12 + (lv-1) * 0.03) * 3;
		super.lv = lv;
	}
}
