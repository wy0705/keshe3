<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>order</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
    <link rel="stylesheet" type="text/css" href="css/mygxin.css"/>
</head>
<body><!----------------------------------------order------------------>

<%@ include file="header.jsp" %>
<div class="order cart mt"><!-----------------site------------------->
    <div class="site"><p class="wrapper clearfix"><span class="fl">个人信息</span><img class="top"
                                                                                  <%-- src="img/temp/cartTop02.png">--%></p>
    </div><!-----------------orderCon------------------->
    <div class="orderCon wrapper clearfix">
        <div class="orderL fl"><!--------h3----------------><h3>信息确认</h3>
            <!--------addres---------------->
            <div class="addres clearfix">
                <div class="addre fl on">
                    <div class="tit clearfix"><p class="fl">${name.USER_NAME} <span class="default">[默认地址]</span></p>
                        <p class="fr"><a href="#">删除</a><span>|</span><a href="#" class="edit">编辑</a></p></div>
                    <div class="addCon"><p>${name.USER_ADDRESS }
                        ${name.USER_BIRTHDAY}
                        ${name.USER_EMAIL}
                    </p>
                        <p>158369552</p></div>
                </div>
                <div class="addre fl">
                    <div class="tit clearfix"><p class="fl">张三</p>
                        <p class="fr"><a href="#" class="setDefault">设为默认</a><span>|</span><a
                                href="#">删除</a><span>|</span><a href="#" class="edit">编辑</a></p></div>
                    <div class="addCon"><p>上海市虹口区</p>
                        <p>15732570937</p></div>
                </div>
                <div class="addre fl">
                    <div class="tit clearfix"><p class="fl">李四</p>
                        <p class="fr"><a href="#" class="setDefault">设为默认</a><span>|</span><a
                                href="#">删除</a><span>|</span><a href="#" class="edit">编辑</a></p></div>
                    <div class="addCon"><p>山东省 潍坊市 路北区&nbsp;大学生公寓村</p>
                        <p>15732570937</p></div>
                </div>
            </div>

        </div>
        <div class="orderR fr">
            <div class="msg"><a href="showcart" class="fr">返回</a></h3>
            </div>

             <a href="ok.html" class="pay">确认提交</a></div>
    </div>
</div><!--编辑弹框--><!--遮罩-->
<div class="mask"></div>
<div class="adddz editAddre">
    <form action="#" method="get"><input type="text" placeholder="姓名" class="on"/><input type="text" placeholder="手机号"/>
        <div class="city"><select name="">
            <option value="省份/自治区">省份/自治区</option>
        </select><select>
            <option value="城市/地区">城市/地区</option>
        </select><select>
            <option value="区/县">区/县</option>
        </select><select>
            <option value="配送区域">配送区域</option>
        </select></div>
        <textarea name="" rows="" cols="" placeholder="详细地址"></textarea><input type="text" placeholder="邮政编码"/>
        <div class="bc"><input type="button" value="保存"/><input type="button" value="取消"/></div>
    </form>
</div><!--返回顶部-->
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
    <p>400-800-8200</p></div><!--footer-->
<div class="footer">
    <div class="top">

    </div>
    <p class="dibu">DIDI务工版权所有！！<br/>
        </p></div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>