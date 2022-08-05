package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class HuMo extends Weapon
{
	public HuMo(int lv){
		super.name = "护魔之杖";
		super.ATK_BASE = 608;
		super.RATE_DMG = 0.662;
		super.HP_100 = 0.2 +(lv-1)*0.05;
		super.HP_to_ATK = 0.018 + (lv-1)*0.004;
		super.lv=lv;
	}
}


