package genshinTool.character;

import genshinTool.GenshinCharacter;

public class Ayaka extends GenshinCharacter
{
	//神里凌华
	public Ayaka(int lv){
		super.HP_BASE = 12858;     //基础生命
		super.ATK_BASE = 342;      //基础攻击力
		super.DMG_BASE = 0.884;   //基础暴击伤害
		super.RATE_BASE = 0.05;   //基础暴击率
		super.DEF_BASE = 784;     //防御
		super.Element_DMG_BASE = 0.18 + 0.3;//%18冰伤，e技能30%增伤
		System.out.println("此伤害计算为重击伤害.");
	}
	
	@Override
	public void counter_END()
	{
		// TODO: Implement this method
		HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items )
			+ Flower_HP
			+ HP_f;

		Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
		    + DEF_f;

		ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)
			+ Plume_ATK
			+ ATK_f;


		ELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;
		
		ATK_DMG_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items;

		RATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE + Rate_items;
		
		DMG_END = DMG_BASE //基础爆伤
			+ DMG_W   //武器
			+ RATE_DMG_f  //圣遗物副词条
			+ Circlet_DMG; //头

		Power_Efficiency_END = Power_Efficiency_BASE + Power_Efficiency_f + Power_Efficiency_items + Power_Efficiency_W + Sands_Power_Efficiency;

		super.counter_END();
	}

}
