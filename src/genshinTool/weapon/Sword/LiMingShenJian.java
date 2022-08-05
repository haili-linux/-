package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class LiMingShenJian extends Weapon
{
	public LiMingShenJian(int lv){
		super.name = "黎明神剑";
		super.ATK_BASE = 401;
		super.RATE_DMG = 0.469;
		super.RATE = 0.14 + (lv-1)*0.035;
		super.lv = lv;
	}
}
