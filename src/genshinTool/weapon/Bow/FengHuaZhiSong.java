package genshinTool.weapon.Bow;
import genshinTool.weapon.Weapon;
public class FengHuaZhiSong extends Weapon
{
	public FengHuaZhiSong(int lv){
		super.name = "风花之颂";
		super.ATK_BASE = 510;
		super.ELEMENT_MASTER = 165;
		super.ATK_100 = 0.16 + (lv-1)*0.04;
		super.lv = lv;
	}
}
