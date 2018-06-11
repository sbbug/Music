<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="http://www.kugou.com/common/css/shopmain.css?20150729" type="text/css">
<link rel="stylesheet" href="http://www.kugou.com/reg/static/css/web_reg.css?201511121557" />
<title>用户登录</title>
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
    
        <div class="kg_lgn_reg_box" id="regBox">
            
            <div class="kg_lgn_reg_ct" id="regCntList">
           
                <div class="kg_lgn_reg_ct_item" >
                    <form id="t02Form">
                        <table class="kg_lgn_reg_tb" width="100%">
                            <tr>
                                <td width="300" align="right" valign="top"><label for="t02Mobile" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 用户名：</label></td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_mobile">
                                        <div class="kg_lgn_textbox">
                                        <input id="t02Mobile" maxlength="30" name="user_name" type="text" class="kg_lgn_textbox_ipt" /></div>
                                       
                                    </div>
                                </td>
                            </tr>
                          
                            <tr>
                                <td align="right" valign="top"><label for="t02Psw" class="kg_lgn_reg_tb_tl"><span class="red">*</span> 密码：</label></td>
                                <td>
                                    <div class="kg_lgn_textbox_area kg_lgn_textbox_password">
                                        <div class="kg_lgn_textbox">
                                        <input maxlength="16" id="t02Psw" name="user_password" type="password" class="kg_lgn_textbox_ipt" /></div>
                                       
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <span class="reg_btn_s01" id="t02Submit"><input type="button" name="" value="登录"  /></span>
                                    <span id="t02Msg" class="reg_inset_msg" style="display: none;"></span>
                                </td>
                            </tr>
                          
                        </table>
                    </form>
                </div>
         </div>
   </div>
</div>
</body>
</html>