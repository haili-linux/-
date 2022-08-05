package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//渡火
public class Lavawalker extends Atfitems {
    public Lavawalker(int number){
        super.name = "渡过烈火的贤人 " + number;
        super.number = number;
        if(number>=4){ //4件效果
            super.ATK_DMG = 0.35;
        }
    }
}
