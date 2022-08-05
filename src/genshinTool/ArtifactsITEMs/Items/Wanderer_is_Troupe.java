package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//乐团套
public class Wanderer_is_Troupe extends Atfitems {
    public Wanderer_is_Troupe(int number){
        super.name = "流浪大地的乐团 " + number;
        super.number = number;
        super.ELEMENT_MASTER = 80;
        if(number>3){
            super.ATK_DMG = 0.35;
        }
    }
}
