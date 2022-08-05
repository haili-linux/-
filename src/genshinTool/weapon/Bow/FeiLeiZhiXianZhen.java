package genshinTool.weapon.Bow;

import genshinTool.weapon.Weapon;

public class FeiLeiZhiXianZhen extends Weapon {
    public FeiLeiZhiXianZhen(int lv){
        super.name = "飞雷之弦震";
        super.ATK_BASE = 608;
        super.ATK_100 = 0.20 + (lv-1)*0.05;
        super.ATK_DMG = 0.4 + (lv-1)*0.1;
        super.RATE_DMG = 0.662;
        super.lv = lv;
    }
}
