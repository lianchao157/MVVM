https://www.cnblogs.com/mjbenkyo/p/12067982.html
sql  下  插入 数据循环


foreach的主要用在构建in条件中，它可以在SQL语句中进行迭代一个集合。
foreach元素的属性主要有 item，index，collection，open，separator，close。
item集合中每一个元素进行迭代时的别名，
index表示在迭代过程中，每次迭代到的位置，
open该语句以什么开始，
separator在每次进行迭代之间以什么符号作为分隔 符，
close以什么结束，
在使用foreach的时候最关键的也是最容易出错的就是collection属性，
该属性是必须指定的，但是在不同情况 下，该属性的值是不一样的，
主要有一下3种情况：
1. 如果传入的是单参数且参数类型是一个List的时候，collection属性值为list
2. 如果传入的是单参数且参数类型是一个array数组的时候，collection的属性值为array
3. 如果传入的参数是多个的时候，我们就需要把它们封装成一个Map了
————————————————
版权声明：本文为CSDN博主「zEthan」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/ethan_10/article/details/79729101


2021.9.2
spring boot  计划写查询用户信息
userLoginMapper


<foreach collection="list" item="item" open="(" close=")" separator="," index="">
    #{item.studentId}
</foreach>
解释含义：

foreach的主要用在构建in条件中，它可以在SQL语句中进行迭代一个集合。
foreach元素的属性主要有 item，index，collection，open，separator，close。
item集合中每一个元素进行迭代时的别名，
index表示在迭代过程中，每次迭代到的位置，
open该语句以什么开始，
separator在每次进行迭代之间以什么符号作为分隔 符，
close以什么结束，
在使用foreach的时候最关键的也是最容易出错的就是collection属性，
该属性是必须指定的，但是在不同情况 下，该属性的值是不一样的，
主要有一下3种情况：
1.     如果传入的是单参数且参数类型是一个List的时候，collection属性值为list
2.     如果传入的是单参数且参数类型是一个array数组的时候，collection的属性值为array
3.     如果传入的参数是多个的时候，我们就需要把它们封装成一个Map了
————————————————
版权声明：本文为CSDN博主「心似烟火」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/sz15732624895/article/details/82892283



spring boot 四大特性



cityselect.html
c城市选择代码
在15711247978@163.com 的邮箱下
token

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

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  90 天

spring boot 理解
spring-boot-starter：核心模块，包括自动配置支持、日志和YAML；

spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito。

@RestController的意思就是controller里面的方法都以json格式输出


Validator + BindResult进行校验
Validator可以非常方便的制定校验规则，并自动帮你完成校验。首先在入参里需要校验的字段加上注解,每个注解对应不同的校验规则，并可制定校验失败后的信息：

@Data
public class User {
    @NotNull(message = "用户id不能为空")
    private Long id;

    @NotNull(message = "用户账号不能为空")
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符")
    private String account;

    @NotNull(message = "用户密码不能为空")
    @Size(min = 6, max = 11, message = "密码长度必须是6-16个字符")
    private String password;

    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;
}


校验规则和错误提示信息配置完毕后，接下来只需要在接口需要校验的参数上加上@Valid注解，
并添加BindResult参数即可方便完成验证：
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
        for (ObjectError error : bindingResult.getAllErrors()) {
            return error.getDefaultMessage();
        }
        return userService.addUser(user);
    }
}


14、说明：前10条记录

select top 10 * form table1 where 范围

16、说明：包括所有在 TableA中但不在 TableB和TableC中的行并消除所有重复行而派生出一个结果表(select a from tableA ) except (select a from tableB) except (select a from tableC)

17、说明：随机取出10条数据

select top 10 * from tablenameorder bynewid()
https://www.jianshu.com/p/537d11caf5e6

1),delete from tablename where id not in (select max(id) from tablename group by col1,col2,...)
2),select distinct * into temp from tablename

delete from

tablename

insert into

tablenameselect * from temp

localhost	root	*81F5E21E35407D884A6CD4A731AEBFB6AF209E1B	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y	Y		0x	0x	0x	0	0	0	0		


查看当前数据库的所有表
select table_name from information_schema.tables where table_schema='new_schema'



注解 

@EqualsAndHashCode(callSuper = false)
qualsAndHashCode注解的作用就是自动实现model类的equals方法和hashcode方法


加载工程

    <modules>
        <module>mall-common</module>
        <module>mall-mbg</module>
        <module>mall-security</module>
        <module>mall-demo</module>
        <module>mall-admin</module>
        <module>mall-search</module>
        <module>mall-portal</module>
    </modules>
    
    https://blog.csdn.net/weixin_43314519/article/details/115152850
    sppringboot   d多模块项目部署 
    
    实现 