<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lxh
  Date: 2021/7/14
  Time: 上午10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body>
<div class="head">

    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a href="index.html"></a></h1>
            <div class="fr clearfix" id="top1"><p class="fl">
                <c:if test="${isLogin !=1 }">
                    <a href="login.jsp" id="login">登录</a><a href="reg.jsp" id="reg">注册</a>

                </c:if>

                <c:if test="${isLogin ==1 }">
                    <b>你好：</b><a href="login.jsp" id="login">${name.USER_NAME }</a>

                </c:if>

                <c:if test="${isAdminLogin ==1 }">
                    <a href="manage/admin_index.jsp" id="login1">进入后台</a>

                </c:if>
            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="热门搜索：干花花瓶"/><input
                        type="button"/></form>
                <div class="btn fl clearfix"><a href="mygxin.jsp"><img src="img/grzx.png"/></a><a href="#" class="er1"><img
                        src="img/ewm.png"/></a>
                    <c:if test="${isLogin ==1 }">
                        <a href="cart.html"><img src="img/gwc.png"/></a>
                    </c:if>

                    <p><a href="#"><img src="photo/李.jpg"/></a></p></div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="index.html">首页</a></li>
            <li><a href="#">所有招聘行业</a>
                <div class="sList">
                    <div class="wrapper  clearfix"><a href="paint.html">
                        <dl>
                            <dt><img src="img/nav1.jpg"/></dt>
                            <dd>IT互联网</dd>
                        </dl>
                    </a><a href="paint.html">
                        <dl>
                            <dt><img src="img/nav2.jpg"/></dt>
                            <dd>医疗健康</dd>
                        </dl>
                    </a><a href="paint.html">
                        <dl>
                            <dt><img src="img/nav3.jpg"/></dt>
                            <dd>教育培训</dd>
                        </dl>
                    </a><a href="paint.html">
                        <dl>
                            <dt><img src="img/nav6.jpg"/></dt>
                            <dd>高级管理行业</dd>
                        </dl>
                    </a><a href="paint.html">
                        <dl>
                            <dt><img src="img/nav7.jpg"/></dt>
                            <dd>娱乐传媒</dd>
                        </dl>
                    </a></div>
                </div>
            </li>
            <li><a href="flowerDer.html">IT行业</a>
                <div class="sList2">
                    <div class="clearfix"><a href="proList.html">传统行业</a><a href="vase_proList.html">互联网行业</a></div>
                </div>
            </li>
            <li><a href="decoration.html">服务行业</a>
                <div class="sList2">
                    <div class="clearfix"><a href="zbproList.html">旅游业</a><a href="bzproList.html">餐饮业</a></div>
                </div>
            </li>
            <li><a href="paint.html">教育行业</a></li>
            <li><a href="perfume.html">高级管理行业</a></li>
            <li><a href="idea.html">主播行业</a></li>
        </ul>
    </div>
</div><!-----------------address------------------------------->
<div class="address">
    <div class="wrapper clearfix"><a href="index.html">首页</a><span>/</span><a
            href="flowerDer.html">个人信息</a><span>/</span><a href="proList.html">信息确认提交</a><span>/</span><a href="#"
                                                                                                        class="on">【等待审核】</a>
    </div>
</div><!-----------------------Detail------------------------------>
    <div class="detCon">
        <div class="proDet wrapper">
            <div class="proCon clearfix">
                <div class="proImg fl"><img class="det" src="img/temp/互联网.jpeg"/>
                    <div class="smallImg clearfix"><img src="img/temp/加入我们.jpg"
                                                        data-src="img/temp/加入我们.jpg"><img
                            src="img/temp/互联网2.jpeg" data-src="img/temp/互联网2.jpeg"><img
                            src="img/temp/互联网1.jpeg" data-src="img/temp/互联网1.jpeg"><img
                            src="img/temp/互联网.jpeg" data-src="img/temp/互联网.jpeg"></div>
                </div>
                <div class="fr intro">
                    <div class="title"><h4>【DIDI】</h4>
                        <p>【DIDI温馨提示】【请按照下列要求依次填写并提交即可！】【请填写正常使用的邮箱号码，我司会在一周之内以方法送邮箱的方式答复】【祝您好运！！】</p>
                        <br>
               <%//从session中取出date并使用ArrayList将object强转
                   ArrayList date= (ArrayList) request.getAttribute("date");
                   System.out.println(date);
                   //遍历
                   for (int i=0;i<date.size();i++){
                       String str= (String) date.get(i);
                       out.println(str+"<br>");
                   }
               %>
                    </div>
                    <div class="proIntro"><strong>个人信息</strong>
                    </div>

                    <form action="CustomerInformation" method="post" onsubmit="return checkForm(this)"><h1><a href="index.html"></a></h1>
                        <div>
                            <p><label>用户名：</label><input type="text" name="id" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入用户名"><span></span></p>
                            <!-- onfocus="FocusItem(this)" onblur="CheckItem(this)"AJax验证-->
                            <p><label>姓名：</label><input type="text" name="name" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入姓名"><span></span></p>
                            <p><label>phone：</label><input type="text" name="phone" value=""onfocus="FocusItem(this)" onblur="CheckItem(this)"  placeholder="请输入手机号码"><span></span></p>
                            <p><label>出生年月日：</label><input type="text" name="birthday" value="" onfocus="c.show(this)" placeholder="请输出生日期"><span></span></p>

                        </div>

                        <!--   <p><input type="text" name="rePassWord" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输确认密码"><span></span></p>-->
                        <label>
                            <p>
                                <input style="width:15px;height:15px" type="radio" name="sex" value="T" checked="checked">男
                                <input style="width:15px;height:15px" type="radio" name="sex" value="F" >女
                            </p>
                        </label>
                        <p><label>现居住地：</label><input type="text" name="address" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入居住地"><span></span></p>
                        <p><label>邮箱：</label><input type="text" name="email" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入邮箱"><span></span></p>

                        <p><label>意向城市：</label><input type="text" name="PermanentAddress" value="" placeholder="请输入意向城市"><span></span></p>
                        <div class="dropdown">
                            <p><label>期望薪资：</label><input type="text" name="salary" value="" placeholder="薪资"><span></span></p>
                        </div>


                        </p>
                        <p><input type="submit" name="" value="提交申请"></p>
                    </form>
                </div>

                </div>
            </div>

        </div>
    </div>
</div>
<div class="gotop"><a href="showcart">
    <dl>
        <dt><img src="img/简历logo.jpeg"/></dt>
        <dd>DIDI<br/>简历</dd>
    </dl>
</a><a href="#" class="dh">
    <dl>
        <dt><img src="img/gt2.png"/></dt>
        <dd>联系<br/>客服</dd>
    </dl>
</a><a href="mygxin.html">
    <dl>
        <dt><img src="img/gt3.png"/></dt>
        <dd>个人<br/>中心</dd>
    </dl>
</a><a href="#" class="toptop" style="display: none;">
    <dl>
        <dt><img src="img/gt4.png"/></dt>
        <dd>返回<br/>顶部</dd>
    </dl>
</a>
    <p>400-800-8200</p></div>
<div class="msk"></div><!--footer-->
<div class="footer">
    <div class="top">
    </div>
    <p class="dibu">DIDI务工版权所有！！<br/>
       </p></div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">jQuery(".bottom").slide({
    titCell: ".hd ul",
    mainCell: ".bd .likeList",
    autoPage: true,
    autoPlay: false,
    effect: "leftLoop",
    autoPlay: true,
    vis: 1
});</script>
</body>
</body>
</html>
