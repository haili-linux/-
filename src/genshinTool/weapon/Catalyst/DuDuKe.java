package genshinTool.weapon.Catalyst;
import genshinTool.weapon.Weapon;
public class DuDuKe extends Weapon
{
	public DuDuKe(int lv){
		super.name = "嘟嘟可故事集";
		super.ATK_BASE = 454;
		super.ATK_100 = 0.551 + 0.04 + (lv-1)*0.01;
		super.ATK_DMG = 0.08 + (lv-1)*0.02;
		super.lv = lv;
	}
}
