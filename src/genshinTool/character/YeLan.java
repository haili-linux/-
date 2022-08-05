package genshinTool.character;

import genshinTool.GenshinCharacter;

public class YeLan extends GenshinCharacter {

    double HP_DMG = 0.0877; //生命伤害转系数
    double HP_100_Base = 0;

    public YeLan(int lv){
        super.ATK_BASE = 244;
        super.HP_BASE = 14450;
        super.DEF_BASE = 548;
        super.RATE_BASE = 0.242;
        super.DMG_BASE = 0.5;

        if( lv > 2 ){
            HP_DMG = 0.1035;

            if( lv > 3 ) HP_100_Base = 0.4;
        }

    }

    public void setHP_DMG(double dmg){
        HP_DMG = dmg;
    }

    @Override
    public void counter_END()
    {
        // TODO: Implement this method
        HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items + HP_100_Base)
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

    @Override
    public double GET_ATK_EDN_EXCEPT()
    {
        // TODO: Implement this method
        //return super.GET_ATK_EDN_EXCEPT() + HP_END*0.0871;
        counter_END();
        if( RATE_END > RATE_END_MAX ) RATE_END = RATE_END_MAX;
        if( RATE_END < 0 ) RATE_END = 0;

        double R = HP_DMG * HP_END;

        R = R * (1 + ATK_DMG_END); //元素伤害加

        if(Element_ACT_DMG_BASE >0)
            R = R
                    * Element_ACT_DMG_BASE  //反应系数
                    * ( 1
                    + ELEMENT_ACT_DMG_items
                    + 2.78*ELEMENT_MASTER_END/(ELEMENT_MASTER_END+1400)
            );//反应加伤

        return  R * (1 + RATE_END * DMG_END) ; //双爆
    }


    @Override
    public double[] getAttrackByEnd() {
        if (RATE_END > RATE_END_MAX) RATE_END = RATE_END_MAX;
        if (RATE_END < 0 ) RATE_END = 0;

        double RN; //不暴击
        double RE; //期望
        double RM; //暴击

        double R = HP_DMG * HP_END;

        R = R * (1 + ATK_DMG_END); //伤害加成区间


        if (Element_ACT_DMG_BASE > 0) {
            RN = R * Element_ACT_DMG_BASE * (1 + ELEMENT_ACT_DMG_items + 2.78 * ELEMENT_MASTER_END / (ELEMENT_MASTER_END + 1400));//反应加伤
            RM = RN * (1 + DMG_END);
            R = R * (1 + RATE_END * DMG_END );
            RE = R * (1.0 - Element_ACT_Efficiency) +
                    Element_ACT_Efficiency * R * Element_ACT_DMG_BASE * (1 + ELEMENT_ACT_DMG_items + 2.78 * ELEMENT_MASTER_END / (ELEMENT_MASTER_END + 1400));//反应加伤

        } else {
            RE = R * (1 + RATE_END * DMG_END );
            RN = R ;
            RM = R * ( 1 + DMG_END);
        }

        double[] RL = {RE, RN, RM};//打包返回
        return RL;
    }


}
