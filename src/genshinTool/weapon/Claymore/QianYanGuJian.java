package genshinTool.weapon.Claymore;
import genshinTool.weapon.Weapon;
public class QianYanGuJian extends Weapon
{
	public QianYanGuJian(int lv){
		super.name = "千岩古剑";
		super.ATK_BASE = 510;
		super.ATK_100 = 0.413 + ( 0.07 + (lv-1)*0.01) * 4;
		super.RATE = (0.03 + (lv-1)*0.01) * 4;
		super.lv = lv;
	}
}
