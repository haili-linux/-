package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;
//染血骑士套
public class Bloodstained_Chivalry extends Atfitems {
    public Bloodstained_Chivalry(int number){
        super.name = "染血的骑士道 " + number;
        super.number = number;
        super.ATK_DMG = 0.25;
        if(number>3){
            ATK_DMG = 0.75;
        }
    }
}
