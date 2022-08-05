package genshinTool.weapon.Polearm;
import genshinTool.weapon.Weapon;
public class QianYanChangQ extends Weapon
{
	public QianYanChangQ(int lv){
		super.name = "千岩长枪";
		super.ATK_BASE = 565;
		super.ATK_100 = 0.276 + (0.07 + (lv-1) * 0.01) * 4;
		super.RATE = (0.03 + (lv-1) * 0.01) * 4;
		super.lv = lv;
		
	}
}
