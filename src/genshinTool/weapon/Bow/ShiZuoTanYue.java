package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class ShiZuoTanYue extends Weapon
{
	public ShiZuoTanYue(int lv){
		super.name = "试作澹月";
		super.ATK_BASE = 510;
		super.ATK_100 = 0.413 + 0.36 + (lv-1)*0.09;
		super.lv = lv;
	}
}
