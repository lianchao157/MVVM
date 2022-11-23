博客地址：https://www.jianshu.com/p/e88d3f8151db

https://github.com/JinBinPeng/springboot-jwt


知乎循环删除数据
https://zhuanlan.zhihu.com/p/93310283





美团     

https://www.cnblogs.com/lauren1003/p/8432442.html
巨长的url
https://github.com/zq2599/blog_demos


一个具有 swagger 2 的类

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

android  改变testview  字体大小方法
public class ChangedSizeTextView extends TextView {

	public ChangedSizeTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	public ChangedSizeTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public ChangedSizeTextView(Context context) {
		super(context);
		init(context);
	}

	/**
	 * 方法名: init
	 * 
	 * 功能描述:初始化
	 * 
	 * @param context
	 *            上下文对象
	 * @return void
	 * 
	 *         
throws
	 */
	private void init(Context context) {
		this.context = context;
	}

	private Context context;

	/**
	 * 方法名: changedSize
	 * 
	 * 功能描述:动态改变字体大小
	 * 
	 * @return void
	 * 
	 *         
throws
	 */
	private void changedSize() {
		if (this.getText().toString().length() >= 10) {// 如果字数大于10,则设置为单行
			this.setSingleLine();
			return;
		}
		int textPx = PxDpSp.sp2px(context, this.getTextSize());// 得到字体的大小
		if (textPx > this.getWidth()) {// 判断字体的大小是否超过控件的大小
			this.setTextSize(PxDpSp.px2sp(context, this.getWidth() - 20));// 如果超过,则根据控件的大小设置字体的大小
		}
		if (textPx > this.getHeight()) {
			this.setTextSize(PxDpSp.px2sp(context, this.getHeight() - 20));// 如果超过,则根据控件的大小设置字体的大小
		}
	}

	@Override
	public void setText(CharSequence text, BufferType type) {
		super.setText(text, type);
		changedSize();
	}
}

方法 2 
etTextSize(TypedValue.COMPLEX_UNIT_PX,22); //22像素

setTextSize(TypedValue.COMPLEX_UNIT_SP,22); //22SP

setTextSize(TypedValue.COMPLEX_UNIT_DIP,22);//22DIP


  <TextView
                                    android:layout_width="0dp"
                                    android:layout_height="wrap_content"
                                    
                                    android:autoSizeMaxTextSize="12sp"
                                    android:autoSizeMinTextSize="5sp"
                                    android:autoSizeStepGranularity="1sp"
                                    android:autoSizeTextType="uniform"
                                    android:maxLines="1"
 
                                    android:gravity="center_vertical"
                                    android:paddingLeft="23dp"
                                    android:text="天天优惠不能错过"
                                    android:textColor="#ffffffff"
                                    android:textSize="12sp"
                                  />
————————————————
版权声明：本文为CSDN博主「我的安卓之路」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_35644925/article/details/125222910


拦截器
.过滤器（Filter）：所谓过滤器顾名思义是用来过滤的，Java的过滤器能够为我们提供系统级别的过滤，也就是说，能过滤所有的web请求，
这一点，是拦截器无法做到的。在Java Web中，你传入的request,response提前过滤掉一些信息，或者提前设置一些参数，然后再传入servlet或
者struts的action进行业务逻辑，比如过滤掉非法url（不是login.do的地址请求，如果用户没有登陆都过滤掉）,或者在传入servlet或者struts
的action前统一设置字符集，或者去除掉一些非法字符（聊天室经常用到的，一些骂人的话）。filter 流程是线性的，url传来之后，检查之后，
可保持原来的流程继续向下执行，被下一个filter, servlet接收。
    2.监听器（Listener）：Java的监听器，也是系统级别的监听。监听器随web应用的启动而启动。Java的监听器在c/s模式里面经常用到，它
会对特定的事件产生产生一个处理。监听在很多模式下用到，比如说观察者模式，就是一个使用监听器来实现的，在比如统计网站的在线人数。
又比如struts2可以用监听来启动。Servlet监听器用于监听一些重要事件的发生，监听器对象可以在事情发生前、发生后可以做一些必要的处理。
    3.拦截器（Interceptor）：java里的拦截器提供的是非系统级别的拦截，也就是说，就覆盖面来说，拦截器不如过滤器强大，但是更有针对性。
Java中的拦截器是基于Java反射机制实现的，更准确的划分，应该是基于JDK实现的动态代理。它依赖于具体的接口，在运行期间动态生成字节码。
拦截器是动态拦截Action调用的对象，它提供了一种机制可以使开发者在一个Action执行的前后执行一段代码，也可以在一个Action执行前阻止其
执行，同时也提供了一种可以提取Action中可重用部分代码的方式。在AOP中，拦截器用于在某个方法或者字段被访问之前，进行拦截然后再之前或
者之后加入某些操作。java的拦截器主要是用在插件上，扩展件上比如 Hibernate Spring Struts2等，有点类似面向切片的技术，在用之前先要在
配置文件即xml，文件里声明一段的那个东西。
————————————————
版权声明：本文为CSDN博主「pmdream」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/pmdream/article/details/90482965


项目模板 各种学习例子
https://blog.csdn.net/yunli0/article/details/117817987


1Android 的混合地图



1. 通知权限
新的WiFi权限运行机制：
3. 更细分的媒体权限
除了通知权限和WiFi权限的更新外，Android13对本地数据访问权限也做了进一步细化。
Android13将READ_EXTERNAL_STORAGE和 WRITE_EXTERNAL_STORAGE权限细分为：READ_MEDIA_IMAGES、 READ_MEDIA_VIDEO和 READ_MEDIA_AUDIO，如下图：
4. 精确的闹钟权限
为了节省系统资源，Android12引入了SCHEDULE_EXACT_ALARM权限进行“闹钟和提醒”功能的授权管理。Android13则又引入了新的闹钟权限USE_EXACT_ALARM。
后台传感器权限
App在后台运行时，如果需要获取心率、体温、血氧饱和度等传感器信息，将不仅需要向用户申请现有的BODY_SENSORS权限，还必须声明新的BODY_SENSORS_BACKGROUND权限
.2 前台服务(FGS)任务管理器

https://github.com/cloudamqp/android-example/blob/master/cloudAMQP/src/com/cloudamqp/androidexample/ActivityHome.java
我们发现，单独请求READ_MEDIA_IMAGES、单独请求 READ_MEDIA_VIDEO和同时请求READ_MEDIA_IMAGES& READ_MEDIA_VIDEO，系统均将只显示一个授权弹窗。 
另外，如果App（targetSdk == 33）已经申请了读的权限，那App同时也就有了写的权限，无需再额外声明 WRITE_EXTERNAL_STORAGE权限，代码如下：
<manifest ...>
    <uses-permission android:name="android.permission.READ_MEDIA_IMAGES" />
    <uses-permission android:name="android.permission.READ_MEDIA_AUDIO" />
    <uses-permission android:name="android.permission.READ_MEDIA_VIDEO" />

    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"
                       android:maxSdkVersion="32" />
</manifest>

为了节省系统资源，Android12引入了SCHEDULE_EXACT_ALARM权限进行“闹钟和提醒”功能的授权管理。Android13则又引入了新的闹钟权限USE_EXACT_ALARM。

通知权限
对存储区按照优先级别从搞到底排序 优先级越低发你去内额app 限制越低
活跃
工作集
常用 少用

受限制：  无法启动前台服务  前台服务从前台移除 不处罚闹钟 并不执行jobs
Android13新增了以下规则，符合相应规则的应用将进入到“受限”存储分区
（设备处于关闭状态的时间不会计入互动限制）：


4  对 non-sdk 几口限制更新
Landroid/app/Activity;->setDisablePreviewScreenshots(Z)V # Use setRecentsScreenshotEnabled() instead.
Landroid/os/PowerManager;->isLightDeviceIdleMode()Z # Use isDeviceLightIdleMode() instead.
Landroid/os/Process;->setArgV0(Ljava/lang/String;)V # In general, do not try to change the process name. If you must change the process name (for instance, for debugging), you can use pthread_setname_np() instead, though be aware that doing this might confuse the system.
Landroid/view/accessibility/AccessibilityInteractionClient;->clearCache(I)V # Use android.accessibilityservice.AccessibilityService#clearCache() instead.

3
功能更新
1. 剪切板
确认内容已成功复制。
提供所复制内容的预览
2  Jetpack WindowManager  app 实现多个activity 同屏幕显示 比如并排或者堆叠
3 支持大屏幕和平坝
4更好兼容





1. @Api: 用在请求的类上，表示对类的说明

tags="说明该类的作用，可以在前台界面上看到的注解"
value="该参数无意义，在UI界面上看不到，不需要配置"
2. @ApiModelProerty:用在属性上，面熟响应类的属性

3. @ApiModel: 用在响应类上，表示一个返回响应数据的信息

一般用在post 创建，使用@RequestBody的时候
请求参数无法使用@ApiImplicitParam
4. @ApiResponses: 用在请求的方法上，表示一组响应

5. @ApiResponse: 用在@ApiResponses 中，一般用于表达一个错误的响应信息
————————————————
版权声明：本文为CSDN博主「天黑请赶路」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_42468607/article/details/115715021
2022.11.7
返回给Android 一个网页
  
  sql  查询的应用
  https://blog.csdn.net/huzecom/article/details/103254074?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-1-103254074-blog-121772040.pc_relevant_3mothn_strategy_and_data_recovery&spm=1001.2101.3001.4242.2&utm_relevant_index=4
 
 2022.11.21  sql 语句  类型
 tinyint 十分小的数据 1个字节
 smallint 较小的数据 2个字节
 mediumint 中等大小的数据 3个字节
 int 标准的整数 4个字节 常用的
 bigint 较大的数据 8个字节
 float 浮点数 4个字节
 double 浮点数 8个字节
 decimal 字符串形式的浮点数 金融计算的时候 一般用decimal
 ————————————————
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 字符串和文本
 char 字符串固定大小 0~255
 varchar 可变字符串大小 0~65535 对应String
 tinytest 微型文本 2^8-1
 test 文本串 2^16 -1 保存大文本
 
 时间 日期
 data YYYY-MM-DD，日期格式
 
 time HH:mm:ss
 datetime YYYY-MM-DD HH:mm:ss 最常用的时间格式
 timestamp 时间戳 1970.1.1到现在的毫秒数 较为常用
 year 年份标识
 
 
CREATE TABLE IF NOT EXISTS `student`(
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` VARCHAR(30) NOT NULL DEFAULT'匿名' COMMENT'姓名',
  `paw` VARCHAR(20) NOT NULL DEFAULT'123456' COMMENT'密码',
  `sex` VARCHAR(2) NOT NULL DEFAULT'女' COMMENT'性别',
  `birthday` DATETIME DEFAULT NULL COMMENT'出生日期',
  `address` VARCHAR(100) DEFAULT NULL COMMENT'家庭住址',
  `email` VARCHAR(50) DEFAULT NULL COMMENT'邮箱',
  PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8
create table [if not exists] `表名`(
  `字段名` 列表名 [属性] [索引] [注释],
  `字段名` 列表名 [属性] [索引] [注释],
  ......
  `字段名` 列表名 [属性] [索引] [注释]
)[表类型][字符设置][注释]
  ————————————————
  原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
  
  
  show create database school  -- 查看创造数据库的语句
  show create table student -- 查看student数据表定义的语句
  desc student -- 显示表的结构
  
  
  数据表的类型
  -- 关于数据库引擎
  /*
  INNODB 默认使用
  MYISAM 早些年用的
  */
 
 
 MYISAM 节约空间，速度较快
 INNODB 安全性高，事务的处理，多表多用户操作
 
 
 修改表明  aleter table 旧的名REnAME AS   新表名
 
 ALTER TABLE teacher RENAME AS teacher1
 -- 增加表的字段 ALTER TABLE 表名 ADD 字段名 列属性
 ALTER TABLE teacher1 ADD age INT(11)
 -- 修改表的字段（重命名，修改约束）
 -- ALTER TABLE 表名 MODIFY 字段名 列属性[]
 ALTER TABLE teacher1 MODIFY age VARCHAR(11) -- 修改约束
 -- ALTER TABLE 表名 CHANGE 旧名字 新名字 列属性[]
 ALTER TABLE teacher1 CHANGE age age1 INT(11) -- 重命名，
  
 -- 删除表的字段 表名 ALTER TABLE 表名 DROP 字段名
 ALTER TABLE teacher1 DROP age1
 
 ————————————————
 -- 删除表 DROP TABLE 表名(如果表存在再删除)
 DROP TABLE [if exists] teacher1
 
 insert
 
 语法：INSERT INTO 表名 ([列1],[列2],[列3]) VALUES ('字段1','字段2','字段3'),('字段1','字段2','字段3')
 
 -- 一般写插入语句，我们一定要数据和字段一一对应！
 -- INSERT INTO 表名 ([列1],[列2],[列3]) VALUES ('字段1','字段2','字段3'),('字段1','字段2','字段3')
 INSERT INTO grade (gradename) VALUES ('大二'),('大三')
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 
 
 update 修改谁 （条件） set原来的值=新值
 
 -- 修改学院名字，带了简介
 UPDATE `student` SET `name`='狂神'WHERE id=1;
  
 -- 不指定条件的情况下，会改动所有的值
 UPDATE `student` SET `name`='长江7号'
  
 -- 语法：
 
 ————————————————
 
 
 --  删除数据（避免这样写，会全部删除）
 delete from `student`
  
 -- 删除指定数据
 delete from `student` where id=1;
 
 
 TRUNCATE命令
 
 作用：完全清空数据库，表的结构和索引约束不会变！
 
 -- 清空student表
 TRUNCATE `student`
 delete和TRUNCATE不同
 
 不同
 TRUNCATE 重新设置自增列 计数器会归零
 TRUNCATE 不会影响事务
 DELETE FROM `test` -- 不会影响自增
 TRUNCATE TABLE `table` -- 自增会归零
 ————————————————
 
-- 查询全部的学生 select 字段 from 表
SELECT * FROM student
 
-- 查询指定字段
SELECT `studentno`,`studentname` FROM student 
 
-- 别名，给结果起一个名字 AS
SELECT `studentno` AS 学号,`studentname`
AS 学生姓名 FROM student -- 表也可以加AS 给表起一个别名
 
-- 函数 concat(a,b)
SELECT CONCAT('姓名：',studentname) AS 新名字 FROM student
————————————————
版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。

 
-- 查询一下有哪些同学参加了考试
SELECT * FROM result -- 查询全部的考试成绩
SELECT `studentno` FROM result 
-- 去重复
SELECT DISTINCT `studentno` FROM result 
 
SELECT VERSION() -- 查询系统版本(函数)
 
SELECT 100*3-1 AS 计算结果 -- 用来计算(表达式)
 
SELECT @@auto_increment_increment  -- 查询自增的步长（变量）
————————————————
 
 -- 模糊查询
 -- like结合 %(代表0到人一个字符) _(代表一个字符)
 -- in(具体的一个值或者多个值)
  -----------------------------------------------
 -- 联表查询 join  
 -- join（连接的表） on（判断的条件） 连接查询
 -- where 等值查询
 SELECT s.studentno,studentname,subjectno,studentresult
 FROM student AS s
 INNER JOIN result AS r
 WHERE s.studentno = r.studentno
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 
 
 
 /*
 1. 分析需求，分析查询的字段来自哪些表
 2.确定使用哪种连接查询？7种
 确定交叉点（这两个表中哪个数据是相同的）
 判断的条件： 学生表中 studentNo = 成绩表中 studentNo 
 */
  
 -- JION（表） ON （判断的条件）连接查询
 -- where 等值查询
 SELECT studentNo,studentName,SubjectNo,StudentResult
 FROM student AS s
 INNER JOIN result AS r
 WHERE s.studentNo=r.studentNo
  
 --Right Join
 SELECT s.studentNo,studentName,SubjectNo,StudentResult
 FROM student AS s
 RIGHT JOIN result AS r
 ON s.studentNo = r.studentNo
  
 --LEFT Join
 SELECT s.studentNo,studentName,SubjectNo,StudentResult
 FROM student AS s
 LEFT JOIN result AS r
 ON s.studentNo = r.studentNo
  
 
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 -- 查询父子信息
  
 SELECT a.`categroryName` AS `父栏目`,b.`categroryName` AS `子栏目`
 FROM `catgroy` AS a,`catgroy` AS b
 WHERE a.`categoryid`=b.`pid`
 
 
 
 
  为什么要分页
 -- 缓解数据库压力，给人的体验更好
  
  分页和排序
 -- 分页，每页显示五条数据
  
 -- 语法： limit 当前页，页面的大小
 -- limit 0,5 1-5
 -- limit 1,5 1-5
 -- limit 6,5
 SELECT s.`StudentNo`,`StudentName`,`SubjectName`,`StudentResult`
 FROM student s
 INNER JOIN `result` r
 ON s.`StudentNo`=r.`StudentNo`
 INNER JOIN `subject` sub
 ON r.`subjectNo`=sub.`subjectNo`
 WHERE subjectName='数据结构-1'
 ORDER BY StudentResult ASC
 LIMIT 0,5
  
 -- 第一页 limit 0,5
 -- 第二页 limit 5,5
 -- 第三页 limit 10,5
 
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 where (这个值是计算出来的)
 本质：在where语句中嵌套一个子查询语句
 
 
 
 
 -- 1.查询 数据库结构-1的所有考试结构（学号，科目编号，成绩） 降序
 -- 方式一： 连接查询
 SELECT `StudentNo`,r.`SubjectName`,`StudentResult`
 FROM `result` r
 INNER JOIN `subject` sub
 ON r.SubjectNo = sun.SubjectNo
 WHERE subjectName = '数据库结构-1'
 ORDER BY StudentResult DESC
  
 -- 方式二：使用子查询(由里及外)
 SELECT `StudentNo`,r.`SubjectName`,`StudentResult`
 FROM `result`
 WHERE StudentNo=(
 	SELECT SubjectNo FROM  `subject` 
     WHERE SubjectName = '数据库结构-1'
 )
 ORDER BY StudentResult DESC
  
  
 -- 分数不少于80分的学生的学号和姓名
 SELECT DISTINCT s.`StudentNo`,`StudentName`
 FROM student s
 INNER JOIN result r
 ON r.StudentNo = s.StudentNo
 WHERE StudentResult>=80
  
 -- 在这个基础上 增加一个科目 ，高等数学-2
 SELECT DISTINCT s.`StudentNo`,`StudentName`
 FROM student s
 INNER JOIN result r
 ON r.StudentNo = s.StudentNo
 WHERE StudentResult>=80 AND `SubjectNo`=(
     SELECT Subject FROM `subject`
     WHERE SubjectName='高等数学-2'
 )
  
 -- 查询课程为 高等数学-2 且分数不小于80分的同学的学号和姓名
 SELECT s.`StudentNo`,`StudentName`
 FROM student s
 INNER JOIN result r
 ON s.StudentNo = r.StudentNo
 INNER JOIN `subject` sub
 ON r.`SubjectName`='高等数学-2'
 WHERE `SubjectaName`='高等数学-2' AND StudentResult >=80
  
  
 -- 再改造 (由里即外)
 SELECT `StudentNo`,`StudentName` FROM student
 WHERE StudentNo IN(
 SELECT StudentNo result WHERE StudentResult >80 AND SubjectNo =(
 SELECT SubjectNo FROM `subject` WHERE `SubjectaName`='高等数学-2'
 )
 )
 
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 
 
 -- 查询不同课程的平均分，最高分，最低分，平均分大于80
 -- 核心：（根据不同的课程分组）
  
 SELECT `SubjectName`,AVG(StudentResult),MAX(StudentResult)
 FROM result r
 INNER JOIN `Subject` sub
 ON r.SubjectNo=sub.SubjectNo
  
 GROUP BY r.SubjectNo -- 通过什么字段来分组
 HAVING AVG(StudentResult)>80
 ————————————————
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 常用函数
 
 
 SELECT ABS(-8) -- 绝对值
 SELECT CEILING(9.4) -- 向上取整
 SELECT FLOOR(9.4)  -- 向下取整
 SELECT RAND() -- 返回0-1随机数
 SELECT SIGN(-10) -- 判断一个数的符号 0-0 负数返回-1 正数返回1
  
 -- 字符串函数
 SELECT CHAR_LENGTH('2323232') -- 返回字符串长度
 SELECT CONCAT('我','233') -- 拼接字符串
 SELECT INSERT('java',1,2,'cccc') -- 从某个位置开始替换某个长度
 SELECT UPPER('abc') 
 SELECT LOWER('ABC')
 SELECT REPLACE('坚持就能成功','坚持','努力')
  
 -- 查询姓 周 的同学 ，改成邹
 SELECT REPLACE(studentname,'周','邹') FROM student
 WHERE studentname LIKE '周%'
  
 -- 时间跟日期函数（记住）
 SELECT CURRENT_DATE() -- 获取当前日期
 SELECT CURDATE() -- 获取当前日期
 SELECT NOW() -- 获取当前日期
 SELECT LOCATIME()  -- 本地时间
 SELECT SYSDATE()  -- 系统时间
  
 SELECT YEAR(NOW())
 SELECT MONTH(NOW())
 SELECT DAY(NOW())
 SELECT HOUR(NOW())
 SELECT MINUTE(NOW())
 SELECT SECOND(NOW())
  
 -- 系统
 SELECT SYSTEM_USER()
 SELECT USER()
 SELECT VERSION()
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 2022.11.22
 **MD5破解原理，背后有一个字典，MD5加密后的值，加密前的值**
 
 CREATE TABLE `testmd5`(
 `id` INT(4) NOT NULL,
 `name` VARCHAR(20) NOT NULL,
 `pwd` VARCHAR(50) NOT NULL,
 PRIMARY KEY (`id`)
  
 )ENGINE=INNODB DEFAULT CHARSET=UTF8
  
  
 -- 明文密码
 INSERT INTO testmd5 VALUES(1,'张三','123456'),(2,'李四','123456'),(3,'王五','123456')
  
 -- 加密
 UPDATE testmd5 SET pwd=MD5(pwd) WHERE id =1
 UPDATE testmd5 SET pwd=MD5(pwd) WHERE id !=1  -- 加密全部
  
 -- 插入时加密
  
 INSERT INTO testmd5 VALUES(4,'小明',MD5('123456'))
 INSERT INTO testmd5 VALUES(5,'红',MD5('123456'))
  
 -- 如何校验，将用户传递过来的密码，进行MD5加密，然后对比加密后的值
 SELECT * FROM testmd5 WHERE `name`='红' AND pwd=MD5('123456')
 ————————————————
 
 事务
 要么都成功要么都失败
 
 事务原则：ACID原则 原子性，一致性，隔离性，持久性
 
 
 
 
 -- mysql 是默认开启事务自动提交的
  
 SET autocommit = 0; /* 关闭 */
 SET autocommit = 1; /* 开启(默认的) */
  
 -- 手动处理事务
 SET autocommit = 0; -- 先关闭自动条件
 -- 事务开始
 START TRANSACTION  -- 标记一个事物的开始，从这之后的sql都在一个事物内
  
  
 -- 提交： 持久化（成功！）
 COMMIT
  
 -- 回滚： 回到原来的样子（失败！）
 ROLLBACK
  
 --事物结束
 SET autocommit = 1; -- 结束后开启自动提交
  
 -- 了解
 SAVEPOINT 保存点名  -- 设置一个事物的保存点
 ROLLBACK SAVEPOINT -- 回滚到保存点
 RELEASE SAVEPOINT -- 撤销保存点
 
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 索引的分类
 主键索引 (PRIMARY KEY)
 
 主键不可重复
 唯一索引 (UNIQUE KEY)
 
 避免重复的列出现，唯一索引可以重复，多个列都可以标识位
 
 常规索引 （KEY/INEDEX）
 全文索引 FULLTEXT
 
 SHOW INDEX FROM student  -- 显示所有的索引信息
  
 -- 增加一个全文索引 （索引名）列名
 ALTER TABLE school.`student` ADD FULLTEXT INDEX `wuhu`(`studentname`)
  
 -- EXPLAIN 分析sql执行的状况
 EXPLAIN SELECT * FROM student;  -- 非全文索引
  
 EXPLAIN SELECT * FROM student WHERE MATCH
 ————————————————
 
 
 
 SHOW INDEX FROM student  -- 显示所有的索引信息
  
 -- 增加一个全文索引 （索引名）列名
 ALTER TABLE school.`student` ADD FULLTEXT INDEX `wuhu`(`studentname`)
  
 -- EXPLAIN 分析sql执行的状况
 EXPLAIN SELECT * FROM student;  -- 非全文索引
  
 EXPLAIN SELECT * FROM student WHERE MATCH
 ————————————————
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 创建数据库
 
 -- 创建用户
 CREATE USER shijie IDENTIFIED BY '123456'
  
 -- 修改密码(修改当前用户密码)
 SET PASSWORD = PASSWORD('123456')
  
 -- 修改密码（修改指定用户密码）
 SET PASSWORD FOR shijie = PASSWORD('123456')
  
 -- 重命名  RENAME USER 原用户名 TO 新用户名
 RENAME USER shijie TO shijie2
  
 -- 用户授权  GRANT ALL PRIVILEGES（全部权限）库.表 TO 用户
 -- ALL PRIVILEGES 除了给别人授权，其他都能干
 GRANT ALL PRIVILEGES *.* TO -- 全部库，全部表
  
 -- 查询权限 SHOW GRANTS FOR 用户
 SHOW GRANTS FOR kuangshen -- 查看指定用户的权限
 SHOW GRANTS FOR root@localhost -- root用户要加@地址
  
 -- 撤销权限 REVOKE 权限，在哪个库，哪个表撤销，给谁撤销
 REVOKE ALL PRIVILEGES ON *.* FROM shijie
  
 -- 删除用户
 DROP USER shijie 
 ————————————————
 版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 
  MySQL备份
  
  MySQL数据库备份方式
  
  直接拷贝物理文件
  
  在可视化工具上导出
  
  使用命令行导出 mysqldump 命令行 cmd才叫命令行
  
  # mysqldump -h 主机 -u 用户名 -p密码 数据库 表 > 物理磁盘位置/文件名
  # mysqldump -h 主机 -u 用户名 -p密码 数据库 表1 表2 表3 > 物理磁盘位置/文件名
  # mysqldump -h 主机 -u 用户名 -p密码 数据库> 物理磁盘位置/文件名
   
  # 导入
  # 登录的情况下，切换到指定的数据库
  # source 备份文件
  source d:a.sql
  ————————————————
  原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
  
  JDBC（重点）
  jdbc
  
  创建测试数据库
  
  1、创建一个普通项目
  
  2、导入数据库驱动
  
  步骤总结：
  
  1、加载驱动
  
  2、链接数据库DriverManager
  
  3、执行sql的对象
  
  4、获得返回的结果集
  
  5、释放链接
  
  Connection connection = DriverManager.getConnection(url, username, password);
  // 设置自动提交
  // 事务提交
  // 事务回滚
  connection.setAutoCommit();
  connection.rollback();
  connection.commit();
  ————————————————
  版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
  原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
  
  statement.executeQuery();//查询操作返回ResultSet
  statement.execute();//执行任何sql
  statement.executeUpdate();//更新、插入、删除都用这个，返回一个受影响的行数
  
  resultSet查询的结果集：封装了所有的查询结果
  
  resultSet.getObject();//不知道列类型用Object
  resultSet.getString();//知道的时候用指定类型
  resultSet.beforeFirst();// 移动到最前面
  resultSet.afterLast();// 移动到最后面
  resultSet.next(); //移动到下一个
  resultSet.previous();//移动到前一行
  resultSet.absolute();//移动到指定行
  释放资源
  
  resultSet.close();
  statement.close();
  connection.close(); // 耗资源，用完关
  ————————————————
  版权声明：本文为CSDN博主「毫无感情的dj」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
  原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
  
  使用IDEA链接数据库
  错误因为时区问题
  
  ?serverTimezone=GMT%2B8
  
  连接成功后，查看数据库

 
 
 适当的数据冗余
 适当拆分
 执行计划
 explain select * from emp;
 
 id:选择标识符
 id
 
 SELECT识别符。这是SELECT的查询序列号
 
 我的理解是SQL执行的顺序的标识，SQL从大到小的执行
 
 id相同时，执行顺序由上至下
 
 如果是子查询，id的序号会递增，id值越大优先级越高，越先被执行
 
 id如果相同，可以认为是一组，从上往下顺序执行；在所有组中，id值越大，优先级越高，越先执行
 
 select_type:表示查询的类型。
 (1) SIMPLE(简单SELECT，不使用UNION或子查询等)
 
 (2) PRIMARY(子查询中最外层查询，查询中若包含任何复杂的子部分，最外层的select被标记为PRIMARY)
 
 (3) UNION(UNION中的第二个或后面的SELECT语句)
 
 (4) DEPENDENT UNION(UNION中的第二个或后面的SELECT语句，取决于外面的查询)
 
 (5) UNION RESULT(UNION的结果，union语句中第二个select开始后面所有select)
 
 (6) SUBQUERY(子查询中的第一个SELECT，结果不依赖于外部查询)
 
 (7) DEPENDENT SUBQUERY(子查询中的第一个SELECT，依赖于外部查询)
 
 (8) DERIVED(派生表的SELECT, FROM子句的子查询)
 
 (9) UNCACHEABLE SUBQUERY(一个子查询的结果不能被缓存，必须重新评估外链接的第一行)
 ————————————————
 原文链接：https://blog.csdn.net/wudidahuanggua/article/details/125351062
 
 
 
 
 启镱圣洪福 永学宝德清 殿臣树风久 家国世文明 兴宗先兆如长
 辽宁
 
 1、朝阳：启镱圣洪福 永学宝德清 殿臣树风久 家国世文明 兴宗先兆如长
 含墨书山振万邦
 http://www.360doc.com/content/21/0317/19/31463172_967480185.shtml
 
 
2022. 11.9v1  图片存放
  -----------------------------------
        <!--SpringBoot上传图片-->
        <!--https://blog.51cto.com/u_15466961/5275011-->
        
        解决
        Error:java: target level should be comprised in between '1.1' and '1.9' (or '5', '5.0', ..., '9' or '9.0') or cldc1.1: 11
        https://blog.csdn.net/LG_49/article/details/77936945?spm=1001.2101.3001.6650.2&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-2-77936945-blog-82262798.pc_relevant_3mothn_strategy_and_data_recovery&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-2-77936945-blog-82262798.pc_relevant_3mothn_strategy_and_data_recovery&utm_relevant_index=3
        
        
        
        
2022.11.10  8
导出文件sprinboot   简书https://www.jianshu.com/p/69a0a55ac300        



面试 知识点
https://blog.csdn.net/wo_ha
android  的

下载文件乱码问题  存放


2022.11.16 
parameterType属性用在哪里？为什么要使用这个属性？
parameterType属性用在mapper.xml文件中的select标签，insert标签，update等标签中。
确定的，比如条件，要插入的数据等。这些可以理解为就是参数。
怎么把JAVA程序中的对象作为SQL语句中的参数呢？怎么传进去呢？也可以说，
我们通过JAVA程序将参数传入到mapper.xml文件中的SQL语句里面

2. @GetMapping：支持get请求方式，等同于RequestMapping(method=RequestMethod.GET)

3. @PostMapping：支持post请求方式，等同于RequestMapping(method=RequestMethod.POST)

4. @PutMapping：支持put请求方式，等同于RequestMapping(method=RequestMethod.PUT)

5. @DeleteMapping：支持delete请求方式，等同于RequestMapping(method=RequestMethod.DELETE)

6. @RestController：添加在类上，相当于同时在类上加了@Controller和@ResponseBody注解
————————————————
版权声明：本文为CSDN博主「Archer__13」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/Archer__13/article/details/126890628

API（应用程序接口）：可以访问controller的url

例如：传统架构：http://localhost:8080/user?name=Tom&age=20，则换成RESTful架构为：http://localhost:8080/user/Tom/20

db2 的链接
https://www.starxz.com/pjjc/7767.html





2022.11.21
狂神说java
的java 配置
https://blog.csdn.net/qq_48575500/article/details/125008623
tag 的使用
https://blog.csdn.net/weixin_40482816/article/details/123295563


push tags
不提交到远程仓库
commit 的同时提交才勾选
如果选all   不属于当前分支也会提交到远程仓库
Current Branch，那么就只会提交当前分支的Tag。
一般提交代码时，是不用勾选Push Tags的。

https://www.cnblogs.com/Dr-Y/p/16196254.html
create patch  创建补丁
 创建补丁
从提交历史中创建
在 git 日志中选择要创建补丁的commit，右键选择Create Patch...
同一个文件在多次commit中都存在，取到的是最新的内容。



token值
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