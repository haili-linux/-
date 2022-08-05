package genshinTool.ArtifactsITEMs.Items;

import genshinTool.ArtifactsITEMs.Atfitems;

//水套
public class Heart_Of_Depth extends Atfitems {
   public Heart_Of_Depth(int number){
       super.name = "沉沦之心 " + number;
       super.number = number;
       super.ATK_DMG = 0.15;
       if(number>=4){
           super.ATK_DMG = 0.15 + 0.3;
       }
   }
}
