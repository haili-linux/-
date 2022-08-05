package genshinTool;

import java.util.Random;

//圣遗物
public class Artifacts
{
	public int lv = 0; //等级
	public int number_t = 0;//副词条总数
	public int differen_ct_n = 0;//副词条种类数，最大为4
	
	String infor="";//说明
	//不考虑其它属性
	final int ATK_ID = 0;//攻击力0
	final int ATK_100_ID = 1;//百分比攻击1
	final int HP_ID = 2; //生命值2
	final int HP_100_ID = 3;//百分比生命3
	final int RATE_ID = 4;//暴击率4
	final int RATE_A_ID = 5;//爆伤5
	final int DEFENSE_ID = 6; //小防御6
	final int DEFENSE_100_ID =7; //百分比防御7
	final int ELEMENT_MASTER_ID = 8;//元素精通
	final int Power_Efficiency_ID = 9;//元素充能效率
	final int Healing_Bonus_ID = 10; //治疗
	public double data_f[] = {0,0,0,0,0,0,0,0,0,0};
	
	double atk_d = 19.45;//攻击力1
	double atk_100_d = 0.0583;//百分比攻击2
	double hp_d = 298.75; //生命值3
	double hp_100_d = 0.0583;//百分比生命4
	double rate_d = 0.0389;//暴击率5
	double rate_a_d = 0.0777;//爆伤
    double defense_d = 23.15; //小防御
	double defense_100_d = 0.0729;//百分比防御
	double element_master_d = 23.31;//元素精通
	double Power_Efficiency_d = 0.0648;//元素充能效率

	public int mainID = -1;  //主词条类型
	public double main = 0;  //主词条数值
	
	
	double atk = 0;//攻击力0
	double atk_100 = 0;//百分比攻击1
	double hp = 0; //生命值2
	double hp_100 = 0;//百分比生命3
	double rate = 0;//暴击率4
	double rate_a = 0;//爆伤5
	double defense = 0; //小防御6
	double defense_100 =0;//百分比防御7
	double element_master = 0;//精通
	double Power_Efficiency = 0;//元素充能效率

	public void printf(){
		System.out.println(toString());
	}
	
	public boolean add(int ID){//取最大值
	     if(differen_ct_n<4 && data_f[ID]==0 && ID!=mainID){
			   differen_ct_n++;
			   data_f[ID]++;
			   number_t++;
			   make();
			   return true;
		  }else{
		     if( number_t<9 && data_f[ID]< 6 && 9-number_t>4-differen_ct_n && ID!=mainID ){
				 data_f[ID]++;
				 number_t++;
				 make();
				 return true;
			   }	 
		 }
		 return false;
	}

	public boolean add_Random(int ID){//随机
		if(ID!=mainID && number_t<9){//和主词条不同
			if(differen_ct_n<4){
				if(data_f[ID]==0){
					differen_ct_n++;
					data_f[ID]++;
					number_t++;
					make_Random(ID);
					return true;
				}
			}
			else
			{
				if(data_f[ID]>0&&data_f[ID]<6){//和某副词条相同
					data_f[ID]++;
					number_t++;
					make_Random(ID);
					return true;
				}
			}
		}
		return false;
	}

	public boolean AllowAdd(int ID){//检测是否可以添加
		if(differen_ct_n<4 && data_f[ID]==0 && ID!=mainID){
			return true;
		}else{
			if( number_t<9 && data_f[ID]< 6 && 9 - number_t > 4 - differen_ct_n && ID!=mainID){
				return true;
			}	 
		}
		return false;
	}

	public boolean AllowAdd1(int ID){//检测是否可以添加
		if(ID!=mainID && number_t<9){//和主词条不同
			if(differen_ct_n<4){
				if(data_f[ID]==0) return true;
			}
			else
			{
				if(data_f[ID]>0&&data_f[ID]<6){//和某副词条相同
					return true;
				}
			}
		}
		return false;
	}

	/*public boolean AllowAdd(int ID){//检测是否可以添加
		if(ID!=mainID){//和主词条不同
			if(data_f[ID]>0&&data_f[ID]<6){//和某副词条相同
				return true;
			}
			if(data_f[ID]==0){//新词条
				if(differen_ct_n<4) return true;
			}
		}
		return false;
	}*/


	public boolean delect1(int id){
		if(data_f[id]>0){
			data_f[id]--;
			number_t--;
			if(data_f[id]==0) differen_ct_n--;
			make();
			return true;
		}
		return false;
	}
	
	private void make(){//最大值
		  atk = data_f[ATK_ID] * atk_d;
		  atk_100 = data_f[ATK_100_ID] * atk_100_d;
		  hp = data_f[HP_ID] * hp_d;
		  hp_100 = data_f[HP_100_ID] * hp_100_d;
		  rate = data_f[RATE_ID] * rate_d;
		  rate_a = data_f[RATE_A_ID] * rate_a_d;
		  defense = data_f[DEFENSE_ID] * defense_d;
		  defense_100 = data_f[DEFENSE_100_ID] * defense_100_d;
		  element_master = data_f[ELEMENT_MASTER_ID] * element_master_d;
		  Power_Efficiency = data_f[Power_Efficiency_ID] * Power_Efficiency_d;
	}

	private void make_Random(int n){
		Random random = new Random();
		int d_int = random.nextInt(4) + 7;
		double d = (double) d_int / 10;
		switch (n) {
			case ATK_ID:
				atk += atk_d * d; break;
			case ATK_100_ID:
			    atk_100 += atk_100_d * d;
				break;
			case HP_ID:
				hp += hp_d * d;
				break;
			case HP_100_ID:
				hp_100 += hp_100_d * d;
				break;
			case RATE_ID:
				rate += rate_d * d;
				break;
			case RATE_A_ID:
				rate_a += rate_a_d * d;
				break;
			case DEFENSE_100_ID:
				defense_100 += defense_100_d * d;
				break;
			case  DEFENSE_ID:
				defense += defense_d * d;
				break;
			case ELEMENT_MASTER_ID:
				element_master += element_master_d * d;
				break;
			case Power_Efficiency_ID:
				Power_Efficiency += Power_Efficiency_d * d;
				break;
		}
	}
	@Override
	public String toString()
	{   //输出详细信息
		// TODO: Implement this method
		String r = infor+"\n";
		switch (mainID){
			case -1:       r+= "  元素/物理伤害增加: "+ main*100 +"%\n"; break;
			case ATK_ID :  r+= "  攻击力: "+ main +"\n" ; break;
			case ATK_100_ID:r+=   "  攻击力: "+ main*100 +"%\n"; break;
			case HP_ID :   r+=     "  生命值: "+ main +"\n"; break;
			case HP_100_ID : r+= "  生命值: "+ main*100 +"%\n"; break;
		    case RATE_ID :r+=  "  暴击率: "+ main*100 +"%\n"; break;
			case RATE_A_ID: r+= "  暴击伤害: "+ main*100 +"%\n" ; break;
			case DEFENSE_100_ID: r+="  防御力: "+ main*100 +"%\n"; break;
			case ELEMENT_MASTER_ID: r+="  元素精通: "+ main +"\n"; break;
			case Power_Efficiency_ID: r+= "  元素充能效率: "+ d2f(main*100,3) +"%\n" ; break;
			case Healing_Bonus_ID: r+= "  治疗加成: " + d2f(main*100,3) + "%\n" ; break;
		}
		if( atk >0) r+="    攻击力+"+d2f(atk,2)+"\n";
		if(  atk_100 >0){
			r+=  "    攻击力+"+d2f(atk_100*100,3) +"%\n";
	    }
		if( hp  >0)  r+= "    生命值+"+ d2f(hp,2)+"\n";
		if( hp_100  >0){
			r+=  "    生命值+"+ d2f(hp_100*100,3)+"%\n";
		}
		if(rate   >0)
		{
			r+=    "    暴击率+"+ d2f(rate*100,3) +"%\n";
		}
		if( rate_a  >0) {

			r+= "    暴击伤害+"+ d2f(rate_a*100,3)+"%\n";
		}
		if(defense >0) r+= "    防御力+"+ d2f(defense,2) +"\n";

		if(defense_100 >0){

		    r+="    防御力+"+d2f(defense_100*100,3) +"%\n";
		}
		if(element_master >0) r+= "    元素精通+"+ d2f(element_master,2) +"\n";
		if(Power_Efficiency > 0){
			r+="    元素充能效率+"+d2f(Power_Efficiency*100,3) +"%\n";
		}
		return r;
	}

	
	public void setMainID(int mainID)
	{
		this.mainID = mainID;
	}

	public int getMainID()
	{
		return mainID;
	}
	public void setInfor(String infor)
	{
		this.infor = infor;
	}

	public String getInfor()
	{
		return infor;
	}

	private static String d2f(double a,int d){
		String r = a + "";
		if(r.indexOf(".")+d<r.length())
		{
			return r.substring(0,r.indexOf(".")+d);
		}
		return r;
	}
}
