package com.DIDI.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/lg")
public class myServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String un = req.getParameter("un");
        req.setAttribute("key", un);
//        System.out.println(req.getAttribute("key"));
        String str = "0";
        switch (un) {
            case "1":
                ArrayList date=new ArrayList(); //创建一个集合
                String s="1、JAVA开发的经验，编程能力强，精通J2EE和SOA,具有基于Spring框架的大型分布式系统设计研发经验；<br>" +
                        "                    2、大型业务应用系统的设计和落地的实际能力，熟悉分布式系统的设计和应用，熟悉分布式、缓存、消息等机制；<br>" +
                        "                    3、极强的软件需求理解，分析能力，极强的抽象和软件设计能力；<br>" +
                        "                    4、精通多线程及高性能的应用的设计，编码及性能调优，有高并发应用开发经验；";
                date.add(s);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case "2":
                ArrayList date2=new ArrayList(); //创建一个集合
                String s2="java:北京 5-10年 本科 30-60K 15薪\n" +
                        " 岗位职责：\n" +
                        "● 参与仓储系统产品需求分析、系统设计和技术选型等工作；\n" +
                        "● 负责所属业务系统架构的整体技术规划，以及系统性能和稳定性优化，故障排查和解决、安全加固等工作；\n" +
                        "● 独立完成子系统/模块的代码开发、测试和相关技术文档的编写；\n" +
                        "● 负责后端新技术的调研等工作";
                date2.add(s2);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date2);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case "3":
                ArrayList date3=new ArrayList(); //创建一个集合
                String s3="岗位基本要求：\n" +
                        "● 精通Java语言；\n" +
                        "● 本科及以上学历，计算机、软件工程相关专业；\n" +
                        "● 熟练使用Spring、Spring MVC等框架，并对框架原理有一定了解；\n" +
                        "● 熟悉MySQL的应用开发，熟悉常见的性能调优和可扩展性设计，了解Redis缓存技术和Hive等NoSQL数据库；\n" +
                        "● 熟悉ZooKeeper、Kafka等各种中间件，对事务、锁、并发等实现机制有深入了解；\n" +
                        "● 熟悉常用业务架构的设计，具备良好的编程能力和代码风格，对模块化编程有较深理解；\n" +
                        "● 具有一定的技术规划和设计能力，发现架构设计中存在的问题，并给出有效的解决措施和方法。\n" +
                        "具备以下优先：\n" +
                        "● 有良好的沟通和协调能力，较强的逻辑分析能力，擅长团队合作者优先；\n" +
                        "● 具有较强的快速学习能力，有“代码洁癖”者优先；\n" +
                        "● 有仓储相关领域开发经验者优先；\n" +
                        "● 如你技术实力深厚；足够聪明、乐观、皮实；能够自我驱动，追求卓越。请忽略以上所有要求，欢迎你的加入； ";
                date3.add(s3);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date3);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"4":
                ArrayList date4=new ArrayList(); //创建一个集合
                String s4="php  北京 3-5年 本科 25-45K 15薪\n" +
                        "\n" +
                        "职位描述\n" +
                        "岗位职责：\n" +
                        "1、制定平台处置、规则执行标准，开发设计通用、灵活、智能的业务治理中台，并推广到各业务方接入；\n" +
                        "2、改善工作台和判责工具，加速安全响应和流转、妥善处置每一个司机乘客的进线Case；\n" +
                        "3、具有一定的数据分析和逻辑判断能力，思路清晰、缜密；具备较强的问题解决能力，并有很好的前瞻性和全局观；\n" +
                        "4、具备出色的沟通能力，有团队合作精神，与各业务方体系部门建立沟通协作机制；\n" +
                        "5、有平台生态体系工作经验者优先。";
                date4.add(s4);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date4);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"5":
                ArrayList date5=new ArrayList(); //创建一个集合
                String s5="任职资格：\n" +
                        "1、计算机或相关专业本科以上学历；\n" +
                        "2、3年/5年及以上J2EE或 PHP开发经验，3年以上互联网项目经验，能够独立完成项目开发及现有项目二次开发；\n" +
                        "3、熟悉分布式后端服务开发流程和规范，熟练掌握Spring、Mybatis等框架，熟悉SpringCloud, SpringBoot等开发框架；\n" +
                        "4、精通Java多线程开发和线程池使用，熟练掌握分布式，缓存，消息队列MQ，搜索等技术体系；\n" +
                        "5、掌握Redis，Elasticsearch等NoSQL技术，精通MySQL的开发设计和调优；\n" +
                        "6、具备模块或子系统的架构设计能力,掌握常见的架构设计方法和模式,持续优化系统架构，保证系统的高可用性（性能、安全、容量）、稳定性、和可扩展性；\n" +
                        "7、熟悉Linux环境，熟悉web容器性能调优，能独立部署，定位跟踪日志，有很强的toubleshooting能力；\n" +
                        "8、对技术有激情，喜欢钻研，主动性高，具有较强的独立工作能力和解决问题的能力;\n" +
                        "9、英语好，有国际化工作经验优化；";
                date5.add(s5);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date5);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"6":
                ArrayList date6=new ArrayList(); //创建一个集合
                String s6="web前端 上海 3-5年本科 15-30K\n" +
                        "职位描述：\n" +
                        "工作职责：\n" +
                        "1 负责业务项目的开发和维护，进行软件设计和编码实现以及编码测试，确保安全、质量和性能。\n" +
                        "2 持续改进和升级，优化产品功能，修复现有软件产品的缺陷。\n" +
                        "3 关注技术细节，并能根据业务需求和相关数据，提出技术和架构上的改进。";
                date6.add(s6);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date6);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"7":
                ArrayList date7=new ArrayList(); //创建一个集合
                String s7="算法工程师  30-60K 13薪\n" +
                        "职位需求：\n" +
                        "1.统招本科毕业，计算机相关专业。\n" +
                        "2.精通一种或多种编程语言, 比如Java, C#, C/C++, Python, Go等。\n" +
                        "3.较强的coding能力和算法能力。\n" +
                        "4.对技术有浓厚兴趣，喜爱技术钻研。\n" +
                        "5.英文可以读写，senior 职位要求一定的口语能力\n" +
                        "6.1-15年工作经验\n" +
                        "7. 工作地点：苏州/北京\n" +
                        "招聘 AI; Algorithm; ML; DL; NLP; Data Mining\n" +
                        "面试流程：\n" +
                        "HR talk+1轮电话技术面试+4-5轮线上技术面试\n" +
                        "福利好 双休 工作日大都六点下班 15天带薪年假 15天带薪病假 股票 教育培训费补贴 健身费补贴 节假日补贴 ";
                date7.add(s7);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date7);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"8":
                ArrayList date8=new ArrayList(); //创建一个集合
                String s8="***C#高级开发工程师   15-28K·16薪   深圳3-5年本科\n" +
                        "岗位职责：\n" +
                        "1.负责游戏官网及活动类功能开发。\n" +
                        "2.完成相应模块的需求、设计、编码、调试等相关工作。\n" +
                        "3.及时反馈开发过程中遇到的问题及各类情况，并根据实际情况提出改进建议\n" +
                        "4.参与项目开发和维护过程中技术问题的解决\n" +
                        "5.承担相应的保密职责\n" +
                        "任职要求：\n" +
                        "1、本科以上学历，计算机等相关专业，3年以上C# WEB端开发相关工作经验。\n" +
                        "2、精通C#，深刻理解C#语言运行机制，熟悉 .NET Framework/.Net Core框架。\n" +
                        "3、熟练应用mssql/mysql等数据库，对数据库优化具有一定经验。\n" +
                        "4、有高并发业务处理经验，熟悉RabbitMQ消息对列的使用及Redis缓存。\n" +
                        "5、具有良好的编码、文档习惯，熟悉Web程序代码安全。";
                date8.add(s8);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date8);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"9":
                ArrayList date9=new ArrayList(); //创建一个集合
                String s9="Android 开发 35-45K·13薪  上海3-5年本科\n" +
                        "我们正在寻找一位才华横溢的安卓开发工程师加入我们上海办公室的技术团队，帮助Booking.com BV做出风靡全球的优质旅行app！" +
                        "Booking.com的应用程序拥有数百万次下载量和大量活跃用户。你将成为我们上海新成立的中国产品开发团队的一员。" +
                        "加入我们，与行业内的精英们一起工作，为Booking.com BV的全球知名住宿平台提供支持！\n" +
                        "工作职责：\n" +
                        "我们的指导原则是：帮助用户就是帮助我们的业务发展。因此我们倾听客人的想法，并为他们提供想要的功能。" +
                        " 作为移动端团队的开发工程师，你将在创意流程中的发挥作用，在类似于小型创业公司氛围的团队中工作，负责计划中属于自己团队的那一部分。" +
                        "我们一直不断努力改进产品，这是我们高速产品推出周期的一部分，同时，我们还致力于在移动端app上应用更广泛的更改。";
                date9.add(s9);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date9);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"10":
                ArrayList date10=new ArrayList(); //创建一个集合
                String s10="我们希望我们的开发工程师熟悉安卓框架，并提供客户想要使用的优质产品。我们需要做事主动、擅长解决问题的人，你需要发起解决方案和讨论，并且无惧解决由庞大的规模引起的挑战。\n" +
                        "我们认为符合以下要求的人最适合我们：\n" +
                        "● 有3年以上使用安卓SDK的应用开发经验\n" +
                        "● 有5年以上使用Java和其他语言的开发经验\n" +
                        "● 英语和普通话流利。\n" +
                        "● 强烈的交互和设计敏感度，注重细节\n" +
                        "● 积极探索新技术、应用程序和环境\n" +
                        "● 发挥能动性、高度积极、有团队精神";
                date10.add(s10);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date10);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"11":
                ArrayList date11=new ArrayList(); //创建一个集合
                String s11="JavaScript 开发工程师（合肥） 18-30K·15薪\n" +
                        "\n" +
                        "合肥5-10年本科\n" +
                        "工作职责： \n" +
                        "1、负责神策 前端 SDK 相关的调研，开发，维护，客户支持；\n" +
                        "2、前端 SDK 包括，Web ，微信小程序，支付宝小程序，其他小程序，快应用等。\n" +
                        "职位要求：\n" +
                        "1、熟练并且全面的掌握 JavaScript 各种基础知识及技术细节，比如作用域，Cookie 等；\n" +
                        "2、时刻关注前沿的 JS 技术，包括 ES6，React，Vue 等；\n" +
                        "3、自学能力强，有自己动手实践的能力，能按照官方技术文档独立完成相关功能；\n" +
                        "4、心态开放，勇于挑战难题，遇到困境时，有一套独立解决问题的方法；\n" +
                        "5、具备良好的团队协作能力、沟通能力和学习能力，主动性强，有责任感；\n" +
                        "6、对大数据方向感兴趣，乐于帮助客户实现数据驱动。";
                date11.add(s11);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date11);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"12":
                ArrayList date12=new ArrayList(); //创建一个集合
                String s12="****iOS开发 25-40K·14薪 北京3-5年本科\n" +
                        " 岗位职责：\n" +
                        "1、负责App功能模块的需求迭代，开发和维护工作\n" +
                        "2、与产品经理配合，参与需求讨论和制定\n" +
                        "3、参与提高App性能和稳定性的工作\n" +
                        "岗位要求：\n" +
                        "1、有3年以上的iOS平台开发经验\n" +
                        "2、良好的编程风格，扎实的编程和算法基础\n" +
                        "3、具有一定的分析和解决问题的能力\n" +
                        "4、有责任心和团队精神，善于沟通和合作\n" +
                        "5、有海外app开发经验优先 ";
                date12.add(s12);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date12);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"13":
                ArrayList date13=new ArrayList(); //创建一个集合
                String s13="U3D/Unity3D高级开发工程师 广州3-5年本科  20-40K·13薪" +
                        "任职要求：\n" +
                        "1、本科及以上学历，2年以上游戏开发经验，只少有一款完整U3D手游开发经验；\n" +
                        "2、具有良好的编程能力、代码风格和编程习惯、熟练掌握常用数据结构及算法、注重开发效率；\n" +
                        "3、熟悉unity引擎，熟悉图形学，熟悉shader，熟悉各类优化技术并理解原理；\n" +
                        "4、乐于接受新事物和新技术，有较强的学习能力；\n" +
                        "5、有责任心，有良好的沟通能力，可以理解策划设计意图，和策划流畅沟通。 ";
                date13.add(s13);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date13);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"14":
                ArrayList date14=new ArrayList(); //创建一个集合
                String s14="嵌入式开发 11-22K\n" +
                        "\n" +
                        "武汉·经验不限·本科\n" +
                        "\n" +
                        "职位描述\n" +
                        "1、精通C语言，1年以上ARM/单片机等嵌入式开发经验，熟悉掌握SPI,I2C,UART,ADC,PWM驱动开发；\n" +
                        "2、有EC开发经验优先，Linux、liteOS移植经验优先；\n" +
                        "3、沟通顺畅，项目管理者经验优先\n" +
                        "3年以上嵌入式经验：2人\n" +
                        "1年以上嵌入式经验：6人";
                date14.add(s14);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date14);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            case"15":
                ArrayList date15=new ArrayList(); //创建一个集合
                String s15="招聘要求 :" +
                        "1、 年龄 22-40周岁，男女不限； " +
                        "2、 大专以上学历，有销售工作经验； " +
                        "3、 有较强的学习、沟通能力，善于交际；" +
                        " 4、 有良好的团队合作意识和承压能力；" +
                        " 5、 能吃苦耐劳，保持良好的工作积极性；" +
                        " 6、 有驾照与实际销售业绩经验优先。";
                date15.add(s15);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date15);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
                /**/
            case"16":
                ArrayList date16=new ArrayList(); //创建一个集合
                String s16="任职资格： " +
                        "1、大专以上学历，具备销售经验者优先考虑；" +
                        " 2、为人正直诚信有毅力，具有高度的工作积极性和良好的团队合作意识； " +
                        "3、具备独立处理复杂问题和危急事件的能力；\n" +
                        " 4、.服从公司管理，偶尔需要出差。";
                date16.add(s16);//向集合中添加数据
                //将集合中数据放入session中
                req.setAttribute("date",date16);
                req.getRequestDispatcher("proDetail.jsp").forward(req,resp);
                break;
            default:
                str = "err";
        }


    }
}
