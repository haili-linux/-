package genshinTool.weapon.Polearm;

import genshinTool.weapon.Weapon;

public class DaoGuang extends Weapon {
    public DaoGuang(int lv){
        super.name = "薙草之稻光";
        super.ATK_BASE = 608;
        super.Power_Efficiency = 0.551 + 0.3 + (lv - 1) * 0.05;
        super.PE_to_ATK100 = 0.28 + (lv - 1) * 0.07;
        super.lv=lv;
    }
}
