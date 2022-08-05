package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//苍白之火
public class Pale_Flame extends Atfitems {
    public Pale_Flame(int number){
        super.name = "苍白之火 " + number;
        super.number = number;
        super.ATK_DMG = 0.25;
        if(number>3){
            super.ATK_100 = 0.18;
            super.ATK_DMG = 0.5;
        }
    }
}
