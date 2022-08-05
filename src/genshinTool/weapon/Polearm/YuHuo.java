package genshinTool.weapon.Polearm;

import genshinTool.weapon.Weapon;

public class YuHuo extends Weapon {
    public YuHuo(int lv){
        super.name = "渔获";
        super.ATK_BASE = 510;
        super.RATE = 0.06 + (lv - 1)*0.015;
        super.ATK_DMG = 0.16 + (lv - 1)*0.04;
    }
}
