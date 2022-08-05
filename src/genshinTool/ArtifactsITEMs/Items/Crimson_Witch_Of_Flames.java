package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//魔女套
public class Crimson_Witch_Of_Flames extends Atfitems {
    public Crimson_Witch_Of_Flames(int number){
        super.name = "炽烈的炎之魔女 " + number;
        super.number = number;
        super.ATK_DMG = 0.15; //2件效果
         if(number>=4){ //4件效果
             super.ELEMENT_ACT_P = 0.15;
             super.ATK_DMG = 0.15 + 0.15 * 1.5;
         }
    }
}
