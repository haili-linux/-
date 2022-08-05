package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

public class Husk_of_Opulent_Dreams extends Atfitems {
    public Husk_of_Opulent_Dreams(int number){
            super.name = "华馆梦醒形骸记 " + number;
            super.number = number;
            super.Defense_100 = 0.3;
            if(number>3){
                super.Defense_100 = 0.54;
                super.ATK_DMG = 0.24;
            }
    }

}
