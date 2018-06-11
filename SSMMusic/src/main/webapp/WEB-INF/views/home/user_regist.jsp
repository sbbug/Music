<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://www.kugou.com/reg/static/css/web_reg.css?201511121557" />
<link href="http://www.kugou.com/root/favicon.ico" rel="shortcut icon">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/search.css">
<script type="text/javascript" charset="UTF-8"> var apmCollectData = apmCollectData || [];</script>
<link rel="stylesheet" href="http://www.kugou.com/common/css/shopmain.css?20150729" type="text/css">
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

    <div class="kg_reg_body_area">
        <!-- 注册主体 -->
        <div class="kg_lgn_reg_box" id="regBox">
            
            <div class="kg_lgn_reg_ct" id="regCntList">
               

                <!-- 手机注册 -->
                <div class="kg_lgn_reg_ct_item" >
                    <form id="t02Form">
                        <table class="kg_lgn_reg_tb" width="100%">
                            <tr>
                                <td width="300" align="right" valign="top">
                                	<label for="t02Mobile" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 用户名：</label>
                                </td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_mobile">
                                        <div class="kg_lgn_textbox">
                                        	<input id="t02Mobile" maxlength="30" name="email" type="text" class="kg_lgn_textbox_ipt" />
                                        </div>                          
                                    </div>
                                </td>
                            </tr>
                           
                            <tr>
                                <td align="right" valign="top">
                                	<label for="t02Psw" class="kg_lgn_reg_tb_tl"><span class="red">*</span>密码：</label>
                                </td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_password">
                                        <div class="kg_lgn_textbox">
                                        	<input maxlength="16" id="t02Psw" name="password" type="password" class="kg_lgn_textbox_ipt" />
                                        </div>                                    
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" valign="top"><label for="t02Psw2" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 确认密码：</label></td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_repassword">
                                        <div class="kg_lgn_textbox">
                                        	<input maxlength="16" id="t02Psw2" name="repassword" type="password" class="kg_lgn_textbox_ipt" />
                                    </div>
                                       
                                    
                                </td>
                            </tr>
                            
                            <tr>
                                <td width="300" align="right" valign="top">
                                	<label for="t02Mobile" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 用户名身份证号：</label>
                                </td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_mobile">
                                        <div class="kg_lgn_textbox">
                                        	<input id="t02Mobile" maxlength="30" name="email" type="text" class="kg_lgn_textbox_ipt" />
                                        </div>                          
                                    </div>
                                </td>
                            </tr>  
                            <tr>
                                <td width="300" align="right" valign="top">
                                	<label for="t02Mobile" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 用户籍贯：</label>
                                </td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_mobile">
                                        <div class="kg_lgn_textbox">
                                        	<input id="t02Mobile" maxlength="30" name="email" type="text" class="kg_lgn_textbox_ipt" />
                                        </div>                          
                                    </div>
                                </td>
                            </tr>                                         
                            
                            <tr>
                                <td width="300" align="right"><label for="t01Sex" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 性别：</label></td>
                                <td id="t02Sex">
                                    <input type="radio" name="UM_Sex" value="1"> 男　
                                    <input type="radio" name="UM_Sex" value="0"> 女
                                </td>
                            </tr>  
                            <tr>
                                <td></td>
                                <td>
                                    <span class="reg_btn_s01" id="t02Submit"><input type="button" name="" value="注册"  /></span>
                                    <span id="t02Msg" class="reg_inset_msg" style="display: none;"></span>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                <!--/手机注册 -->
                

        <!-- 状态层 -->
        <div class="kg_lgn_reg_box kg_lgn_reg_message" id="regMessage" style="display:none;">
            <div class="kg_lgn_reg_hd">
                <div class="h_tl"></div>
            </div>
            <div class="kg_lgn_reg_ct">
                <h4 class="kg_lgn_reg_ct_tl" id="regMessageTl"></h4>
                <div class="kg_lgn_reg_ct_item" id="regMessageCnt"></div>
            </div>
        </div>
        <!--/状态层 -->
    </div>
   </div>
   </div>
</body>
</html>