package genshinTool.weapon.Bow;

import genshinTool.weapon.Weapon;

public class RouShui extends Weapon {
    public RouShui(int lv){

        if(lv < 1) lv = 1;

        super.name = "若水";
        super.ATK_BASE = 542;
        super.RATE_DMG = 0.882;
        super.HP_100 = 0.16 + ( lv - 1 ) * 0.04;
        super.ATK_DMG = 0.2 + ( lv - 1 ) * 0.05;

        super.lv=lv;
    }
}
