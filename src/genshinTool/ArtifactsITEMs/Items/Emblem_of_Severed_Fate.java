package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;
//绝缘之旗印
public class Emblem_of_Severed_Fate extends Atfitems {
    public Emblem_of_Severed_Fate(int number){
        super.name = "绝缘之旗印 " + number;
        super.number = number;
        super.Power_Efficiency = 0.2;
        if(number>3){
            super.PE_To_DMG = 0.25;
        }
    }
}
