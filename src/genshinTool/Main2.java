package genshinTool;

import genshinTool.character.YeLan;

public class Main2
{
	public static void main(String[] args)
	{
		YeLan yeLan = new YeLan(0);
		yeLan.setHP_DMG(0.0877);            //10级大招倍率

		yeLan.setWeapon(Weapon_Library.Bow.rouShui(1));//武器，精1

		yeLan.setFlower_HP(4780);       //花
		yeLan.setPlume_ATK(311);        //羽毛
		yeLan.setSands_HP_100(0.466 + 0.06);   //生命沙

		yeLan.setGoblet_Element_p(0.466);//伤害杯
		yeLan.setCirclet_DMG(0.622);   //暴击头ATK
		//yeLan.setCirclet_RATE(0.311);

		//yeLan.setAtfitems(SYWitems.JueYuanQiYin(4));//冰4
		yeLan.setAtfitems(SYWitems.QianYantao(2));
		yeLan.setAtfitems(SYWitems.ZongShitao(2));

        Tool.printfall(yeLan,45); //打印结果


		/*
		yeLan.ATK_W = 347;
		yeLan.setPower_Efficiency_W(0.505);


		yeLan.setDEF_f100( 0.073 );
		yeLan.setDEF_f(19);
		yeLan.setHP_f100(0.058 + 0.047 + 0.053 + 0.146 + 0.0592);
		yeLan.setHP_f(1046);
		yeLan.setATK_f100(0.099);
		yeLan.setATK_f(0);
		yeLan.setRATE_f(0.039 + 0.113 + 0.14 + 0.039 );
		yeLan.setRATE_DMG_f(0.062 + 0.109 + 0.225 + 0.194);
		yeLan.setElement_Master_f(21);
		yeLan.setPower_Efficiency_f(0.292 + 0.168 + 0.058);

		double []r0 = yeLan.getAttrack();
		System.out.println(yeLan);

		double k = HitObj.getD(90,85);

		System.out.println("期望: "+r0[0] * k);
		System.out.println("不暴击:"+r0[1] * k);
		System.out.println("暴击:"+r0[2] * k);
		 */


	}
}
