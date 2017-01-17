package com.sc.news.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class News {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"0d68d1ca9e6a4c680d24d5b5dda3a428","title":"甘肃敦煌现\u201c超大圆月\u201d 与大漠雪景相映成趣","date":"2017-01-16 08:59","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116085915791.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_48544949cfce32263fb7a2501d9fcdd2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_163f4321632b6d6cefc710f14d85d9ba_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_a32aeb876423c17241cb1cbf2cc5947d_3_mwpm_03200403.jpeg"},{"uniquekey":"a505c9a743e9ccc229743ca86816cee5","title":"Robert Carroll：杜比影院豪华设计体验全新视听 满足多种观影方式","date":"2017-01-16 09:05","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116090528337.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116090528_5a825cb4a3df7727f0be024aba40c431_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116090528_5a825cb4a3df7727f0be024aba40c431_2_mwpm_03200403.jpeg"},{"uniquekey":"c7026046774dd87d27125e8bd83a4cb1","title":"专家：提高辩护率是防冤错案关键","date":"2017-01-16 08:55","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116085555506.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116085555_eb4cd0885139f1221ca79a8dca3702c5_1_mwpm_03200403.jpeg"},{"uniquekey":"c03773746bc0c852b37bf0c89a33dfc6","title":"苏瑞穿无袖裙双手抱臂取暖 看着都觉得好冷\u2026","date":"2017-01-16 08:45","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170116084512509.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_3_mwpm_03200403.jpeg"},{"uniquekey":"fdb4fa2f5b7fa022297db77fc1a9ab4d","title":"女星铁道旁拍照惹众怒 警铃大响浑然不知已触法","date":"2017-01-16 08:44","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116084445016.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116084445_2e1922376edac848a9e4a94e0f02a115_1_mwpm_03200403.jpeg"},{"uniquekey":"86ceaf1d673660569ea122c7a9823fe4","title":"杨幂最新封面大片曝光 冷艳动人干练简约","date":"2017-01-16 08:35","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116083521967.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_ce5f664e60f1853abe441d3bc4038f3d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_8b104f61f259602a7b1f76bcaa4b6c21_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_acaf194b351c5567da633939b1a5f25f_3_mwpm_03200403.jpeg"},{"uniquekey":"0d7d9f5f29f65ce45fc8fbd01425faf7","title":"美国民众抵制反移民计划 不会让特朗普埋葬自由女神","date":"2017-01-16 08:34","category":"头条","author_name":"人民网-美国频道","url":"http://mini.eastday.com/mobile/170116083418425.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116083418_fc8aa8271a2652597359b7e979d12ebe_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170116/20170116083418_fc8aa8271a2652597359b7e979d12ebe_2_mwpm_03200403.jpeg"},{"uniquekey":"470718dea3f40b9eeed7f327688ef644","title":"钟汉良拍吻戏却被肚腩抢镜 小鲜肉也有同款肚子","date":"2017-01-16 08:31","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116083155655.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_2_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_3_mwpm_03200403.png"},{"uniquekey":"390f44dc98f16cf9f588bcc7e6b92867","title":"特朗普\u201c纵论天下\u201d：必须扭转美对华贸易逆差","date":"2017-01-16 08:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116083149055.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116083149_c5c0385bff05acf3f73f5be3b5c3984b_1_mwpm_03200403.png"},{"uniquekey":"bd22db8e006d344931a0d997be668448","title":"美中央情报局局长警告特朗普：别再口不择言","date":"2017-01-16 08:31","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170116083144994.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116083144_85323116f5c40e2906e70d80c00cc7ef_1_mwpm_03200403.jpeg"},{"uniquekey":"2dd6c012151be70bd46894210e90a0ae","title":"\u201c老漂\u201d：流动大军中的银发族","date":"2017-01-16 08:29","category":"头条","author_name":"界面网络","url":"http://mini.eastday.com/mobile/170116082925667.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116082925_ee0c3ad16b12ec73c6e363093a37cdee_1_mwpm_03200403.jpeg"},{"uniquekey":"d64fde73d664952277feaee9cfed7ce4","title":"舒淇素颜抱猫出镜 猫咪都被她的颜值吓到了","date":"2017-01-16 08:25","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116082510695.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_3_mwpm_03200403.jpeg"},{"uniquekey":"4c4b3f5c4d9e52537362136e3b898971","title":"赵平：影视业的发展对声音技术提出了新的挑战","date":"2017-01-16 08:17","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116081719196.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116081719_d031e63d514df09bfde89a81e41be1e5_1_mwpm_03200403.jpeg"},{"uniquekey":"6fe486226bf172f3ec4465fdc9c71172","title":"FCA被指操纵尾气排放 或面临46亿美元罚款","date":"2017-01-16 08:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116081604524.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116081604_463be668ec5c5e7d456265b0e72493d1_1_mwpm_03200403.jpeg"},{"uniquekey":"0455c74b9b37102c641438bbcee5051d","title":"丰田发布雅力士高性能版 将亮相日内瓦车展","date":"2017-01-16 08:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116081604084.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116081604_0f6dd72df09bc248729b864f35b4502b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170116/20170116081604_0f6dd72df09bc248729b864f35b4502b_2_mwpm_03200403.jpeg"},{"uniquekey":"facd78dfac5255430b8e5bc73796d455","title":"国外发明不会倒的自行车，人人都能学会骑车 ！","date":"2017-01-16 08:10","category":"头条","author_name":"中关村在线","url":"http://mini.eastday.com/mobile/170116081018736.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116081018_8dea02029c0c383c8068646c8aeb6759_1_mwpm_03200403.jpeg"},{"uniquekey":"9ee7660f29e649f1633a97d04943cfb8","title":"中国最大的县级区","date":"2017-01-16 08:09","category":"头条","author_name":"花様旅人","url":"http://mini.eastday.com/mobile/170116080921914.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_3_mwpm_03200403.jpeg"},{"uniquekey":"bbee49d6c393b46245ef7f7bb2496a4e","title":"这个女子只是在肚子上画了几笔，没想到却意外爆红！","date":"2017-01-16 08:07","category":"头条","author_name":"带你看世界咯","url":"http://mini.eastday.com/mobile/170116080721780.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116_c8591ba67a6c19357a3285eec02dd9bf_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170116/20170116_cc761a0c6384aa25a499e51d60f3d5bc_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170116/20170116_55d79fdf69b91819e1e42cd78e1d0c97_cover_mwpm_03200403.jpeg"},{"uniquekey":"9c2d11eff8ca83b8693fa10e44a58a4f","title":"俄媒称德国人反对美军重回欧洲：让他们滚吧！","date":"2017-01-16 08:05","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116080542184.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170116/20170116080542_81bc3b82a8207699dabe7671e257da64_1_mwpm_03200403.jpeg"},{"uniquekey":"58ac1856e82d3ffcca83228cba8a957f","title":"发展电动汽车分时租赁，上海政协委员建议让非公有制资本参与","date":"2017-01-16 08:03","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116080308220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116080308_4f8ab7af91a3041a4513adf1f3beea57_1_mwpm_03200403.jpeg"},{"uniquekey":"8cf1314a7e7a0b6593e67fbe94a338d6","title":"男子钓鱼听到巨响以为是大鱼，看清后却不禁勃然色变","date":"2017-01-16 08:02","category":"头条","author_name":"视野看点资讯","url":"http://mini.eastday.com/mobile/170116080230842.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116_226040dc290b2df13b15227fe4d2f663_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116_a6d447f429850dafed87d1db06fe7618_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116_72f897c13f3a135987024a9f6355ad85_cover_mwpm_03200403.png"},{"uniquekey":"30fe9ddbfaca3e74168634eb33b8d45c","title":"邓紫棋秀事业线不慎腰带滑落 机智的她完美破尴尬","date":"2017-01-16 08:00","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170116080022358.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_3_mwpm_03200403.jpeg"},{"uniquekey":"30867d7c5cc7c732832e1d386249bf32","title":"陶炳兰少将出任南部战区陆军副司令 履历显赫","date":"2017-01-16 07:57","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116075733447.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116075733_189874a4a0f36f81564bfefa00c1e4dd_1_mwpm_03200403.jpeg"},{"uniquekey":"e25defb493a6ecd06bbeb4aeffb05e0b","title":"祸不单行？英皇演唱会张敬轩被除名 逛街满脸愁容","date":"2017-01-16 07:57","category":"头条","author_name":"东网","url":"http://mini.eastday.com/mobile/170116075712243.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116075712_7ce82f9e60e0a3b2bdbeeecc63be581f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170116/20170116075712_7ce82f9e60e0a3b2bdbeeecc63be581f_2_mwpm_03200403.jpeg"},{"uniquekey":"e9a9b2b6f3266dba0eb873e58a6eb1f1","title":"安倍与印尼总统会谈 拟推动海上安全等领域合作","date":"2017-01-16 07:54","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116075409935.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116075409_da74ee9a65b953192a2c7b99f21fa2ef_1_mwpm_03200403.jpeg"},{"uniquekey":"30b21cb7af0dc396ffa19054544a359a","title":"评论：一些人鼓吹的\u201c司法独立\u201d偷换概念夹带政治私货","date":"2017-01-16 07:54","category":"头条","author_name":"@最高人民法院","url":"http://mini.eastday.com/mobile/170116075406805.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116075406_55d4d2314fd2a98a1c9ca18cdeeb42d5_1_mwpm_03200403.jpeg"},{"uniquekey":"8832d9bd7106921664603ee85c8d1939","title":"瑞中协会主席托马斯·瓦格纳：我永远是中国人民的好朋友","date":"2017-01-16 07:45","category":"头条","author_name":"人民日报","url":"http://mini.eastday.com/mobile/170116074509418.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116074509_91efd9345668d1e78d2b4d1e7e815ab2_1_mwpm_03200403.jpeg"},{"uniquekey":"0be76fe23ed39af499f667d6003dbbc1","title":"华北东北等地出现轻雾或霾 河北山西等地有重污染","date":"2017-01-16 07:44","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116074405084.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116074405_d734b7d52db68982c563326ae968f4d4_1_mwpm_03200403.jpeg"},{"uniquekey":"2e09ca208e48d2f401e1db773732f073","title":"邹市明：我参加《爸爸去哪儿》回来 一样拿冠军","date":"2017-01-16 07:41","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116074144862.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_3_mwpm_03200403.jpeg"},{"uniquekey":"56c6bd01e9616360fe23cd02ecabde32","title":"中国10年内造6艘航母  前2艘出击方案曝光","date":"2017-01-16 07:32","category":"头条","author_name":"刀口谈兵","url":"http://mini.eastday.com/mobile/170116073258961.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_3_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"0d68d1ca9e6a4c680d24d5b5dda3a428","title":"甘肃敦煌现\u201c超大圆月\u201d 与大漠雪景相映成趣","date":"2017-01-16 08:59","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116085915791.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_48544949cfce32263fb7a2501d9fcdd2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_163f4321632b6d6cefc710f14d85d9ba_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116085915_a32aeb876423c17241cb1cbf2cc5947d_3_mwpm_03200403.jpeg"},{"uniquekey":"a505c9a743e9ccc229743ca86816cee5","title":"Robert Carroll：杜比影院豪华设计体验全新视听 满足多种观影方式","date":"2017-01-16 09:05","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116090528337.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116090528_5a825cb4a3df7727f0be024aba40c431_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116090528_5a825cb4a3df7727f0be024aba40c431_2_mwpm_03200403.jpeg"},{"uniquekey":"c7026046774dd87d27125e8bd83a4cb1","title":"专家：提高辩护率是防冤错案关键","date":"2017-01-16 08:55","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116085555506.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116085555_eb4cd0885139f1221ca79a8dca3702c5_1_mwpm_03200403.jpeg"},{"uniquekey":"c03773746bc0c852b37bf0c89a33dfc6","title":"苏瑞穿无袖裙双手抱臂取暖 看着都觉得好冷\u2026","date":"2017-01-16 08:45","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170116084512509.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170116/20170116084512_95f53314d68b78c9dbc3055e57407eae_3_mwpm_03200403.jpeg"},{"uniquekey":"fdb4fa2f5b7fa022297db77fc1a9ab4d","title":"女星铁道旁拍照惹众怒 警铃大响浑然不知已触法","date":"2017-01-16 08:44","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116084445016.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116084445_2e1922376edac848a9e4a94e0f02a115_1_mwpm_03200403.jpeg"},{"uniquekey":"86ceaf1d673660569ea122c7a9823fe4","title":"杨幂最新封面大片曝光 冷艳动人干练简约","date":"2017-01-16 08:35","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116083521967.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_ce5f664e60f1853abe441d3bc4038f3d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_8b104f61f259602a7b1f76bcaa4b6c21_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116083521_acaf194b351c5567da633939b1a5f25f_3_mwpm_03200403.jpeg"},{"uniquekey":"0d7d9f5f29f65ce45fc8fbd01425faf7","title":"美国民众抵制反移民计划 不会让特朗普埋葬自由女神","date":"2017-01-16 08:34","category":"头条","author_name":"人民网-美国频道","url":"http://mini.eastday.com/mobile/170116083418425.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116083418_fc8aa8271a2652597359b7e979d12ebe_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170116/20170116083418_fc8aa8271a2652597359b7e979d12ebe_2_mwpm_03200403.jpeg"},{"uniquekey":"470718dea3f40b9eeed7f327688ef644","title":"钟汉良拍吻戏却被肚腩抢镜 小鲜肉也有同款肚子","date":"2017-01-16 08:31","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116083155655.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_2_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170116/20170116083155_844af5020d8f449e73e1ff097ccf7795_3_mwpm_03200403.png"},{"uniquekey":"390f44dc98f16cf9f588bcc7e6b92867","title":"特朗普\u201c纵论天下\u201d：必须扭转美对华贸易逆差","date":"2017-01-16 08:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116083149055.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116083149_c5c0385bff05acf3f73f5be3b5c3984b_1_mwpm_03200403.png"},{"uniquekey":"bd22db8e006d344931a0d997be668448","title":"美中央情报局局长警告特朗普：别再口不择言","date":"2017-01-16 08:31","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170116083144994.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116083144_85323116f5c40e2906e70d80c00cc7ef_1_mwpm_03200403.jpeg"},{"uniquekey":"2dd6c012151be70bd46894210e90a0ae","title":"\u201c老漂\u201d：流动大军中的银发族","date":"2017-01-16 08:29","category":"头条","author_name":"界面网络","url":"http://mini.eastday.com/mobile/170116082925667.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116082925_ee0c3ad16b12ec73c6e363093a37cdee_1_mwpm_03200403.jpeg"},{"uniquekey":"d64fde73d664952277feaee9cfed7ce4","title":"舒淇素颜抱猫出镜 猫咪都被她的颜值吓到了","date":"2017-01-16 08:25","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116082510695.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170116/20170116082510_d3ab32c4391972092bb7655fbc96f5b4_3_mwpm_03200403.jpeg"},{"uniquekey":"4c4b3f5c4d9e52537362136e3b898971","title":"赵平：影视业的发展对声音技术提出了新的挑战","date":"2017-01-16 08:17","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170116081719196.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116081719_d031e63d514df09bfde89a81e41be1e5_1_mwpm_03200403.jpeg"},{"uniquekey":"6fe486226bf172f3ec4465fdc9c71172","title":"FCA被指操纵尾气排放 或面临46亿美元罚款","date":"2017-01-16 08:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116081604524.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116081604_463be668ec5c5e7d456265b0e72493d1_1_mwpm_03200403.jpeg"},{"uniquekey":"0455c74b9b37102c641438bbcee5051d","title":"丰田发布雅力士高性能版 将亮相日内瓦车展","date":"2017-01-16 08:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116081604084.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116081604_0f6dd72df09bc248729b864f35b4502b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170116/20170116081604_0f6dd72df09bc248729b864f35b4502b_2_mwpm_03200403.jpeg"},{"uniquekey":"facd78dfac5255430b8e5bc73796d455","title":"国外发明不会倒的自行车，人人都能学会骑车 ！","date":"2017-01-16 08:10","category":"头条","author_name":"中关村在线","url":"http://mini.eastday.com/mobile/170116081018736.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116081018_8dea02029c0c383c8068646c8aeb6759_1_mwpm_03200403.jpeg"},{"uniquekey":"9ee7660f29e649f1633a97d04943cfb8","title":"中国最大的县级区","date":"2017-01-16 08:09","category":"头条","author_name":"花様旅人","url":"http://mini.eastday.com/mobile/170116080921914.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170116/20170116080921_4ce11f8028909f30b3e9028da780e19d_3_mwpm_03200403.jpeg"},{"uniquekey":"bbee49d6c393b46245ef7f7bb2496a4e","title":"这个女子只是在肚子上画了几笔，没想到却意外爆红！","date":"2017-01-16 08:07","category":"头条","author_name":"带你看世界咯","url":"http://mini.eastday.com/mobile/170116080721780.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116_c8591ba67a6c19357a3285eec02dd9bf_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170116/20170116_cc761a0c6384aa25a499e51d60f3d5bc_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170116/20170116_55d79fdf69b91819e1e42cd78e1d0c97_cover_mwpm_03200403.jpeg"},{"uniquekey":"9c2d11eff8ca83b8693fa10e44a58a4f","title":"俄媒称德国人反对美军重回欧洲：让他们滚吧！","date":"2017-01-16 08:05","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170116080542184.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170116/20170116080542_81bc3b82a8207699dabe7671e257da64_1_mwpm_03200403.jpeg"},{"uniquekey":"58ac1856e82d3ffcca83228cba8a957f","title":"发展电动汽车分时租赁，上海政协委员建议让非公有制资本参与","date":"2017-01-16 08:03","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116080308220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116080308_4f8ab7af91a3041a4513adf1f3beea57_1_mwpm_03200403.jpeg"},{"uniquekey":"8cf1314a7e7a0b6593e67fbe94a338d6","title":"男子钓鱼听到巨响以为是大鱼，看清后却不禁勃然色变","date":"2017-01-16 08:02","category":"头条","author_name":"视野看点资讯","url":"http://mini.eastday.com/mobile/170116080230842.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116_226040dc290b2df13b15227fe4d2f663_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116_a6d447f429850dafed87d1db06fe7618_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116_72f897c13f3a135987024a9f6355ad85_cover_mwpm_03200403.png"},{"uniquekey":"30fe9ddbfaca3e74168634eb33b8d45c","title":"邓紫棋秀事业线不慎腰带滑落 机智的她完美破尴尬","date":"2017-01-16 08:00","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170116080022358.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116080022_a635f8fec99e1cb9841cb5ef37f4956a_3_mwpm_03200403.jpeg"},{"uniquekey":"30867d7c5cc7c732832e1d386249bf32","title":"陶炳兰少将出任南部战区陆军副司令 履历显赫","date":"2017-01-16 07:57","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170116075733447.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170116/20170116075733_189874a4a0f36f81564bfefa00c1e4dd_1_mwpm_03200403.jpeg"},{"uniquekey":"e25defb493a6ecd06bbeb4aeffb05e0b","title":"祸不单行？英皇演唱会张敬轩被除名 逛街满脸愁容","date":"2017-01-16 07:57","category":"头条","author_name":"东网","url":"http://mini.eastday.com/mobile/170116075712243.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116075712_7ce82f9e60e0a3b2bdbeeecc63be581f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170116/20170116075712_7ce82f9e60e0a3b2bdbeeecc63be581f_2_mwpm_03200403.jpeg"},{"uniquekey":"e9a9b2b6f3266dba0eb873e58a6eb1f1","title":"安倍与印尼总统会谈 拟推动海上安全等领域合作","date":"2017-01-16 07:54","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116075409935.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170116/20170116075409_da74ee9a65b953192a2c7b99f21fa2ef_1_mwpm_03200403.jpeg"},{"uniquekey":"30b21cb7af0dc396ffa19054544a359a","title":"评论：一些人鼓吹的\u201c司法独立\u201d偷换概念夹带政治私货","date":"2017-01-16 07:54","category":"头条","author_name":"@最高人民法院","url":"http://mini.eastday.com/mobile/170116075406805.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170116/20170116075406_55d4d2314fd2a98a1c9ca18cdeeb42d5_1_mwpm_03200403.jpeg"},{"uniquekey":"8832d9bd7106921664603ee85c8d1939","title":"瑞中协会主席托马斯·瓦格纳：我永远是中国人民的好朋友","date":"2017-01-16 07:45","category":"头条","author_name":"人民日报","url":"http://mini.eastday.com/mobile/170116074509418.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170116/20170116074509_91efd9345668d1e78d2b4d1e7e815ab2_1_mwpm_03200403.jpeg"},{"uniquekey":"0be76fe23ed39af499f667d6003dbbc1","title":"华北东北等地出现轻雾或霾 河北山西等地有重污染","date":"2017-01-16 07:44","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170116074405084.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170116/20170116074405_d734b7d52db68982c563326ae968f4d4_1_mwpm_03200403.jpeg"},{"uniquekey":"2e09ca208e48d2f401e1db773732f073","title":"邹市明：我参加《爸爸去哪儿》回来 一样拿冠军","date":"2017-01-16 07:41","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170116074144862.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170116/20170116074144_6da78f198674cb0ee27b5de6978a5b13_3_mwpm_03200403.jpeg"},{"uniquekey":"56c6bd01e9616360fe23cd02ecabde32","title":"中国10年内造6艘航母  前2艘出击方案曝光","date":"2017-01-16 07:32","category":"头条","author_name":"刀口谈兵","url":"http://mini.eastday.com/mobile/170116073258961.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170116/20170116073258_1b94665bcded0b69ab9e0f8391035ad4_3_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * uniquekey : 0d68d1ca9e6a4c680d24d5b5dda3a428
             * title : 甘肃敦煌现“超大圆月” 与大漠雪景相映成趣
             * date : 2017-01-16 08:59
             * category : 头条
             * author_name : 中国新闻网
             * url : http://mini.eastday.com/mobile/170116085915791.html
             * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170116/20170116085915_48544949cfce32263fb7a2501d9fcdd2_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170116/20170116085915_163f4321632b6d6cefc710f14d85d9ba_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170116/20170116085915_a32aeb876423c17241cb1cbf2cc5947d_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
