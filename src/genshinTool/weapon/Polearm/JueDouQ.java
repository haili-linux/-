package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class JueDouQ extends Weapon
{
	
	public JueDouQ(int lv){
		super.name = "角斗之枪";
		super.ATK_BASE = 454;
		super.RATE = 0.368;
		super.ATK_100 = 0.24 + (lv-1)*0.06;
		super.lv=lv;
	}
}
