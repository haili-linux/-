package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class GongZang extends Weapon
{
	public GongZang(int lv){
		super.name = "弓藏";
		super.ATK_BASE = 510;
		super.ATK_100 = 0.413;
		super.ATK_DMG = 0.4 + (lv-1)*0.1;
		super.lv = lv;
	}
}
