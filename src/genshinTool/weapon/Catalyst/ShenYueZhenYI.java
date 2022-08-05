package genshinTool.weapon.Catalyst;

import genshinTool.weapon.Weapon;

public class ShenYueZhenYI extends Weapon {
    public ShenYueZhenYI(int lv){
        super.name = "神乐之真意";
        super.ATK_BASE = 608;
        super.RATE_DMG = 0.662;
        super.ATK_DMG = (0.12 + (lv-1)*0.03) * 4 ;
        super.lv = lv;
    }
}
