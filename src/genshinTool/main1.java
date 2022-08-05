package genshinTool;

import genshinTool.ArtifactsITEMs.Items.Crimson_Witch_Of_Flames;
import genshinTool.ArtifactsITEMs.Items.Wanderer_is_Troupe;
import genshinTool.character.*;

import java.util.Arrays;

public class main1 {
  /*  public static void main(String[] args) {

    }
  /* public static void main(String[] args) {
        HuTao hutao = new HuTao(0);
        hutao.setWeapon(Weapon_Library.Polearm.humo(1));//设置武器，这里是精1护魔

        //hutao.setElement_ACT_DMG_BASE(1.5);//元素反应系数，这里1.5是蒸发
        //hutao.setElement_ACT_Efficiency(0.897);
        hutao.setHit_DMG(1.09);//设置攻击倍率，这里是10级普攻重击倍率
        //hutao.setRATE_END_MAX(0.85);//设置暴击率上限，的设置为0.05

        //设置圣遗物主属性
        hutao.setFlower_HP(4780);//花
        hutao.setPlume_ATK(311);	   //羽
        //hutao.setSands_Power_Efficiency(0.518);
        hutao.setSands_ATK_100(0.466);//攻击沙
        //hutao.setSands_HP_100(0.466);//生命沙
        //hutao.setSands_Elment_master(187);//精通沙
        hutao.setCirclet_RATE(0.311); //暴击头
        //hutao.setCirclet_DMG(0.622);//爆伤头
        //hutao.setCirclet_ATK_100(0.466);//攻击头
        //hutao.setCirclet_Elment_master(187);//精通头
        hutao.setGoblet_Element_p(0.466);//元素杯
        //hutao.setGoblet_ATK_100(0.466);
        //hutao.setGoblet_ATK_100(0.466);
        hutao.setElement_p_items(-0.15);
        hutao.setAtfitems(SYWitems.Bingtao(4));//魔女4
        //hutao.setAtfitems(SYWitems.Monvtao(4));//魔女4
        //hutao.setElement_p_items(0.15+0.075);//设置圣遗物套装效果伤害增加
        //hutao.setELEMENT_ACT_DMG_items(0.15);//设置魔女4反应系数加成
        //hutao.setElement_master_items(280);//设置圣遗物套装效果加80精通
        //hutao.setRate_items(0.15);//设置圣遗物套装效果暴击率加成
        //hutao.setHP_100_items(0.2);//设置圣遗物套装效果百分比生命加成

        out.printfall(hutao,45);
       /*
        //寻找最优圣遗物副词条搭配,参数为是否打印细节，这里false是不打印,词条数量是45
        double a[]=hutao.findMax(true,45);

        hutao.printFindMax(a);//打印最优圣遗物副词条搭配信息

        System.out.println("");
        //计算角色伤害
        double[] r = hutao.getAttrack();
        double d =  HitObj.getD(90,90,0.1);//90级遗迹守卫元素抗性减伤系数
        System.out.println("期望伤害:  " + r[0] * d );
        System.out.println("不暴击:   "+ r[1] * d );
        System.out.println("暴击:    "+r[2] * d );

        System.out.println("\n面板");
        System.out.println(hutao.toString()+"\n");//打印角色属性

        //打印武器属性
        System.out.println(hutao.weapon+"\n");

        //圣遗物套装
        if(!hutao.atfitems[0].name.equals("")) System.out.println(hutao.atfitems[0].toString());
        if(!hutao.atfitems[1].name.equals("")) System.out.println(hutao.atfitems[1].toString());

        //打印圣遗物最优解属性
        hutao.flower.printf();//打印花
        hutao.plume.printf();//羽
        hutao.sands.printf();//沙
        hutao.goblet.printf();//杯
        hutao.circlet.printf();//头

        //参考信息
      /* System.out.println(hutao.Help_use());
        System.out.println(hutao.Help_addCaracter());
        System.out.println(hutao.Help_variable()); */
   // }/* */
}
