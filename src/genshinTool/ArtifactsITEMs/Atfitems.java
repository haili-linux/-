package genshinTool.ArtifactsITEMs;

public class Atfitems {
    public String name = "";
    public int number = 0;
    public double ATK_DMG = 0; //伤害增加
    public double ATK_100 = 0; //百分比攻击
    public double HP_100 = 0; //百分比生命
    public double RATE = 0; //暴击率
    public double ELEMENT_ACT_P = 0; //元素反应伤害加成，如魔女4效果
    public double ELEMENT_MASTER = 0; //元素精通
    public double Power_Efficiency = 0; //元素充能
    public double PE_To_DMG = 0; //元素充能转伤害增加系数
    public double Defense_100 = 0;//百分比防御

    @Override
    public String toString() {
        String r = name + "\n";
        if(ATK_100!=0) r += "  攻击力 +" + ATK_100*100 + "%\n";
        if(Defense_100!=0) r += "  防御力+" + Defense_100*100 + "%\n";
        if(HP_100!=0)  r += "  生命值增加" + HP_100*100 + "%\n";
        if(ATK_DMG!=0) r += "  伤害增加" + ATK_DMG*100 + "%\n";
        if(RATE!=0)    r += "  暴击率增加" + RATE*100 + "%\n";
        if(ELEMENT_MASTER>0)  r += "  元素精通" + ELEMENT_MASTER + "\n";
        if(Power_Efficiency>0) r += "  元素充能效率" + Power_Efficiency*100 + "%\n";
        if(ELEMENT_ACT_P!=0)  r += "  融化蒸发反应系数增加" + ELEMENT_ACT_P*100 + "%\n";
        if(PE_To_DMG>0) r += "  元素充能效率的"+ PE_To_DMG*100 +"%转化伤害增加\n";
        return r;
    }
}
