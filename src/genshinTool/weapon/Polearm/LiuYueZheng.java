package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class LiuYueZheng extends Weapon
{
	public LiuYueZheng(int lv){
		super.name = "流月针";
		super.ATK_BASE = 565;
		super.ATK_DMG = 0.345 + 0.2 + (lv-1) * 0.05;
		super.lv = lv;
	}
}
