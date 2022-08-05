package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;
//宗室套
public class Noblesse_Oblige extends Atfitems {
    public Noblesse_Oblige(int number){
        super.name = "昔日宗室之仪 " + number;
        super.number = number;
        super.ATK_DMG = 0.2;
        if(number > 3){
            super.ATK_100 = 0.2;
        }
    }
}
