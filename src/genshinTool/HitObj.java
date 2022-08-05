package genshinTool;

//伤害测试对象，遗迹守卫
public class HitObj
{

	//返回抗性性减伤比例
	public static double getD(int characterLv/*角色等级*/,int lv/*怪物等级*/){
		double r = 1;
		r = (1 - 0.1) * (100 + characterLv) / (lv + characterLv +200 );
		return r;
	}

	public static double getD(int characterLv/*角色等级*/,int lv/*等级*/,double d/*减抗*/){
		double r = 1;
		double k = 0.1 - d;
		if(k < 0) k = k / 2;
		r = (1 - k) * (100 + characterLv) / (lv + characterLv + 200 );
		return r;
	}
	public static double getD(int characterLv/*角色等级*/,int lv/*等级*/,double resist/*抗性*/,double d/*减抗*/){
		double r = 1;
		double k = resist - d;
		if(k < 0) k = k / 2;
		r = (1 - k) * (100 + characterLv) / (lv + characterLv + 200 );
		return r;
	}
	public static double getD(int characterLv/*角色等级*/,int lv/*等级*/,double resist/*抗性*/,double d/*减抗*/,double deDEF/*减防*/){
	double r = 1;
	double k = resist - d;
	if(k < 0) k = k / 2;
	r = (1 - k) * (100 + characterLv) / ( (lv + 100)*(1-deDEF) + characterLv + 100 );
	return r;
   }
	public static double getD(int characterLV){
		return getD(90,characterLV);
	}
}
