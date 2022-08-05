package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class TianKongZhiRen extends Weapon
{
	public TianKongZhiRen(int lv){
		super.name = "天空之刃";
		super.ATK_BASE = 608;
		super.Power_Efficiency = 0.551;
		super.RATE = 0.04 + (lv-1) * 0.01;
		super.lv = lv;
	}
}
