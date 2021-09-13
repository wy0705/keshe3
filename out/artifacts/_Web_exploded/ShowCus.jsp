<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>cart</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
    <script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body><!--------------------------------------cart--------------------->

<%@ include file="header.jsp" %>
<div class="head ding">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a href="index.html"></a></h1>
            <div class="fr clearfix" id="top1"><p class="fl"><a href="login.html" id="login">登录</a><a href="reg.html"
                                                                                                      id="reg">注册</a>
            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="搜索"/><input type="button"/>
                </form>
                <div class="btn fl clearfix"><a href="mygxin.html"><img src="img/grzx.png"/></a><a href="#" class="er1"><img
                        src="img/ewm.png"/></a><a href="cart.html"><img src="img/gwc.png"/></a>
                    <p><a href="#"><img src="img/smewm.png"/></a></p></div>
            </div>
        </div>
    </div>
</div>
<div class="cart mt"><!-----------------logo------------------->
    <div class="table wrapper">
        <div class="tr">
            <div>操作</div>
            <div>意向城市</div>
            <div>邮箱</div>
            <div>期望薪资</div>
            <div>性别</div>
            <div>电话/手机号</div>
            <div>--------></div>
            <div>姓名</div>

        </div>

        <c:forEach var="rs" items="${requestScope.shoplist1 }">
            <div class="pro clearfix"><label class="fl">
                <input name="ck" type="checkbox"/>

                <span></span></label>

                </div>
            <div class="th">
                <div class="s"><a class="del" datasrc="${rs.name }" href="" style="color: #A10000"> <h2>通过</h2></a></div>
                <div class="s">
                    <p>
                        <span datasrc="${rs.permanentAddress}" class=>${rs.permanentAddress }</span>
                    </p>
                </div>
                <div class="s">
                    <p class="num clearfix">
                        <span datasrc="${rs.email }" class=>${rs.email }</span>
                    </p>
                </div>
                <div class="s">
                    <p class="num clearfix">
                        <span datasrc="${rs.salary }" class=>${rs.salary }</span>
                    </p>
                </div>
                <div class="s">
                    <p class="num clearfix">
                        <span datasrc="${rs.sex }" class=>${rs.sex }</span>
                        </p>
                </div>
                <div class="s">
                    <p class="s">
                        <span datasrc="${rs.phone}" class=>${rs.phone }</span>
                    </p>
                </div>
                <div>--------></div>
                <div class="s">
                    <p class="s">
                        <span datasrc="${rs.name}" class=>${rs.name }</span>
                    </p>
                </div>

            </div>


            </c:forEach>


        <div class="goOn">空空如也~<a href="indexselect">去逛逛</a></div>
        <div class="tr clearfix"><label class="fl"><input class="checkAll" type="checkbox"/><span></span></label>
            <p class="fl"><a href="#">全选</a> <a href="#" class="del">删除</a></p>
            <p class="fr"><span>共<small id="sl">0</small>件商品</span><span>合计:&nbsp;<small id="all">￥0.00</small></span><a
                    href="javascript:toorder()" class="count">管理员审核</a></p></div>
    </div>
</div>

<script>
    function toorder() {
        var str = "";

        $("input[name='ck']:checked").each(function(index, item){
            if($("input[name='ck']:checked").length-1 == index){
                str+= $(this).val();
            }else{
                str+= $(this).val()+",";
            }

        });

        location.href="orderselect?eids="+str;

    }
</script>
<div class="mask"></div>
<div class="tipDel"><p>确定要删除该商品吗？</p>
    <p class="clearfix"><a class="fl cer" href="#">确定</a><a class="fr cancel" href="#">取消</a></p></div><!--返回顶部-->
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
        <div class="wrapper">
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot1.png"/></a><span class="fl">7天无理由退货</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot2.png"/></a><span class="fl">15天免费换货</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot3.png"/></a><span class="fl">满599包邮</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot4.png"/></a><span class="fl">手机特色服务</span>
            </div>
        </div>
    </div>
    <p class="dibu"><br/>
    </p></div><!----------------mask------------------->
<div class="mask"></div><!-------------------mask内容------------------->
<div class="proDets"><img class="off" src="img/temp/off.jpg"/>
    <div class="proCon clearfix">
        <div class="proImg fr"><img class="list" src="img/temp/proDet.jpg"/>
            <div class="smallImg clearfix"><img src="img/temp/proDet01.jpg" data-src="img/temp/proDet01_big.jpg"><img
                    src="img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg"><img src="img/temp/proDet03.jpg"
                                                                                          data-src="img/temp/proDet03_big.jpg"><img
                    src="img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg"></div>
        </div>
        <div class="fl">
            <div class="proIntro change"><p>颜色分类</p>
                <div class="smallImg clearfix"><p class="fl on"><img src="img/temp/prosmall01.jpg" alt="白瓷花瓶+20支快乐花"
                                                                     data-src="img/temp/proBig01.jpg"></p>
                    <p class="fl"><img src="img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草"
                                       data-src="img/temp/proBig02.jpg"></p>
                    <p class="fl"><img src="img/temp/prosmall03.jpg" alt="20支快乐花" data-src="img/temp/proBig03.jpg"></p>
                    <p class="fl"><img src="img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="img/temp/proBig04.jpg"></p>
                </div>
            </div>
            <div class="changeBtn clearfix"><a href="#2" class="fl"><p class="buy">确认</p></a><a href="#2" class="fr"><p
                    class="cart">取消</p></a></div>
        </div>
    </div>
</div>
<div class="pleaseC"><p>请选择宝贝</p><img class="off" src="img/temp/off.jpg"/></div>

<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>
