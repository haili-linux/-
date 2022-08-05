package genshinTool.character;
import genshinTool.GenshinCharacter;
public class HuTao extends GenshinCharacter
{
	//胡桃
	double HP_atk_e = 0.0626;//10级e技能攻击力系数
	public HuTao(int lv){
		if(lv > 2){          //命大于2
			HP_atk_e = 0.0715;//13级e
		}
		super.HP_BASE = 15552;
		super.ATK_BASE = 107;
		super.DMG_BASE = 0.884;
		super.RATE_BASE = 0.05;
		super.Element_DMG_BASE = 0.33;
		super.DEF_BASE = 876;
	}
	
	@Override
	public void counter_END()
	{
		// TODO: Implement this method
		//生命
		HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items)
			+ Flower_HP //花
			+ HP_f; //小生命加成
        //攻击力
		ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)
			+ Plume_ATK  //羽毛
			+ ATK_f  //小攻击
			+ HP_END * HP_atk_e;//10级E技能攻击力转化

		//伤害加成
		ATK_DMG_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items;
        //防御
		Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
				+ DEF_f;
		//元素精通
		ELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;
		//暴击率
		RATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE + Rate_items;
		DMG_END = DMG_BASE //基础爆伤
			+ DMG_W   //武器
			+ RATE_DMG_f  //圣遗物副词条
			+ Circlet_DMG; //头
		Power_Efficiency_END = Power_Efficiency_BASE + Power_Efficiency_f + Power_Efficiency_items + Power_Efficiency_W + Sands_Power_Efficiency;
	     super.counter_END();
	}
}
