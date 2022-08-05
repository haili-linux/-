package genshinTool.character;

import genshinTool.GenshinCharacter;
//霄宫
public class Yoimiya extends GenshinCharacter {
    double ATK_100_BASE_ = 0.1;
    double Hit_DMG_E = 1.617; //10级E
    public Yoimiya(int lv){
        super.HP_BASE = 10164;
        super.DEF_BASE = 615;
        super.ATK_BASE = 323;
        super.RATE_BASE = 0.242;
        super.DMG_BASE = 0.5;
        super.Element_DMG_BASE = 0.2;
        if(lv==1){
            ATK_100_BASE_ = 0.1 + 0.2;
        }
        else if (lv==2){
            ATK_100_BASE_ = 0.1 + 0.2;
            Element_DMG_BASE = 0.2 + 0.25;
        }
        else if (lv>=3){
            ATK_100_BASE_ = 0.1 + 0.2;
            Element_DMG_BASE = 0.2 + 0.25;
            Hit_DMG_E = 1.706; //13级E
        }
    }

    @Override
    public void counter_END()
    {
        // TODO: Implement this method
        HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items
                /* +0.2/*绿剑*/
        )
                + Flower_HP //花
                + HP_f; //小生命加成

        Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
                + DEF_f;

        ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_100_BASE_ + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)
                + Plume_ATK  //羽毛
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
    public double[] getAttrack() {
        this.counter_END();
        if(RATE_END>RATE_END_MAX) RATE_END=RATE_END_MAX;
        //不暴击最终伤害
        double R = Hit_DMG //倍率
                * ATK_END   //攻击力
                * (1 + ATK_DMG_END) //元素伤害加成
                * Hit_DMG_E;
        if(Element_ACT_DMG_BASE >0)
            R = R
                    * Element_ACT_DMG_BASE  //反应系数
                    * ( 1
                    + ELEMENT_ACT_DMG_items
                    + 2.78*ELEMENT_MASTER_END/(ELEMENT_MASTER_END+1400)
            );//反应加伤

        //期望最终伤害
        double RE = R * ( 1 + RATE_END * DMG_END) ;//暴击期望

        //暴击最终伤害
        double RM = R * ( 1 + DMG_END) ;

        double[] RL={RE,R,RM};//打包返回
        return RL;
    }

    @Override
    public double GET_ATK_EDN_EXCEPT() {
        this.counter_END();
        if(RATE_END>RATE_END_MAX) RATE_END=RATE_END_MAX;
        double R = Hit_DMG //倍率
                * ATK_END   //攻击力
                * (1 + ATK_DMG_END) //元素伤害加
                * Hit_DMG_E;
        if(Element_ACT_DMG_BASE >0)
            R = R
                    * Element_ACT_DMG_BASE  //反应系数
                    * ( 1
                        + ELEMENT_ACT_DMG_items
                         + 2.78*ELEMENT_MASTER_END/(ELEMENT_MASTER_END+1400)
                      ); //反应加伤

        return  R * (1 + RATE_END * DMG_END);
        //y=278*x/(x+1400)（单位%）精通对加成反应加成公式
    }
}
