package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//冰套
public class Blizzard_Strayer extends Atfitems{
    public Blizzard_Strayer(int number){
        super.name = "冰风迷途的勇士 " + number;
        super.number = number;
        super.ATK_DMG = 0.15;
        if(number>=4){ //4件效果
            super.RATE = 0.4;
        }
    }
}
