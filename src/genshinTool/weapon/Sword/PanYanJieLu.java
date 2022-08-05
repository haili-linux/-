package genshinTool.weapon.Sword;
import genshinTool.weapon.Weapon;
public class PanYanJieLu extends Weapon
{
	public PanYanJieLu(int lv){
		super.name = "磐岩结绿";
		super.ATK_BASE = 542;
		super.RATE = 0.441;
		super.HP_100 = 0.2 + (lv-1) * 0.05;
		super.HP_to_ATK = 0.012 + (lv-1) * 0.003;
		super.lv = lv;
	}
}
