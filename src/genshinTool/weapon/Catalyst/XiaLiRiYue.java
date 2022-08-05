package genshinTool.weapon.Catalyst;
import genshinTool.weapon.Weapon;
public class XiaLiRiYue extends Weapon 
{
	public XiaLiRiYue(int lv){
		super.name = "匣里日月";
		super.ATK_BASE = 510;
		super.RATE = 0.276;
		super.ATK_DMG = 0.2 +(lv-1)*0.05;
		super.lv = lv;
		
	}
}
