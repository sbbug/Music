<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>音乐在线播放系统</title>
<link rel="stylesheet" href="http://www.kugou.com/reg/static/css/web_reg.css?201511121557" />
<link href="http://www.kugou.com/root/favicon.ico" rel="shortcut icon">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/search.css">
<link rel="stylesheet" href="http://www.kugou.com/common/css/shopmain.css?20150729" type="text/css">
</head>
<body>
<div class="public-header-wrapper">
<div id="public-header">
   
    <div class="login public_nav_bd" id="lng">
        <ul class="nav_m_l_r clear_fix">
            <li class="nav_r noborder">
                <a class="regLink" href="<%=request.getContextPath() %>/user/regist" title="新用户注册" hidefocus="true" target="_blank">注册</a>
            </li>
            <li class="nav_r nav_handle not_login">
                <a href="<%=request.getContextPath() %>/user/login" hidefocus="true" class="t_ico loginbtn">登录</a> 
            </li>         
        </ul>
    </div>
</div>
</div>
<div class="public-nav-wrapper">
    <div id="public-nav" class="clear_fix">
     
      <ul class="n1" id="ulHeader">
        <li class='home'>
            <a href="<%=request.getContextPath() %>/song/index">歌曲搜索
            </a>
        </li>
        <li class='downloadLink' id="downloadLink">
            <a href="<%=request.getContextPath() %>/singer/index">歌手搜索
            </a>
        </li>
        <li>
            <a href="<%=request.getContextPath() %>/album/index">专辑搜索</a>
        </li>   
      </ul> 
    </div>
</div>

<div class="scroll" id="scroll"><img src="http://www.kugou.com/common/images/scrolltop.png" alt="返回顶部"/></div>  
   

      <div class="search_header">
        <div class="search_wrapper content_search">
            <div class="search_input"><input value="null" type="text" placeholder="搜索"><div class="searh_btn"><i class="search_icon"></i><span>搜索</span></div></div>
            <div class="search_recommend content_search_recommend hide" style="display: none;">
                
            </div>
            <div class="search_histroy content_search_histroy">
                
            </div>
        </div>
      </div>
      <div class="search_content">
                    <ul class="search_tab clearfix">
                        <li class="active" data-type="song"><a id="song" href="javascript:;">单曲</a></li>
                        <li data-type="special"><a id="special" href="javascript:;">歌单</a></li>
                        <li data-type="mv"><a id="mv" href="javascript:;">MV</a></li>
                    </ul>

                   <div class="search_song" id="search_song" style="display: block;">
        
                    
                  <div class="song_list">
                        <ul class="list_header clearfix">
                            <li class="width_f_li song_name_li">
                               <span class="search_icon checkall"></span>歌曲名
                            </li>
                            <li class="width_s_li">
                                专辑
                            </li>
                            <li class="width_t_li">
                                时长
                            </li>
                        </ul>
                        <ul class="list_content clearfix" id="list_content1528547268653">
                            <li class="clearfix">
                                <div class="width_f_li clearfix">
                                  <span class="search_icon checkbox"></span>
                                  <a class="song_name" title="null - Gia mia stigmi" href="javascript:;">
                                    <em>null</em> - Gia mia stigmi
                                 </a>
                               </div>
                               <div class="width_s_li">
                                  <a class="album_name" title="《Ahromos aionas》" target="_blank" href="http://www.kugou.com/yy/album/single/865219.html">《Ahromos》
                                  </a>
                              &nbsp;
                              </div>
                              <div class="width_t_li">05:46</div>
                              <div class="play-item">
                                <span class="common_icon icon_play">
                                </span>
                                <span class="common_icon icon_download" onclick="_hmt.push(['_trackEvent', 'hidedown', 'hidecilick', 'hidepc']);"></span>
                                <span class="common_icon icon_share"></span>
                            </div>
                          </li>

                      </ul>              
                    </div>
                </div>
         </div>
   </div>
</div>
</body>
</html>