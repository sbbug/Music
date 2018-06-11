<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath() %>/css/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/css/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/css/assets/css/main-min.css" rel="stylesheet" type="text/css" />
<title>后台管理主界面</title>
</head>
<body>
   
  <div class="header">
    
      <div class="dl-title">
       <!--<img src="/chinapost/Public/assets/img/top.png">-->
      </div>

    <div class="dl-log">
               欢迎您，<span class="dl-log-user">root</span>
               <a href="/chinapost/index.php?m=Public&a=logout" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
      <ul id="J_Nav"  class="nav-list ks-clear">
        		<li class="nav-item dl-selected"><div class="nav-item-inner nav-home">信息提交</div></li>		
          <!-- <li class="nav-item dl-selected"><div class="nav-item-inner nav-order">业务管理</div></li>    -->

      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
   </div>
  <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/js/bui-min.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/js/common/main-min.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/js/config-min.js"></script>
  <script>

    //下面的json字符串从数据库动态提取
    BUI.use('common/main',function(){
      var config = [
                      {
                        id:'1',
                        menu:[
                                  {
                                      text:'用户管理',
                                      items:[
                                                {id:'12',text:'用户审核',href:'Node/index.html'},                                           
                                            ]

                                  },
                                   {
                                      text:'音乐管理',
                                      items:[
                                                {id:'12',text:'歌手管理',href:'Node/index.html'},
                                                {id:'3',text:'专辑管理',href:'Role/index.html'},
                                                {id:'4',text:'歌词管理',href:'User/index.html'},
                                              
                                            ]

                                  }

                              ]
                      }
                      
                  ];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
</body>
</html>