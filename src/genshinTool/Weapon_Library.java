package genshinTool;


import genshinTool.weapon.Bow.*;
import genshinTool.weapon.Catalyst.*;
import genshinTool.weapon.Sword.*;
import genshinTool.weapon.Polearm.*;
import genshinTool.weapon.Claymore.*;

class  Weapon_Library
{
	
	//单手剑
	public static class Sword {
		public static PanYanJieLu panyanjielu(int lv){ return new PanYanJieLu(lv); }
		public static PanYanJieLu  磐岩结绿(int lv){ return new PanYanJieLu(lv); }
		public static ZhuoFengZhiRen 斫峰之刃(int lv){ return new ZhuoFengZhiRen(lv); }
		public static ZhuoFengZhiRen zhuofengzhiren(int lv){ return new ZhuoFengZhiRen(lv); }
		public static FengYingJian fengyingjian(int lv){ return new FengYingJian(lv); }
		public static TianKongZhiRen tiankongzhiren(int lv){ return new TianKongZhiRen(lv); }
		public static TianKongZhiRen 天空之刃(int lv){ return new TianKongZhiRen(lv); }
		public static XiaLiLongYin xialilongyin(int lv){ return new XiaLiLongYin(lv); }
		public static XiaLiLongYin 匣里龙吟(int lv){ return new XiaLiLongYin(lv); }
		public static HeiJian heijian(int lv){ return new HeiJian(lv); }
		public static HeiJian 黑剑(int lv){ return new HeiJian(lv); }
		public static ShiZuoZhanYan shizuozhanyan(int lv){ return new ShiZuoZhanYan(lv); }
		public static ShiZuoZhanYan 试作斩岩(int lv){ return new ShiZuoZhanYan(lv); }
		public static AnXiangShanGuang anxiangsg(int lv){ return new AnXiangShanGuang(lv); }
		public static AnXiangShanGuang 暗巷闪光(int lv){ return new AnXiangShanGuang(lv); }
	    public static HeiYanJian heiyanchangjian(int lv){ return new HeiYanJian(lv); }
	    public static HeiYanJian 黑岩长剑(int lv){ return new HeiYanJian(lv); }
	    public static DiJian dijian(int lv){ return new DiJian(lv); }
	    public static DiJian 笛剑(int lv){ return new DiJian(lv); }
		public static LiMingShenJian Limingshenjian(int lv){ return new LiMingShenJian(lv); }
		public static LiMingShenJian 黎明神剑(int lv){ return new LiMingShenJian(lv); }	
	    public static WuQie wuqie(int lv){ return new WuQie(lv); }
		public static TianMuYinDaDao Tianmuyindadao(int lv){ return new TianMuYinDaDao(lv); }
	}
	
	//双手剑
	public static class Claymore {
		public static LangDeMoLu langmo(int lv){ return new LangDeMoLu(lv); };
		public static LangDeMoLu 狼的末路(int lv){ return new LangDeMoLu(lv); };
		public static ShiZuoGuHua shizuoguhua(int lv){ return new ShiZuoGuHua(lv);}
		public static ShiZuoGuHua 试作古华(int lv){ return new ShiZuoGuHua(lv);}
		public static WuGongZhiJian wugongjian(int lv){ return new WuGongZhiJian(lv);}
		public static WuGongZhiJian 无工之剑(int lv){ return new WuGongZhiJian(lv);}
		public static SongLai SongLai(int lv){ return new SongLai(lv);}
		public static SongLai 松籁响起之时(int lv){ return new SongLai(lv);}
		public static TianKongZhiAO tiankongzhiao(int lv){ return new TianKongZhiAO(lv); }
		public static TianKongZhiAO 天空之傲(int lv){ return new TianKongZhiAO(lv); }
		public static ChiGuJian chigujian(int lv){ return new ChiGuJian(lv); }
		public static ChiGuJian 螭骨剑(int lv){ return new ChiGuJian(lv); }
		public static QianYanGuJian qianyangujian(int lv){ return new QianYanGuJian(lv); }	
	    public static QianYanGuJian 千岩古剑(int lv){ return new QianYanGuJian(lv); }	
	    public static HeiYanZhanDao heiyanzhandao(int lv){ return new HeiYanZhanDao(lv); }	
		public static HeiYanZhanDao 黑岩斩刀(int lv){ return new HeiYanZhanDao(lv); }	
	    public static XueZangXingYin xuezangxingyin(int lv){ return new XueZangXingYin(lv); }	
		public static XueZangXingYin 雪藏星银(int lv){ return new XueZangXingYin(lv); }	
		public static YuCai yucai(int lv){ return new YuCai(lv); }	
		public static YuCai 雨裁(int lv){ return new YuCai(lv); }	
		public static BaiYinJian baiyingjian(int lv){ return new BaiYinJian(lv); }	
		public static BaiYinJian 白影剑(int lv){ return new BaiYinJian(lv); }	
		
	}
	
	//长枪
	public static class Polearm {
		public static HuMo humo(int lv){ return new HuMo(lv); }
		public static HuMo 护魔之杖(int lv) {  return new HuMo(lv); } 
		public static XiaLiMiechen xialimiechen(int lv){ return new XiaLiMiechen(lv); }
		public static XiaLiMiechen 匣里灭辰(int lv){ return new XiaLiMiechen(lv); }
		public static HePuYuan hepuyuan(int lv){ return new HePuYuan(lv); }
		public static HePuYuan 和璞鸢(int lv){ return new HePuYuan(lv); }
		public static GuanHong guanhong(int lv){ return new GuanHong(lv); }
		public static GuanHong 贯虹之槊(int lv){ return new GuanHong(lv); }
		public static TianKongZhiJi tiankong(int lv){ return new TianKongZhiJi(lv); }
		public static TianKongZhiJi 天空之脊(int lv){ return new TianKongZhiJi(lv); }
		public static JueDouQ juedouqiang(int lv){ return new JueDouQ(lv); }
		public static JueDouQ 角斗之枪(int lv){ return new JueDouQ(lv); }
		public static HeiYanCiQ 黑岩刺枪(int lv){ return new HeiYanCiQ(lv); }
		public static HeiYanCiQ heiyanq(int lv){ return new HeiYanCiQ(lv); }
		public static QianYanChangQ qianyanq(int lv){ return new QianYanChangQ(lv); }
		public static QianYanChangQ 千岩长枪(int lv){ return new QianYanChangQ(lv); }
		public static LiuYueZheng 流月针(int lv){ return new LiuYueZheng(lv); }
		public static LiuYueZheng liuyuezheng(int lv){ return new LiuYueZheng(lv); }
		public static DaoGuang ticaozhidaoguang(int lv){ return new DaoGuang(lv); }
		public static DaoGuang 薙草之稻光(int lv){ return new DaoGuang(lv); }
		public static YuHuo yuhuo(int lv){ return new YuHuo(lv); }
		public static YuHuo 渔获(int lv){ return new YuHuo(lv); }
	}
	
	//法器
	public static class Catalyst {
		public static TianKongZhiJUAN tiankongzhijuan(int lv){ return new TianKongZhiJUAN(lv); }
		public static TianKongZhiJUAN 天空之卷(int lv){ return new TianKongZhiJUAN(lv); }	
		public static SiFengYuanDian sifengyuandian(int lv){ return new SiFengYuanDian(lv); }	
		public static SiFengYuanDian 四风原典(int lv){ return new SiFengYuanDian(lv); }	
		public static ChenSiZhiSuo chensizhisuo(int lv){ return new ChenSiZhiSuo(lv); }	
		public static ChenSiZhiSuo 尘世之锁(int lv){ return new ChenSiZhiSuo(lv); }	
		public static DuDuKe duduke(int lv){ return new DuDuKe(lv); }	
		public static DuDuKe 嘟嘟可故事集(int lv){ return new DuDuKe(lv); }	
		public static XiaLiRiYue xialiriyue(int lv){ return new XiaLiRiYue(lv); }	
		public static XiaLiRiYue 匣里日月(int lv){ return new XiaLiRiYue(lv); }	
		public static HeiYanFeiYu heiyanfeiyu(int lv){ return new HeiYanFeiYu(lv); }	
		public static HeiYanFeiYu 黑岩绯玉(int lv){ return new HeiYanFeiYu(lv); }	
		
	}
	
	//弓
	public static class Bow{
		public static ZhongMo zhongmo(int lv){ return new ZhongMo(lv); }
		public static ZhongMo 终末磋叹之诗(int lv){ return new ZhongMo(lv); }
		public static TianKongZhiYi tiankongzhiyi(int lv){ return new TianKongZhiYi(lv); }
		public static TianKongZhiYi 天空之翼(int lv){ return new TianKongZhiYi(lv); }
		public static AmosiZhiGong amosizhigong(int lv){ return new AmosiZhiGong(lv); }
		public static AmosiZhiGong 阿莫斯之弓(int lv){ return new AmosiZhiGong(lv); }
		public static YouYeHuaErZi youyehuaerzi(int lv){ return new YouYeHuaErZi(lv); }
		public static YouYeHuaErZi 幽夜华尔兹(int lv){ return new YouYeHuaErZi(lv); }
		public static FengHuaZhiSong fenghuazhisong(int lv){ return new FengHuaZhiSong(lv); }
		public static FengHuaZhiSong 风花之颂(int lv){ return new FengHuaZhiSong(lv); }
		public static AnXiangLieShou anxianglieshou(int lv){ return new AnXiangLieShou(lv); }
		public static AnXiangLieShou 暗巷猎手(int lv){ return new AnXiangLieShou(lv); }
		public static ChangCuiLieGong cangcuiliegong(int lv){ return new ChangCuiLieGong(lv); }
		public static ChangCuiLieGong 苍翠猎弓(int lv){ return new ChangCuiLieGong(lv); }
		public static HeiYanZhanGong heiyanzhangong(int lv){ return new HeiYanZhanGong(lv); }
		public static HeiYanZhanGong 黑岩战弓(int lv){ return new HeiYanZhanGong(lv); }
		public static GangLunGong ganglungong(int lv){ return new GangLunGong(lv); }
		public static GangLunGong 钢轮弓(int lv){ return new GangLunGong(lv); }
		public static ShiZuoTanYue shizuotanyue(int lv){ return new ShiZuoTanYue(lv); }
		public static ShiZuoTanYue 试作澹月(int lv){ return new ShiZuoTanYue(lv); }
		public static GongZang gongzang(int lv){ return new GongZang(lv); }
		public static GongZang 弓藏(int lv){ return new GongZang(lv); }
		public static JueXian juexian(int lv){ return new JueXian(lv); }
		public static JueXian 绝弦(int lv){ return new JueXian(lv); }
		public static FeiLeiZhiXianZhen feileizhixianzhen(int lv){ return new FeiLeiZhiXianZhen(lv); }
		public static RouShui rouShui(int lv){ return new RouShui(lv); }
		
	}
}
