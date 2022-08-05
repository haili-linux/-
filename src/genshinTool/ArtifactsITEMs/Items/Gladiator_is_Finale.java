package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;
//角斗士
public class Gladiator_is_Finale extends Atfitems {
    public Gladiator_is_Finale(int number){
        super.name = "角斗士的终幕礼 " + number;
        super.number = number;
        super.ATK_100 = 0.18;
        if(number>3){
            super.ATK_DMG = 0.35;
        }
    }
}
