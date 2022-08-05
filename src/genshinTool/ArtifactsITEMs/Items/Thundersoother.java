package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//平雷套
public class Thundersoother extends Atfitems {
    public Thundersoother(int number){
        super.name = "平息鸣雷的尊者 " + number;
        super.number = number;
        if(number>=4){ //4件效果
            super.ATK_DMG = 0.35;
        }
    }
}
