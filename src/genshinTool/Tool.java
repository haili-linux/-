package genshinTool;

public class Tool {
    public static void printfall(GenshinCharacter ayaka) {
        double a[] = ayaka.findMax(true, 45);
        ayaka.printFindMax(a);
        System.out.println("");

        double r[] = ayaka.getAttrack();

        double deDMG = HitObj.getD(90, 90);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2] * deDMG);
        System.out.println("不暴击 " + r[1] * deDMG);
        System.out.println("期望  " + r[0] * deDMG);

        System.out.println(ayaka);
        System.out.println("");
        System.out.println(ayaka.weapon);
        System.out.println("");
        System.out.println(ayaka.atfitems[0]);
        System.out.println(ayaka.atfitems[1]);
        ayaka.flower.printf();
        ayaka.plume.printf();
        ayaka.sands.printf();
        ayaka.goblet.printf();
        ayaka.circlet.printf();
    }
    public static void printfall(GenshinCharacter ayaka, int n) {
        double a[] = ayaka.findMax(true, n);
        ayaka.printFindMax(a);
        System.out.println("");

        double r[] = ayaka.getAttrack();

        double deDMG = HitObj.getD(90, 90);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2] * deDMG);
        System.out.println("不暴击 " + r[1] * deDMG);
        System.out.println("期望  " + r[0] * deDMG);

        System.out.println(ayaka);
        System.out.println("");
        System.out.println(ayaka.weapon);
        System.out.println("");
        System.out.println(ayaka.atfitems[0]);
        System.out.println(ayaka.atfitems[1]);
        ayaka.flower.printf();
        ayaka.plume.printf();
        ayaka.sands.printf();
        ayaka.goblet.printf();
        ayaka.circlet.printf();
    }
    public static void printfall(GenshinCharacter ayaka, int n, double d) {
        double a[] = ayaka.findMax(true, n);
        ayaka.printFindMax(a);
        System.out.println("");

        double r[] = ayaka.getAttrack();

        double deDMG = HitObj.getD(90, 90, d);
        //System.out.println(deDMG);
        System.out.println("暴击   " + r[2] * deDMG);
        System.out.println("不暴击 " + r[1] * deDMG);
        System.out.println("期望  " + r[0] * deDMG);

        System.out.println(ayaka);
        System.out.println("");
        System.out.println(ayaka.weapon);
        System.out.println("");
        System.out.println(ayaka.atfitems[0]);
        System.out.println(ayaka.atfitems[1]);
        ayaka.flower.printf();
        ayaka.plume.printf();
        ayaka.sands.printf();
        ayaka.goblet.printf();
        ayaka.circlet.printf();
    }
}
