package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//千岩
public class Tenacity_of_the_Millelith extends Atfitems {
    public Tenacity_of_the_Millelith(int number){
        super.name = "千岩牢固 " + number;
        super.number = number;
        super.HP_100 = 0.2;
        if(number>3){
            super.ATK_100 = 0.2;
        }
    }
}
