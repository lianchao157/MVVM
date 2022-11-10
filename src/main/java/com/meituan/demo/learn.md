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