package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//追忆的注连套
public class Shimenawa_is_Reminiscence extends Atfitems {
    public Shimenawa_is_Reminiscence(int number){
        super.name = "追忆之注连 " + number;
        super.number = number;
        super.ATK_100 = 0.18;
        if(number>3){
            super.ATK_DMG = 0.5;
        }
    }
}
