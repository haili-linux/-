package genshinTool.weapon;

public class Weapon
{
	public String name="";//武器名
	public int ATK_BASE = 0;//基础攻击
	public int ELEMENT_MASTER = 0;//元素精通
	public double ATK_100 = 0;//百分比攻击
	public double RATE = 0; //暴击率
	public double RATE_DMG = 0;//爆伤
	public double HP_100 = 0;//百分比生命
	public double ATK_DMG = 0;//伤害增加
	public double DEFENS_100 = 0;//百分比防御
	public double Power_Efficiency = 0;//充能
    public int lv = 1; //精练数
	
	//武器特殊机制
	public double HP_to_ATK = 0;//生命转攻击，目前只有这个
	public double PE_to_ATK100 = 0;//充能转百分比攻击
	
	
	@Override
	public String toString()
	{
		// TODO: Implement this method
		String r="";
		if(!name.equals("")) r+=name+"(精练"+lv+")";
		if(ATK_BASE >0) r+="\n  攻击: "+ATK_BASE;
		if( ATK_100>0) r+="\n  %攻击: "+ATK_100*100;
		if(RATE >0) r+="\n  暴击率: "+RATE*100;
		if( RATE_DMG >0) r+="\n  暴击伤害: "+ RATE_DMG *100;
		if(ELEMENT_MASTER >0) r+="\n  元素精通: "+ELEMENT_MASTER;
		if(HP_100 >0) r+="\n  %生命值: "+HP_100*100;
		if( DEFENS_100>0) r+="\n  %防御力: "+DEFENS_100*100;
		if( Power_Efficiency>0) r+="\n  元素充能效率%: "+ Power_Efficiency*100;
		if( ATK_DMG >0) r+="\n  %伤害增加: "+ ATK_DMG *100;
		if(r.equals("")) r="null";
		return r;
	}//百分比防御


	
	public void setATK_BASE(int aTK_BASE)
	{
		ATK_BASE = aTK_BASE;
	}

	public int getATK_BASE()
	{
		return ATK_BASE;
	}

	public void setELEMENT_MASTER(int eLEMENT_MASTER)
	{
		ELEMENT_MASTER = eLEMENT_MASTER;
	}

	public int getELEMENT_MASTER()
	{
		return ELEMENT_MASTER;
	}

	public void setATK_100(double aTK_100)
	{
		ATK_100 = aTK_100;
	}

	public double getATK_100()
	{
		return ATK_100;
	}

	public void setRATE(double rATE)
	{
		RATE = rATE;
	}

	public double getRATE()
	{
		return RATE;
	}

	public void setRATE_DMG(double rATE_A)
	{
		RATE_DMG = rATE_A;
	}

	public double getRATE_DMG()
	{
		return RATE_DMG;
	}

	public void setHP_100(double hP_100)
	{
		HP_100 = hP_100;
	}

	public double getHP_100()
	{
		return HP_100;
	}

	public void setATK_DMG(double pULS)
	{
		ATK_DMG = pULS;
	}

	public double getATK_DMG()
	{
		return ATK_DMG;
	}

	public void setDEFENS_100(double dEFENS_100)
	{
		DEFENS_100 = dEFENS_100;
	}

	public double getDEFENS_100()
	{
		return DEFENS_100;
	}}
