package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//逆飞流星套
public class Retracing_Bolide extends Atfitems {
    public Retracing_Bolide(int number){
        super.name = "逆飞的流星 " + number;
        super.number = number;
        if(number>3) super.ATK_DMG = 0.4;
    }
}
