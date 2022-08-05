package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class SongLai extends Weapon
{
	public SongLai(int lv){
		super.name = "松籁响起之时";
		super.ATK_BASE = 741;
		super.ATK_100 = 0.36 +  (lv-1) * 0.09;
		super.ATK_DMG = 0.207;
		super.lv=lv;
	}
}
