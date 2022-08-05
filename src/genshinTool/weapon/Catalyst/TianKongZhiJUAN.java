package genshinTool.weapon.Catalyst;
import genshinTool.weapon.Weapon;
public class TianKongZhiJUAN extends Weapon
{
	public TianKongZhiJUAN(int lv){
		super.name = "天空之卷";
		super.ATK_BASE = 674;
		super.ATK_100 = 0.331;
		super.ATK_DMG = 0.12 + (lv-1)*0.03;
		super.lv = lv;
	}
}
