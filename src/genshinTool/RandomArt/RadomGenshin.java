package genshinTool.RandomArt;

import genshinTool.Artifacts;

import java.util.*;

//圣遗物强化，出货模拟
public class RadomGenshin
{
	int W[][];
	double value[]; 
	int index;
	double index_radom;
	double index_ex[];
	
	int ATK = 0;
	int ATK100 = 1;
	int HP = 2;
	int HP_100 = 3;
	int RATE = 4;
	int DMG = 5;
	int DEF = 6;
	int DEF100 = 7;
	int EM = 8;
	int PE = 9;
	
	
	int DEF_W = 0;
	int HP_W = 1;
	int ATK_W = 2;
    int PE_EM_W = 3;
	int Crit_W = 4;
	
	public RadomGenshin(){
		
		value = new double[10];
		value[ATK] = 0.145;
		value[DEF] = 0.145;//0.3
		value[HP] = 0.145;//0.45
		value[ATK100] = 0.095;
		value[DEF100] = 0.095;
		value[HP_100] = 0.095;//0.75
		value[EM] = 0.075;
		value[PE] = 0.075;
		value[RATE] = 0.065;
		value[DMG] = 0.065;
		
		index_ex = new double[5];
		index_ex[DEF_W] = value[DEF] + value[DEF100];
		index_ex[HP_W] = index_ex[DEF_W] + value[HP_100] + value[HP];
		index_ex[ATK_W] = index_ex[HP_W] + value[ATK] + value[ATK100];
		index_ex[PE_EM_W] =  index_ex[ATK_W] +  value[PE] + value[EM];
		index_ex[Crit_W] =  value[RATE] + value[DMG];
		
		W = new int[5][2];
		W[DEF_W] = new int[]{DEF,DEF100};
		W[HP_W] = new int[]{HP,HP_100};
		W[ATK_W] = new int[]{ATK,ATK100};
		W[PE_EM_W] = new int[]{PE,EM};
		W[Crit_W] = new int[]{RATE,DMG};
		index_radom = new Random().nextDouble();
		index = getIndex(index_radom);
	}
	
	public int random(){
		int indext = getIndex(d());
		
		nextIndex_Radom();
		index = getIndex(index_radom);
		
		double e = Math.random();
		double r1 = value[ W[indext][0] ];
		double r2 = value[ W[indext][1] ];
		if(r1==r2){
			r1=r2=0.50;
		}
		else{
			double k = 1/(r1+r2);
			r1 = k*r1;
		}
		if(e<r1)
			return W[indext][0];
		else
			return W[indext][1];
	}
	


	//模拟强化一次
	public void rArtifacts( Artifacts artifacts){
		 if(artifacts.differen_ct_n<4){
			 while(true){
				 int index = random();
				 if(artifacts.AllowAdd1(index)){
					 if(artifacts.data_f[index]==0){
						 artifacts.add_Random(index);
						 artifacts.lv+=4;
						 break;
					  }
			       }
			 }
		 }
		 else
		 {
			 nextIndex_Radom();
			 index = getIndex(index_radom);
			 while(true){
			      int indext = getIndex(d());
			 
			      double e = Math.random();
			      double r1 = value[ W[indext][0] ];
			      double r2 = value[ W[indext][1] ];
			      if(r1==r2){
				      r1=r2=0.50;
			      }
			      else{
				      double k = 1/(r1+r2);
				      r1 = k*r1;
			      }
			      if(e<r1 && artifacts.AllowAdd1(W[indext][0])){
				        artifacts.add_Random(W[indext][0]);
					    artifacts.lv+=4;
						break;
				  }
			      else if(artifacts.AllowAdd1(W[indext][1])){
				        artifacts.add_Random(W[indext][1]);
					    artifacts.lv+=4;
						break;
			      }
			 }
		 }
	}
	
	public void rArtifacts(Artifacts artifacts,int n){
		int max_n = (20-artifacts.lv)/4;
		if(n>max_n) n = max_n;
		for(int i=0;i<n;i++){
			rArtifacts(artifacts);
		}
	}


	//随机生成一个圣遗物
	public Artifacts nextArtifacts(){
		int n = 3;
		double e = Math.random()/2 + new Random().nextDouble()/2;
		if(e < 0.2) n = 4;
		Artifacts art = new Artifacts();
		int main_id = random();
	    if(main_id!=6) art.mainID = main_id;
		double main = 0.466;
		switch(main_id){
			case 4: main=0.311; break;
			case 5: main=0.622; break;
			case 0: main=311; break;
			case 8: main=187; break;
			case 9: main=0.518; break;
			case 2: main=4780; break;
		}
		art.main = main;
		for(int i=0;i<n;i++)
			while(true){
		        int index = random();
			    if(art.AllowAdd1(index)){
			       if(art.data_f[index]==0){
				       art.add_Random(index);
					   break;
			        }
			     }
			 
		 }
		return art;
	}
	
	private void nextIndex_Radom(){
		index_radom += Math.random()/8;
		if(index_radom>1) index_radom-=1;
	}

	private int getIndex(double e){
		int r=0;
		if(e>1) e-=1;
		if(e<index_ex[DEF_W]){
			r=DEF_W;
		}
		else if(e<index_ex[HP_W]){
			r=HP_W;
		}
		else if(e<index_ex[ATK_W]){
			r=ATK_W;
		}
		else if(e<index_ex[PE_EM_W]){
			r=PE_EM_W;
		}
		else {
			r=Crit_W;
		}
		return r;
	}
	
	private double d(){
		double d=10;
		while(d>1||d<-1){
			Random r = new Random();
		    d = r.nextGaussian()/15;
		}
		double r = d + index_radom;
		if(r>1){
			r = r-1;
		}else if(r<0){
			r= 1 + r;
		}
		return r;
	}
}
