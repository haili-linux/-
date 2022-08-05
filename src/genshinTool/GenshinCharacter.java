package genshinTool;

import genshinTool.ArtifactsITEMs.Atfitems;
import genshinTool.weapon.Weapon;

public class GenshinCharacter {

    public int HP_BASE = 0;           //基础生命
    public int ATK_BASE = 0;          //基础攻击力
    public int ELEMENT_MASTER_BASE = 0;//基础元素精通
    public int DEF_BASE = 0;//基础防御
    public double DMG_BASE = 0;//基础暴击伤害
    public double RATE_BASE = 0; //基础暴击率
    public double Element_DMG_BASE = 0;//基础元素/物理伤害加成
    public double Power_Efficiency_BASE = 1; //基础元素充能
    public double Healing_Bonus_BASE = 0; //基础治疗加成

    public double Element_ACT_DMG_BASE = 0;//元素反应倍率，如融化就设置为2
    public double Element_ACT_Efficiency = 1;//元素反应覆盖率
    public double RATE_END_MAX = 1.0;//暴击率最大值，考虑到深渊buff等暴击率加成时可修改
    public double Hit_DMG = 1.0;//默认攻击倍率

    public double HP_W100 = 0;   //武器的百分比生命加成
    public int ATK_W = 0;        //武器基础攻击力
    public double ATK_W100 = 0;  //武器百分比攻击
    public double DMG_W = 0;  //武器爆伤
    public double RATE_W = 0;    //武器暴击率
    public double ELEMENT_P_W = 0; //武器元素/物理伤害加成
    public double DEF_100_W = 0;//武器百分比防御
    public double ELEMENT_MASTER_W = 0;//武器元素精通
    public double Power_Efficiency_W = 0;//武器元素充能效率

    //武器
    public Weapon weapon = null;
    //圣遗物
    public Artifacts flower = new Artifacts();//花
    public Artifacts plume = new Artifacts();//羽
    public Artifacts sands = new Artifacts();//沙
    public Artifacts goblet = new Artifacts();//杯
    public Artifacts circlet = new Artifacts();//头
    public Atfitems atfitems[] = {new Atfitems(), new Atfitems()};//套装效果

    //主词条
    public int Flower_HP = 0; //圣遗物花主属性的生命值
    public int Plume_ATK = 0;      //圣遗物羽主属性的攻击力
    public double Sands_ATK_100 = 0;  //沙漏主属性百分比攻击
    public double Sands_DEF_100 = 0;//沙漏主属性百分比防御
    public double Sands_HP_100 = 0;  //沙漏主属性百分比生命
    public double Sands_Elment_master = 0;//沙漏元素精通
    public double Sands_Power_Efficiency = 0;//充能沙
    public double Goblet_ATK_100 = 0; //杯子主百分比攻击
    public double Goblet_DEF_100 = 0;//杯子主百分比防御
    public double Goblet_HP_100 = 0;   //杯子主百分比生命;
    public double Goblet_Elment_master = 0;//杯子元素精通
    public double Goblet_Element_p = 0;//杯子元素/物理伤害加成
    public double Circlet_RATE = 0;  //头主属性暴击率
    public double Circlet_DMG = 0;//头主属性爆伤
    public double Circlet_ATK_100 = 0;//攻击头
    public double Circlet_DEF_100 = 0; //防御头
    public double Circlet_HP_100 = 0;  //生命头
    public double Circlet_Elment_master = 0;//精通头
    public double Circlet_Healing_Bonus = 0; //治疗头
    //副词条
    public double ATK_f = 0;        //圣遗物小攻击加成
    public double ATK_f100 = 0;  //圣遗物的百分比攻击力加成
    public double HP_f = 0;         //圣遗物小生命;
    public double HP_f100 = 0;   //圣遗物百分比生命
    public double RATE_f = 0;      //圣遗物暴击率
    public double RATE_DMG_f = 0;    //圣遗物爆伤加成
    public double DEF_f100 = 0;//圣遗物百分比防御
    public double DEF_f = 0;    //圣遗物小防御
    public double Element_Master_f = 0;//元素精通
    public double Power_Efficiency_f = 0;//元素充能效率

    //圣遗物套装效果
    public double ATKDMG_items = 0;   //额外伤害增加
    public double ATK_100_items = 0;//百分比攻击
    public double HP_100_items = 0;//百分比生命
    public double Defense_100_items = 0;//百分比防御
    public double Element_p_items = 0;//元素/物理,伤害增加
    public double Element_master_items = 0;//元素精通
    public double Rate_items = 0;//暴击率
    public double ELEMENT_ACT_DMG_items = 0;//元素反应伤害加成，如魔女4效果
    public double Power_Efficiency_items = 0;//套装元素充能效率
    public double Healing_Bonus_items = 0; //治疗加成

    public double HP_END = 0;      //最终生命值
    public double Defense_END = 0; //最终防御力
    public double ATK_END = 0;     //最终攻击力，战斗状态
    public double ATK_DMG_END = 0; //最终伤害增加
    public double RATE_END = 0;    //最终暴击率
    public double DMG_END = 0;   //最终爆伤
    public double ELEMENT_MASTER_END = 0;//最终元素精通
    public double Power_Efficiency_END = 0;//最终元素充能效率
    public double Healing_Bonus_END = 0;// 治疗


    public void counter_END() {
        /*在这添加角色面板数值计算逻辑*/
        if (weapon != null && weapon.HP_to_ATK > 0)
               ATK_END += HP_END * weapon.HP_to_ATK;

        if(weapon != null && weapon.PE_to_ATK100 >0){
            if(weapon.name.equals("薙草之稻光")) {
                double thisATK100 = weapon.PE_to_ATK100 * (Power_Efficiency_END - 1);
                if(thisATK100 > 0.8+(weapon.lv-1)*0.1 ) thisATK100 = 0.8+(weapon.lv-1)*0.1;
                ATK_END += (ATK_BASE + ATK_W) * thisATK100;
            }
        }

        double PE_to_DMG = atfitems[0].PE_To_DMG + atfitems[1].PE_To_DMG;
        if (PE_to_DMG > 0)
            if(PE_to_DMG * Power_Efficiency_END < 0.75)
                 ATK_DMG_END += PE_to_DMG * Power_Efficiency_END;
            else
                 ATK_DMG_END += 0.75;//绝缘旗印
    }

    public double[] getAttrackByEnd() {
        if (RATE_END > RATE_END_MAX) RATE_END = RATE_END_MAX;
        if (RATE_END < 0 ) RATE_END = 0;

        double RN; //不暴击
        double RE; //期望
        double RM; //暴击

        double R = Hit_DMG * ATK_END;

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

    public double[] getAttrack() {
        counter_END();
        return getAttrackByEnd();
    }

    public double GET_ATK_EDN_EXCEPT() {
        counter_END();
        if (RATE_END > RATE_END_MAX) RATE_END = RATE_END_MAX;
        double R = Hit_DMG //倍率
                * ATK_END   //攻击力
                * (1 + ATK_DMG_END); //元素伤害加

        if (Element_ACT_DMG_BASE > 0)
              R =   R * (1 - Element_ACT_Efficiency) +
                    R * Element_ACT_Efficiency
                      * Element_ACT_DMG_BASE  //反应系数
                      * (1 + ELEMENT_ACT_DMG_items + 2.78 * ELEMENT_MASTER_END / (ELEMENT_MASTER_END + 1400) );//反应加伤

        return R * (1 + RATE_END * DMG_END);
        //y=278*x/(x+1400)（单位%）精通对加成反应加成公式
    }

    public double[] findMax(boolean show, int n) {
        double cnt[] = new double[12];

        DefaultShenyiwu();
        double atk = 19.45;//攻击力1
        double atk_100 = 0.0583;//百分比攻击2
        double hp = 298.75; //生命值3
        double hp_100 = 0.0583;//百分比生命4
        double rate = 0.0389;//暴击率5
        double dmg = 0.0777;//爆伤6
        double defense = 23.15;//小防御
        double defense_100 = 0.0729; //百分比防御
        double element_master_d = 23.31;//元素精通
        double Power_Efficiency_d = 0.0648;//元素充能效率

        double cnt_d[] = {atk, atk_100, hp, hp_100, rate, dmg, defense, defense_100, element_master_d, Power_Efficiency_d};

        double pro = 0;//提升率
        double h2 = 0;

        double hurt = 0;//最终期望伤害
        int no_use = 0; //未使用的词条数量
        int flag = -1;
        for (int i = 0; i < n; i++) {
            flag = -1;

            h2 = GET_ATK_EDN_EXCEPT();//计算提升率用

            for (int j = 0; j < 10; j++) {
                if (AllowAddtoSYW(j)) {
                    switch (j) {//增加
                        case 0:
                            ATK_f += cnt_d[0];
                            break;
                        case 1:
                            ATK_f100 += cnt_d[1];
                            break;
                        case 2:
                            HP_f += cnt_d[2];
                            break;
                        case 3:
                            HP_f100 += cnt_d[3];
                            break;
                        case 4:
                            RATE_f += cnt_d[4];
                            break;
                        case 5:
                            RATE_DMG_f += cnt_d[5];
                            break;
                        case 6:
                            DEF_f += cnt_d[6];
                            break;
                        case 7:
                            DEF_f100 += cnt_d[7];
                            break;
                        case 8:
                            Element_Master_f += cnt_d[8];
                            break;
                        case 9:
                            Power_Efficiency_f += cnt_d[9];
                            break;
                        default:
                            break;
                    }

                    double thishurt = GET_ATK_EDN_EXCEPT();
                    if (hurt < thishurt) {//计算对比
                        hurt = thishurt;
                        flag = j;
                    }

                    switch (j) {//还原
                        case 0:
                            ATK_f -= cnt_d[0];
                            break;
                        case 1:
                            ATK_f100 -= cnt_d[1];
                            break;
                        case 2:
                            HP_f -= cnt_d[2];
                            break;
                        case 3:
                            HP_f100 -= cnt_d[3];
                            break;
                        case 4:
                            RATE_f -= cnt_d[4];
                            break;
                        case 5:
                            RATE_DMG_f -= cnt_d[5];
                            break;
                        case 6:
                            DEF_f -= cnt_d[6];
                            break;
                        case 7:
                            DEF_f100 -= cnt_d[7];
                            break;
                        case 8:
                            Element_Master_f -= cnt_d[8];
                            break;
                        case 9:
                            Power_Efficiency_f -= cnt_d[9];
                            break;
                        default:
                            break;
                    }
                }//end if
                //  else System.out.println(j);
            }//end for j
            if (flag != -1) {
                addtoSYW(flag);
                cnt[flag]++;
                if (show) {
                    pro = (hurt - h2) / h2 * 100;
                    //mmmmmmmmmmmmmm
                    System.out.print(i + 1);
                    switch (flag) {
                        //case -1:       r+= "  元素/物理伤害增加: "+ main*100 +"%\n"; break;
                        case 0:
                            System.out.println("  攻击力   提升率: " + pro + "%");
                            break;
                        case 1:
                            System.out.println("  攻击力%  提升率: " + pro + "%");
                            break;
                        case 2:
                            System.out.println("  生命值  提升率: " + pro + "%");
                            break;
                        case 3:
                            System.out.println("  生命值%  提升率: " + pro + "%");
                            break;
                        case 4:
                            System.out.println("  暴击率  提升率: " + pro + "%");
                            break;
                        case 5:
                            System.out.println("  暴击伤害  提升率: " + pro + "%");
                            break;
                        case 6:
                            System.out.println("  防御力  提升率: " + pro + "%");
                            break;
                        case 7:
                            System.out.println("  防御力%  提升率: " + pro + "%");
                            break;
                        case 8:
                            System.out.println("  元素精通  提升率: " + pro + "%");
                            break;
                        case 9:
                            System.out.println("  元素充能效率  提升率: " + pro + "%");
                            break;
                    }
                }
                //mmmmmmmmmmmmmm
            } else {
                no_use++;
            }
            ATK_f = cnt_d[0] * cnt[0];
            ATK_f100 = cnt_d[1] * cnt[1];
            HP_f = cnt_d[2] * cnt[2];
            HP_f100 = cnt_d[3] * cnt[3];
            RATE_f = cnt_d[4] * cnt[4];
            RATE_DMG_f = cnt_d[5] * cnt[5];
            DEF_f = cnt_d[6] * cnt[6];
            DEF_f100 = cnt_d[7] * cnt[7];
            Element_Master_f = cnt_d[8] * cnt[8];
            Power_Efficiency_f = cnt_d[9] * cnt[9];
        }//end for i

        for (int i = 45 - no_use; i < 45; i++) {
            //System.out.println(tou.AllowAdd(9));
            //tou.add(9);
            if (AllowAddtoSYW(9) && show) {
                addtoSYW(9);
                cnt[9]++;
                System.out.print(i + 1);
                System.out.println("  元素充能效率");
                Power_Efficiency_f = cnt_d[9] * cnt[9];
            }
        }

        cnt[10] = hurt;
        cnt[11] = 45 - n;
        return cnt;
    }

    public double[] findMax() {
        return findMax(false, 45);
    }

    public double[] findMax(int n) {
        return findMax(false, n);
    }

    public double[] findMax(boolean show) {
        return findMax(show, 45);
    }

    private void DefaultShenyiwu() {
        //初始化圣遗物主词条
        flower.setMainID(flower.HP_ID);
        plume.setMainID(plume.ATK_ID);

        if (Sands_ATK_100 > 0) sands.setMainID(sands.ATK_100_ID);
        else if (Sands_DEF_100 > 0) sands.setMainID(sands.DEFENSE_100_ID);
        else if (Sands_HP_100 > 0) sands.setMainID(sands.HP_100_ID);
        else if (Sands_Elment_master > 0) sands.setMainID(sands.ELEMENT_MASTER_ID);
        else if (Sands_Power_Efficiency > 0) sands.setMainID(sands.Power_Efficiency_ID);

        if (Goblet_HP_100 > 0) goblet.setMainID(goblet.HP_100_ID);
        else if (Goblet_ATK_100 > 0) goblet.setMainID(goblet.ATK_100_ID);
        else if (Goblet_DEF_100 > 0) goblet.setMainID(goblet.DEFENSE_100_ID);
        else if (Goblet_Elment_master > 0) goblet.setMainID(goblet.ELEMENT_MASTER_ID);

        if (Circlet_HP_100 > 0) circlet.setMainID(circlet.HP_100_ID);
        else if (Circlet_DEF_100 > 0) circlet.setMainID(circlet.DEFENSE_100_ID);
        else if (Circlet_ATK_100 > 0) circlet.setMainID(circlet.ATK_100_ID);
        else if (Circlet_RATE > 0) circlet.setMainID(circlet.RATE_ID);
        else if (Circlet_DMG > 0) circlet.setMainID(circlet.RATE_A_ID);
        else if (Circlet_Elment_master > 0) circlet.setMainID(circlet.ELEMENT_MASTER_ID);
        else if (Circlet_Healing_Bonus > 0) circlet.setMainID(circlet.Healing_Bonus_ID);
        flower.setInfor("生之花");
        plume.setInfor("死之羽");
        sands.setInfor("时之沙");
        goblet.setInfor("空之杯");
        circlet.setInfor("理之冠");
    }

    private boolean addtoSYW(int id) {
        if (flower.add(id)) return true;
        if (plume.add(id)) return true;
        if (sands.add(id)) return true;
        if (goblet.add(id)) return true;
        if (circlet.add(id)) return true;
        return false;
    }

    private boolean AllowAddtoSYW(int id) {
        if (flower.AllowAdd(id)) return true;
        if (plume.AllowAdd(id)) return true;
        if (sands.AllowAdd(id)) return true;
        if (goblet.AllowAdd(id)) return true;
        if (circlet.AllowAdd(id)) return true;
        makeSYWf();//无法加入，调整词条
        if (flower.AllowAdd(id)) return true;
        if (plume.AllowAdd(id)) return true;
        if (sands.AllowAdd(id)) return true;
        if (goblet.AllowAdd(id)) return true;
        if (circlet.AllowAdd(id)) return true;
        return false;
    }

    private void makeSYWf() {
        Artifacts syw[] = {flower, plume, sands, goblet, circlet};
        for (int i = 0; i < syw.length; i++) {//遍历圣遗物
            for (int j = 0; j < syw[i].data_f.length; j++) {//遍历副词条
                if (syw[i].data_f[j] > 1) {
                    for (int k = 0; k < syw.length; k++) {
                        if (k != i && syw[k].AllowAdd(j)) {
                            syw[k].add(j);
                            syw[i].delect1(j);
                            flower = syw[0];
                            plume = syw[1];
                            sands = syw[2];
                            goblet = syw[3];
                            circlet = syw[4];
							/* System.out.println("调整了mmmmmmmmmmmmmm");
							 System.out.println(syw[i].toString());
							 System.out.println(syw[k].toString());
							 System.out.println("/mmmmmmmmmmmmmmmmm|");*/
                            return;
                        }
                    }
                }
            }
        }
    }

    public void printFindMax(double[] cnt) {
        System.out.print("攻击力: " + (int)cnt[0] + "  " + cnt[0] * 19 + "\n");
        System.out.print("%攻击力: " + (int)cnt[1] + "  " + cnt[1] * 5.8 + "%\n");
        System.out.print("生命值: " + (int)cnt[2] + "  " + cnt[2] * 299 + "\n");
        System.out.print("%生命值: " + (int)cnt[3] + "  " + cnt[3] * 5.8 + "%\n");
        System.out.print("暴击率: " +(int) cnt[4] + "  " + cnt[4] * 3.9 + "%\n");
        System.out.print("暴击伤害: " + (int)cnt[5] + "  " + cnt[5] * 7.8 + "%\n");
        System.out.print("防御力: " + (int)cnt[6] + "  " + cnt[6] * 23 + "\n");
        System.out.print("防御力%: " + (int)cnt[7] + "  " + cnt[7] * 7.3 + "%\n");
        System.out.print("元素精通: " + (int)cnt[8] + "  " + cnt[8] * 23 + "\n");
        System.out.print("元素充能效率: " + (int)cnt[9] + "  " + cnt[9] * 6.5 + "%\n");
        System.out.print("未分配词条数: " + (int)cnt[11] + "\n");
    }

    @Override
    public String toString() {
        // TODO: Implement this method
        counter_END();//计算面板
        String r = "生命: " + HP_END
                + "\n防御力: " + Defense_END
                + "\n攻击力: " + ATK_END
                + "\n元素精通: " + d2f(ELEMENT_MASTER_END)
                + "\n伤害增加: " + d2f(ATK_DMG_END * 100) + "%"
                + "\n暴击率: " + d2f(RATE_END * 100) + "%"
                + "\n暴击伤害: " + d2f(DMG_END * 100) + "%"
                + "\n元素充能效率: " + d2f(Power_Efficiency_END * 100) + "%";
        return r;
    }


    public String Help_variable() {
        return "bilibili UID:434665115\n" +
                "\tpublic int HP_BASE = 0;           //基础生命\n" +
                "\tpublic int ATK_BASE = 0;          //基础攻击力\n" +
                "\tpublic int ELEMENT_MASTER_BASE = 0;//基础元素精通\n" +
                "\tpublic int DEF_BASE = 0;//基础防御\n" +
                "\tpublic double DMG_BASE = 0;//基础暴击伤害\n" +
                "\tpublic double RATE_BASE = 0; //基础暴击率\n" +
                "\tpublic double Element_p_BASE = 0;//基础元素/物理伤害加成\n" +
                "\n" +
                "\tpublic double Element_ACT_DMG = 0;//元素反应倍率，如融化就设置为2\n" +
                "\tpublic double RATE_END_MAX = 1.0;//暴击率最大值，考虑到深渊buff等暴击率加成时可修改\n" +
                "\tpublic double Hit_DMG = 1.0;//默认攻击倍率\n" +
                "\n" +
                "\tpublic double HP_W100 = 0;   //武器的百分比生命加成\n" +
                "\tpublic int ATK_W = 0;        //武器基础攻击力\n" +
                "\tpublic double ATK_W100 = 0;  //武器百分比攻击\n" +
                "\tpublic double DMG_W = 0;  //武器爆伤\n" +
                "\tpublic double RATE_W = 0;    //武器暴击率\n" +
                "\tpublic double ELEMENT_P_W = 0; //武器元素/物理伤害加成\n" +
                "\tpublic double DEF_100_W = 0;//武器百分比防御\n" +
                "\tpublic double ELEMENT_MASTER_W = 0;//武器元素精通\n" +
                "\tpublic double Power_Efficiency_W = 0;//武器元素充能效率\n" +
                "\n" +
                "\t//武器\n" +
                "\tpublic Weapon weapon = null;\n" +
                "\t//圣遗物\n" +
                "\tpublic Artifacts flower = new Artifacts();//花\n" +
                "\tpublic Artifacts plume = new Artifacts();//羽\n" +
                "\tpublic Artifacts sands = new Artifacts();//沙\n" +
                "\tpublic Artifacts goblet = new Artifacts();//杯\n" +
                "\tpublic Artifacts circlet = new Artifacts();//头\n" +
                "\t\n" +
                "\t//主词条\n" +
                "\tpublic int Flower_HP = 0; //圣遗物花主属性的生命值\n" +
                "\tpublic int Plume_ATK = 0;      //圣遗物羽主属性的攻击力\n" +
                "\tpublic double Sands_ATK_100 = 0;  //沙漏主属性百分比攻击\n" +
                "\tpublic double Sands_DEF_100 = 0;//沙漏主属性百分比防御\n" +
                "\tpublic double Sands_HP_100 = 0;  //沙漏主属性百分比生命\n" +
                "\tpublic double Sands_Elment_master = 0;//沙漏元素精通\n" +
                "\tpublic double Sands_Power_Efficiency = 0;//充能沙\n" +
                "\tpublic double Goblet_ATK_100 = 0; //杯子主百分比攻击\n" +
                "\tpublic double Goblet_DEF_100 =0;//杯子主百分比防御\n" +
                "\tpublic double Goblet_HP_100 =0;   //杯子主百分比生命;\n" +
                "\tpublic double Goblet_Elment_master = 0;//杯子元素精通\n" +
                "\tpublic double Goblet_Element_p = 0;//杯子元素/物理伤害加成\n" +
                "\tpublic double Circlet_RATE = 0;  //头主属性暴击率\n" +
                "\tpublic double Circlet_DMG = 0;//头主属性爆伤\n" +
                "\tpublic double Circlet_ATK_100 =0;//攻击头\n" +
                "\tpublic double Circlet_DEF_100 =0; //防御头\n" +
                "\tpublic double Circlet_HP_100 = 0;  //生命头\n" +
                "\tpublic double Circlet_Elment_master = 0;//精通头\n" +
                "\t\n" +
                "\t//副词条\n" +
                "\tpublic double ATK_f = 0;        //圣遗物小攻击加成\n" +
                "\tpublic double ATK_f100 = 0;  //圣遗物的百分比攻击力加成\n" +
                "\tpublic double HP_f = 0;         //圣遗物小生命;\n" +
                "\tpublic double HP_f100 = 0;   //圣遗物百分比生命\n" +
                "\tpublic double RATE_f = 0;      //圣遗物暴击率\n" +
                "\tpublic double DMG_f = 0;    //圣遗物爆伤加成\n" +
                "\tpublic double DEF_f100 =0;//圣遗物百分比防御\n" +
                "\tpublic double DEF_f = 0;    //圣遗物小防御\n" +
                "\tpublic double Element_Master_f = 0;//元素精通\n" +
                "\tpublic double Power_Efficiency_f = 0;//元素充能效率\n" +
                "\n" +
                "\t//圣遗物套装效果\n" +
                "\tpublic double ATKDMG_items = 0;   //额外伤害增加\n" +
                "\tpublic double ATK_100_items = 0;//百分比攻击\n" +
                "\tpublic double HP_100_items = 0;//百分比生命\n" +
                "\tpublic double Defense_100_items =0;//百分比防御\n" +
                "\tpublic double Element_p_items =0;//元素/物理,伤害增加\n" +
                "\tpublic double Element_master_items =0;//元素精通\n" +
                "\tpublic double Rate_items = 0;//暴击率\n" +
                "\tpublic double ELEMENT_ACT_DMG_items = 0;//元素反应伤害加成，如魔女4效果\n" +
                "\tpublic double Power_Efficiency_items = 0;//套装元素充能效率\n" +
                "\n" +
                "\tpublic double HP_END = 0;      //最终生命值\n" +
                "\tpublic double Defense_END = 0; //最终防御力\n" +
                "\tpublic double ATK_END = 0;     //最终攻击力，战斗状态\n" +
                "\tpublic double ELEMENTP_END = 0;//最终元素加伤\n" +
                "\tpublic double RATE_END = 0;    //最终暴击率\n" +
                "\tpublic double DMG_END = 0;   //最终爆伤\n" +
                "\tpublic double ELEMENT_MASTER_END=0;//最终元素精通\n" +
                "\tpublic double Power_Efficiency_END = 0;//最终元素充能效率";
    }

    public String Help_use() {
        return "\t\t//bilibili UID:434665115\n" +
           "HuTao hutao = new HuTao(0);\n" +
                "        hutao.setWeapon(Weapon_Library.Polearm.humo(1));//设置武器，这里是精1护魔\n" +
                "\n" +
                "        hutao.setElement_ACT_DMG_BASE(1.5);//元素反应系数，这里1.5是蒸发\n" +
                "        hutao.setElement_ACT_Efficiency(0.897);\n" +
                "        hutao.setHit_DMG(2.426);//设置攻击倍率，这里是10级普攻重击倍率\n" +
                "        //hutao.setRATE_END_MAX(0.85);//设置暴击率上限，的设置为0.05\n" +
                "\n" +
                "        //设置圣遗物主属性\n" +
                "        hutao.setFlower_HP(4780);//花\n" +
                "        hutao.setPlume_ATK(311);\t   //羽\n" +
                "        //hutao.setSands_Power_Efficiency(0.518);\n" +
                "        //hutao.setSands_ATK_100(0.466);//攻击沙\n" +
                "        //hutao.setSands_HP_100(0.466);//生命沙\n" +
                "        hutao.setSands_Elment_master(187);//精通沙\n" +
                "        hutao.setCirclet_RATE(0.311); //暴击头\n" +
                "        //hutao.setCirclet_DMG(0.622);//爆伤头\n" +
                "        //hutao.setCirclet_ATK_100(0.466);//攻击头\n" +
                "        //hutao.setCirclet_Elment_master(187);//精通头\n" +
                "        hutao.setGoblet_Element_p(0.466);//元素杯\n" +
                "        //hutao.setGoblet_ATK_100(0.466);\n" +
                "        //hutao.setGoblet_ATK_100(0.466);\n" +
                "        hutao.setElement_p_items(-0.15);\n" +
                "        hutao.setAtfitems(SYWitems.Monvtao(4));//魔女4\n" +
                "        //hutao.setAtfitems(SYWitems.Monvtao(4));//魔女4\n" +
                "        //hutao.setElement_p_items(0.15+0.075);//设置圣遗物套装效果伤害增加\n" +
                "        //hutao.setELEMENT_ACT_DMG_items(0.15);//设置魔女4反应系数加成\n" +
                "        //hutao.setElement_master_items(280);//设置圣遗物套装效果加80精通\n" +
                "        //hutao.setRate_items(0.15);//设置圣遗物套装效果暴击率加成\n" +
                "        //hutao.setHP_100_items(0.2);//设置圣遗物套装效果百分比生命加成\n" +
                "\n" +
                "        //寻找最优圣遗物副词条搭配,参数为是否打印细节，这里false是不打印,词条数量是45\n" +
                "        double a[]=hutao.findMax(true,35);\n" +
                "\n" +
                "        hutao.printFindMax(a);//打印最优圣遗物副词条搭配信息\n" +
                "\n" +
                "        System.out.println(\"\");\n" +
                "        //计算角色伤害\n" +
                "        double[] r = hutao.getAttrack();\n" +
                "        double d =  HitObj.getD(90,90,0.1);//90级遗迹守卫元素抗性减伤系数\n" +
                "        System.out.println(\"期望伤害:  \" + r[0] * d );\n" +
                "        System.out.println(\"不暴击:   \"+ r[1] * d );\n" +
                "        System.out.println(\"暴击:    \"+r[2] * d );\n" +
                "\n" +
                "        System.out.println(\"\\n面板\");\n" +
                "        System.out.println(hutao.toString()+\"\\n\");//打印角色属性\n" +
                "\n" +
                "        //打印武器属性\n" +
                "        System.out.println(hutao.weapon+\"\\n\");\n" +
                "\n" +
                "        //圣遗物套装\n" +
                "        if(!hutao.atfitems[0].name.equals(\"\")) System.out.println(hutao.atfitems[0].toString());\n" +
                "        if(!hutao.atfitems[1].name.equals(\"\")) System.out.println(hutao.atfitems[1].toString());\n" +
                "\n" +
                "        //打印圣遗物最优解属性\n" +
                "        hutao.flower.printf();//打印花\n" +
                "        hutao.plume.printf();//羽\n" +
                "        hutao.sands.printf();//沙\n" +
                "        hutao.goblet.printf();//杯\n" +
                "        hutao.circlet.printf();//头\n" +
                "\n" +
                "        //参考信息\n" +
                "      /* System.out.println(hutao.Help_use());\n" +
                "        System.out.println(hutao.Help_addCaracter());\n" +
                "        System.out.println(hutao.Help_variable()); */\n" +
                "        或者使用以下方法快捷输出\n" +
                "        out.printfall(hutao,45);\n"+
                "     }";
    }

    public String Help_addCaracter() {
        return "public class HuTao extends GenshinCharacter\n" +
                "{\n" +
                "\t//胡桃\n" +
                "\tdouble HP_atk_e = 0.0626;//10级e技能攻击力系数\n" +
                "\tpublic HuTao(int lv){\n" +
                "\t\tif(lv > 2){//命大于2\n" +
                "\t\t\tHP_atk_e = 0.0715;//13级e\n" +
                "\t\t}\n" +
                "\t\tsuper.HP_BASE = 15552;\n" +
                "\t\tsuper.ATK_BASE = 107;\n" +
                "\t\tsuper.DMG_BASE = 0.884;\n" +
                "\t\tsuper.RATE_BASE = 0.05;\n" +
                "\t\tsuper.Element_DMG_BASE = 0.33;\n" +
                "\t\tsuper.DEF_BASE = 876;\n" +
                "\t}\n" +
                "\t\n" +
                "\t@Override\n" +
                "\tpublic void counter_END()\n" +
                "\t{\n" +
                "\t\t// TODO: Implement this method\n" +
                "\t\t//生命\n" +
                "\t\tHP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_ATK_100 + HP_100_items)\n" +
                "\t\t\t+ Flower_HP //花\n" +
                "\t\t\t+ HP_f; //小生命加成\n" +
                "        //攻击力\n" +
                "\t\tATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)\n" +
                "\t\t\t+ Plume_ATK  //羽毛\n" +
                "\t\t\t+ ATK_f  //小攻击\n" +
                "\t\t\t+ HP_END * HP_atk_e;//10级E技能攻击力转化\n" +
                "\n" +
                "\t\t//伤害加成\n" +
                "\t\tELEMENTP_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items;\n" +
                "        //防御\n" +
                "\t\tDefense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)\n" +
                "\t\t\t\t+ DEF_f;\n" +
                "\t\t//元素精通\n" +
                "\t\tELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;\n" +
                "\t\t//暴击率\n" +
                "\t\tRATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE + Rate_items;\n" +
                "\t\tDMG_END = DMG_BASE //基础爆伤\n" +
                "\t\t\t+ DMG_W   //武器\n" +
                "\t\t\t+ DMG_f  //圣遗物副词条\n" +
                "\t\t\t+ Circlet_DMG; //头\n" +
                "\t     super.counter_END();\n" +
                "\t}\n" +
                "}";
    }

    private static String d2f(double a) {
        String r = a + "";
        if (r.indexOf(".") + 2 < r.length()) {
            return r.substring(0, r.indexOf(".") + 2);
        }
        return r;
    }


    public void setWeapon(Weapon e) {
        setATK_W(e.ATK_BASE);
        setATK_W100(e.ATK_100);
        setRATE_W(e.RATE);
        setDMG_W(e.RATE_DMG);
        setELEMENT_MASTER_W(e.ELEMENT_MASTER);
        setELEMENT_P_W(e.ATK_DMG);
        setHP_W100(e.HP_100);
        setDEF_100_W(e.DEFENS_100);
        setPower_Efficiency_W(e.Power_Efficiency);
        weapon = e;
    }

    public void setAtfitems(Atfitems e) {
        boolean flag = false;
        if (atfitems[0].name.equals("")) {
            atfitems[0] = e;
            flag = true;
        } else if (atfitems[0].number < 4 && e.number < 4) {
            atfitems[1] = e;
            flag = true;
        }
        if (flag) {
            ATK_100_items += e.ATK_100;
            ATKDMG_items += e.ATK_DMG;
            HP_100_items += e.HP_100;
            ELEMENT_ACT_DMG_items += e.ELEMENT_ACT_P;
            Element_master_items += e.ELEMENT_MASTER;
            Rate_items += e.RATE;
            Power_Efficiency_items += e.Power_Efficiency;
            Defense_100_items += e.Defense_100;
        }
    }

    public void setRate_items(double e) {
        Rate_items = e;
    }

    public void setELEMENT_MASTER_W(double e) {
        ELEMENT_MASTER_W = e;
    }

    public void setElement_ACT_DMG_BASE(double e) {
        Element_ACT_DMG_BASE = e;
    }

    public void setSands_Elment_master(double e) {
        Sands_Elment_master = e;
        sands.main = e;
    }

    public void setGoblet_Elment_master(double e) {
        Goblet_Elment_master = e;
        goblet.main = e;
    }

    public void setCirclet_Elment_master(double e) {
        Circlet_Elment_master = e;
        circlet.main = e;
    }
    public void setCirclet_Healing_Bonus(double circlet_Healing_Bonus) {
        Circlet_Healing_Bonus = circlet_Healing_Bonus;
        circlet.main = circlet_Healing_Bonus;
    }

    public void setHealing_Bonus_items(double healing_Bonus_items) {
        Healing_Bonus_items = healing_Bonus_items;
    }

    public void setElement_Master_f(double e) {
        Element_Master_f = e;
    }
    public void setPower_Efficiency_f(double e){ Power_Efficiency_f = e; }

    public void setELEMENT_ACT_DMG_items(double e) {
        ELEMENT_ACT_DMG_items = e;
    }

    public void setElement_master_items(double e) {
        Element_master_items = e;
    }

    public void setDEF_100_W(double e) {
        DEF_100_W = e;
    }
    public void setElement_ACT_Efficiency(double e){
        if(e > 1) e = 1;
        Element_ACT_Efficiency = e;
    }
    public void setRATE_END_MAX(double e) {
        if (e > 1.0) e = 1;
        if (e < RATE_BASE) e = RATE_BASE;
        RATE_END_MAX = e;
    }

    public void test() {
        System.out.println(RATE_BASE);
    }

    public void setRATE_f(double rATE_f) {
        RATE_f = rATE_f;
    }

    public double getRATE_f() {
        return RATE_f;
    }

    public void setRATE_DMG_f(double rATE_A_f) {
        RATE_DMG_f = rATE_A_f;
    }

    public double getRATE_DMG_f() {
        return RATE_DMG_f;
    }

    public void setGoblet_Element_p(double goblet_Element_p) {
        Goblet_Element_p = goblet_Element_p;
        goblet.main = goblet_Element_p;
    }

    public double getGoblet_Element_p() {
        return Goblet_Element_p;
    }

    public void setATKDMG_items(double aTKPLUS_team) {
        ATKDMG_items = aTKPLUS_team;
    }

    public double getATKDMG_items() {
        return ATKDMG_items;
    }

    public void setATK_100_items(double aTK_100_team) {
        ATK_100_items = aTK_100_team;
    }

    public double getATK_100_items() {
        return ATK_100_items;
    }

    public void setHP_100_items(double hP_100_team) {
        HP_100_items = hP_100_team;
    }

    public double getHP_100_items() {
        return HP_100_items;
    }

    public void setDefense_100_items(double defense_100_items) {
        Defense_100_items = defense_100_items;
    }

    public double getDefense_100_items() {
        return Defense_100_items;
    }

    public void setElement_p_items(double element_p_items) {
        Element_p_items = element_p_items;
    }

    public double getElement_p_items() {
        return Element_p_items;
    }

    public void setFlower_HP(int hP_flowder) {
        Flower_HP = hP_flowder;
        flower.main = hP_flowder;
    }

    public int getFlower_HP() {
        return Flower_HP;
    }

    public void setPlume_ATK(int aTK_Y) {
        Plume_ATK = aTK_Y;
        plume.main = aTK_Y;
    }

    public int getPlume_ATK() {
        return Plume_ATK;
    }

    public double getSands_Power_Efficiency() {
        return Sands_Power_Efficiency;
    }

    public void setSands_Power_Efficiency(double sands_Power_Efficiency) {
        Sands_Power_Efficiency = sands_Power_Efficiency;
        sands.main = sands_Power_Efficiency;
    }

    public void setSands_ATK_100(double sands_ATK_100) {
        Sands_ATK_100 = sands_ATK_100;
        sands.main = sands_ATK_100;
    }

    public double getSands_ATK_100() {
        return Sands_ATK_100;
    }

    public void setSands_DEF_100(double sands_DEF_100) {
        Sands_DEF_100 = sands_DEF_100;
        sands.main = sands_DEF_100;
    }

    public double getSands_DEF_100() {
        return Sands_DEF_100;
    }

    public void setSands_HP_100(double sands_HP_100) {
        Sands_HP_100 = sands_HP_100;
        sands.main = sands_HP_100;
    }

    public double getSands_HP_100() {
        return Sands_HP_100;
    }

    public void setGoblet_ATK_100(double goblet_ATK_100) {
        Goblet_ATK_100 = goblet_ATK_100;
        goblet.main = goblet_ATK_100;
    }

    public double getGoblet_ATK_100() {
        return Goblet_ATK_100;
    }

    public void setGoblet_DEF_100(double goblet_DEF_100) {
        Goblet_DEF_100 = goblet_DEF_100;
        goblet.main = goblet_DEF_100;
    }

    public double getGoblet_DEF_100() {
        return Goblet_DEF_100;
    }

    public void setGoblet_HP_100(double goblet_HP_100) {
        Goblet_HP_100 = goblet_HP_100;
        goblet.main = goblet_HP_100;
    }

    public double getGoblet_HP_100() {
        return Goblet_HP_100;
    }

    public void setCirclet_RATE(double circlet_RATE) {
        Circlet_RATE = circlet_RATE;
        circlet.main = circlet_RATE;
    }

    public double getCirclet_RATE() {
        return Circlet_RATE;
    }

    public void setCirclet_DMG(double circlet_DMG) {
        Circlet_DMG = circlet_DMG;
        circlet.main = circlet_DMG;
    }

    public double getCirclet_DMG() {
        return Circlet_DMG;
    }

    public void setCirclet_ATK_100(double circlet_ATK_100) {
        Circlet_ATK_100 = circlet_ATK_100;
        circlet.main = circlet_ATK_100;
    }

    public double getCirclet_ATK_100() {
        return Circlet_ATK_100;
    }

    public void setCirclet_DEF_100(double circlet_DEF_100) {
        Circlet_DEF_100 = circlet_DEF_100;
        circlet.main = circlet_DEF_100;
    }

    public double getCirclet_DEF_100() {
        return Circlet_DEF_100;
    }

    public void setCirclet_HP_100(double circlet_HP_100) {
        Circlet_HP_100 = circlet_HP_100;
        circlet.main = circlet_HP_100;
    }

    public double getCirclet_HP_100() {
        return Circlet_HP_100;
    }

    public void setATKPLUS(double aTKPLUS) {
        ATKDMG_items = aTKPLUS;
    }

    public double getATKPLUS() {
        return ATKDMG_items;
    }

    public void setHP_W100(double hP_W100) {
        HP_W100 = hP_W100;
    }

    public double getHP_W100() {
        return HP_W100;
    }

    public void setATK_W(int aTK_W) {
        ATK_W = aTK_W;
    }

    public int getATK_W() {
        return ATK_W;
    }

    public void setATK_W100(double aTK_W100) {
        ATK_W100 = aTK_W100;
    }

    public double getATK_W100() {
        return ATK_W100;
    }

    public void setDMG_W(double rATE_A_W) {
        DMG_W = rATE_A_W;
    }

    public double getDMG_W() {
        return DMG_W;
    }

    public void setRATE_W(double rATE_W) {
        RATE_W = rATE_W;
    }

    public double getRATE_W() {
        return RATE_W;
    }

    public void setELEMENT_P_W(double ELEMENT_P_W) {
        this.ELEMENT_P_W = ELEMENT_P_W;
    }

    public double getELEMENT_P_W() {
        return ELEMENT_P_W;
    }

    public void setDEF_f100(double DEF_f100) {
        this.DEF_f100 = DEF_f100;
    }

    public double getDEF_f100() {
        return DEF_f100;
    }

    public void setDEF_f(double DEF_f) {
        this.DEF_f = DEF_f;
    }

    public double getDEF_f() {
        return DEF_f;
    }

    public void setATK_f(int aTK_f) {
        ATK_f = aTK_f;
    }

    public double getATK_f() {
        return ATK_f;
    }

    public void setATK_f100(double aTK_f100) {
        ATK_f100 = aTK_f100;
    }

    public double getATK_f100() {
        return ATK_f100;
    }

    public void setHP_f(int hP_f) {
        HP_f = hP_f;
    }

    public double getHP_f() {
        return HP_f;
    }

    public void setHP_f100(double hP_f100) {
        HP_f100 = hP_f100;
    }

    public double getHP_f100() {
        return HP_f100;
    }

    public void setRATE(double rATE) {
        RATE_f = rATE;
    }

    public double getRATE() {
        return RATE_f;
    }

    public void setRATE_A(double rATE_A) {
        RATE_DMG_f = rATE_A;
    }

    public double getRATE_A() {
        return RATE_DMG_f;
    }

    public void setHit_DMG(double hit_DMG) {
        this.Hit_DMG = hit_DMG;
    }

    public double getHit_DMG() {
        return Hit_DMG;
    }

    public void setHP_END(double HP_END) {
        this.HP_END = HP_END;
    }

    public void setDefense_END(double defense_END) {
        Defense_END = defense_END;
    }

    public void setATK_END(double ATK_END) {
        this.ATK_END = ATK_END;
    }

    public void setATK_DMG_END(double ATK_DMG_END) {
        this.ATK_DMG_END = ATK_DMG_END;
    }

    public void setRATE_END(double RATE_END) {
        this.RATE_END = RATE_END;
    }

    public void setDMG_END(double DMG_END) {
        this.DMG_END = DMG_END;
    }

    public void setELEMENT_MASTER_END(double ELEMENT_MASTER_END) {
        this.ELEMENT_MASTER_END = ELEMENT_MASTER_END;
    }

    public void setPower_Efficiency_END(double power_Efficiency_END) {
        Power_Efficiency_END = power_Efficiency_END;
    }

    public void setPower_Efficiency_W(double e){ Power_Efficiency_W=e; }
}
