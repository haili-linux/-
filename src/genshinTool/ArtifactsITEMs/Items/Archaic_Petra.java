package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//岩套
public class Archaic_Petra extends Atfitems {
    public Archaic_Petra(int number){
        super.name = "悠古的磐岩 " + number;
        super.number = number;
        super.ATK_DMG = 0.15;
        if(number>3){
            super.ATK_DMG = 0.5;
        }
    }
}
