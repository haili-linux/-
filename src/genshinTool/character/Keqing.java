package genshinTool.character;
import genshinTool.GenshinCharacter;
public class Keqing extends GenshinCharacter
{
	//刻晴


	double atk_lv4 = 0.25; //4命攻击力
	double atkPlus_lv6 = 0.24; //六命增伤
	
	
	public Keqing(int lv/*命数*/){
		if(lv < 4)
			atk_lv4 =0;
		if(lv < 6)
			atkPlus_lv6 = 0;

		super.HP_BASE = 13103;     //基础生命
		super.ATK_BASE = 323;      //基础攻击力
		super.DMG_BASE = 0.884; //基础暴击伤害
		super.RATE_BASE = 0.20;    //基础暴击率(大招后)
		super.DEF_BASE = 740;
	}
	
	@Override
	public void counter_END()
	{
		// TODO: Implement this method
		HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items )
			+ Flower_HP //花
			+ HP_f; //小生命加成

		Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
		    + DEF_f;
			
		ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items + atk_lv4)
			+ Plume_ATK  //羽毛
			+ ATK_f
			/*+ HP_END * 0.012/*绿剑*/ ;  //小攻击
		
        ELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;
		
		ATK_DMG_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items + atkPlus_lv6;
		RATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE + Rate_items;
		DMG_END = DMG_BASE //基础爆伤
			+ DMG_W   //武器
			+ RATE_DMG_f  //圣遗物副词条
			+ Circlet_DMG; //头
		Power_Efficiency_END = Power_Efficiency_BASE + Power_Efficiency_f + Power_Efficiency_items + Power_Efficiency_W + Sands_Power_Efficiency;
		super.counter_END();
	}
	
}
