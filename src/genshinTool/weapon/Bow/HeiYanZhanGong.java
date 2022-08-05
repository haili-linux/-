package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class HeiYanZhanGong extends Weapon
{
	public HeiYanZhanGong(int lv){
		super.name = "黑岩战弓";
		super.ATK_BASE = 565;
		super.RATE_DMG = 0.368;
		super.ATK_DMG = ( 0.12 + (lv-1)*0.03 ) * 3;
		super.lv = lv;
	}
}
