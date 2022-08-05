package genshinTool;

public class out {
    public static void printfall(GenshinCharacter genshinCharacter){
        double a[] = genshinCharacter.findMax(true,45);
        genshinCharacter.printFindMax(a);
        System.out.println("");

        double r[] = genshinCharacter.getAttrack();

        double deDMG = HitObj.getD(90,90);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2]*deDMG);
        System.out.println("不暴击 " + r[1]*deDMG);
        System.out.println("期望  " +  r[0]*deDMG);

        System.out.println(genshinCharacter);
        System.out.println("");
        System.out.println(genshinCharacter.weapon);
        System.out.println("");
        System.out.println(genshinCharacter.atfitems[0]);
        System.out.println(genshinCharacter.atfitems[1]);
        genshinCharacter.flower.printf();
        genshinCharacter.plume.printf();
        genshinCharacter.sands.printf();
        genshinCharacter.goblet.printf();
        genshinCharacter.circlet.printf();
    }


    public static void printfall(GenshinCharacter genshinCharacter,int n){
        double a[] = genshinCharacter.findMax(true,n);
        genshinCharacter.printFindMax(a);
        System.out.println("");

        double r[] = genshinCharacter.getAttrack();

        double deDMG = HitObj.getD(90,90);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2]*deDMG);
        System.out.println("不暴击 " + r[1]*deDMG);
        System.out.println("期望  " +  r[0]*deDMG);

        System.out.println(genshinCharacter);
        System.out.println("");
        System.out.println(genshinCharacter.weapon);
        System.out.println("");
        System.out.println(genshinCharacter.atfitems[0]);
        System.out.println(genshinCharacter.atfitems[1]);
        genshinCharacter.flower.printf();
        genshinCharacter.plume.printf();
        genshinCharacter.sands.printf();
        genshinCharacter.goblet.printf();
        genshinCharacter.circlet.printf();
    }
    public static void printfall(GenshinCharacter genshinCharacter,int n,double d){
        double a[] = genshinCharacter.findMax(true,n);
        genshinCharacter.printFindMax(a);
        System.out.println("");

        double r[] = genshinCharacter.getAttrack();

        double deDMG = HitObj.getD(90,90,d);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2]*deDMG);
        System.out.println("不暴击 " + r[1]*deDMG);
        System.out.println("期望  " +  r[0]*deDMG);

        System.out.println(genshinCharacter);
        System.out.println("");
        System.out.println(genshinCharacter.weapon);
        System.out.println("");
        System.out.println(genshinCharacter.atfitems[0]);
        System.out.println(genshinCharacter.atfitems[1]);
        genshinCharacter.flower.printf();
        genshinCharacter.plume.printf();
        genshinCharacter.sands.printf();
        genshinCharacter.goblet.printf();
        genshinCharacter.circlet.printf();
    }
}
