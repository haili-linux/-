package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class TianKongZhiJi extends Weapon
{
	public TianKongZhiJi(int lv){
		super.name = "天空之脊";
		super.ATK_BASE = 674;
		super.Power_Efficiency = 0.368;
		super.RATE = 0.08 + (lv-1) * 0.02;
		super.lv=lv;
	}
}
