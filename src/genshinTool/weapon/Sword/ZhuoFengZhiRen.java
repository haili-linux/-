package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class ZhuoFengZhiRen extends Weapon
{
	public ZhuoFengZhiRen(int lv){
		super.name = "斫峰之刃";
		super.ATK_BASE = 608;
		super.ATK_100 = 0.496 + (0.04 + (lv-1) * 0.01) * 5 * 2;
		super.lv = lv;
	}
}
