package genshinTool.character;

import genshinTool.GenshinCharacter;


public class Kokomi extends GenshinCharacter
{

	public Kokomi(int lv){
		super.HP_BASE = 13471;
		super.ATK_BASE = 234;
		super.DEF_BASE = 657;
		super.RATE_BASE = -0.95;
		super.DMG_BASE = 0.5;
		super.Healing_Bonus_BASE = 0.25;
		super.Element_DMG_BASE = 0.288;
	}

	@Override
	public void counter_END()
	{
		// TODO: Implement this method
		HP_END = HP_BASE * ( 1 + 0.24 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items)
			+ Flower_HP //花
			+ HP_f; //小生命加成

		Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
		    + DEF_f;

		ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)
			+ Plume_ATK  //羽毛
			+ ATK_f
			/*+ HP_END * 0.012/*绿剑*/ ;  //小攻击

		ELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;

		ATK_DMG_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items;

		RATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE + Rate_items;

		DMG_END = DMG_BASE //基础爆伤
			+ DMG_W   //武器
			+ RATE_DMG_f  //圣遗物副词条
			+ Circlet_DMG; //头

		Power_Efficiency_END = Power_Efficiency_BASE + Power_Efficiency_f + Power_Efficiency_items + Power_Efficiency_W + Sands_Power_Efficiency;

		Healing_Bonus_END = Circlet_Healing_Bonus + Healing_Bonus_BASE + Healing_Bonus_items;
		super.counter_END();
	}

	@Override
	public double GET_ATK_EDN_EXCEPT()
	{
		// TODO: Implement this method
		//return super.GET_ATK_EDN_EXCEPT() + HP_END*0.0871;
		counter_END();
		if(RATE_END>RATE_END_MAX) RATE_END=RATE_END_MAX;
	    if(RATE_END<0) RATE_END=0;
		
		double R = Hit_DMG * ATK_END  //攻击力
		         + HP_END * 0.087 * (1 + Healing_Bonus_END*0.15);
			R = R * (1 + ATK_DMG_END); //元素伤害加

		if(Element_ACT_DMG_BASE >0)
			R = R 
				* Element_ACT_DMG_BASE  //反应系数
				* ( 1 
				+ ELEMENT_ACT_DMG_items
				+ 2.78*ELEMENT_MASTER_END/(ELEMENT_MASTER_END+1400)
				);//反应加伤

		return  R * (1 + RATE_END * DMG_END) ;
	}


	@Override
	public double[] getAttrack()
	{
		// TODO: Implement this method
		double r[] = {GET_ATK_EDN_EXCEPT(),0,0};
		return r;
	}
	

}
