<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Trendy Tab Login Form Flat Responsive Widget Template :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Trendy Tab Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Custom Theme files -->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!-- //Custom Theme files -->
    <!-- web font -->
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'><!--web font-->
    <!-- //web font -->
    <!-- js -->
    <script src="js/jquery.min.js"></script>
    <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
    <!-- //js -->
</head>
<body>
<!-- main -->
<div class="main">
    <h1  style="color:black;">Trendy Tab Login Form</h1>
    <div class="login-form">
        <div class="sap_tabs w3ls-tabs">
            <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                <ul class="resp-tabs-list">
                    <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Login</span></li>
                    <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><label>/</label><span>Sign up</span></li>
                </ul>
                <div class="clear"> </div>
                <div class="resp-tabs-container">
                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                        <div class="login-agileits-top">
                            <form action="LoginInfo" method="post">
                                <p>User Name </p>
                                <input type="text" name="user_name" required=""/>
                                <p>Password</p>
                                <input type="password" name="user_password" required=""/>
                                <input type="checkbox" id="brand" value="">
                                <label for="brand"><span></span> Remember me ?</label>
                                <input type="submit" value="LOGIN">
                            </form>
                        </div>
                        <div class="login-agileits-bottom">
                            <p><a href="#">Forgot password?</a></p>
                        </div>
                    </div>
                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                        <div class="login-agileits-top sign-up">
                            <form action="addInfo.action" method="post">
                                <p>User Name </p>
                                <input type="text" name="user_name"  required=""/>
                                <p>Your Email </p>
                                <input type="text" name="user_email"  required=""/>
                                <p>Password</p>
                                <input type="password" name="user_password" placeholder="" required=""/>
                                <input type="checkbox" id="brand1" value="">
                                <label for="brand1"><span></span>I accept the terms Use</label>
                                <input type="submit" value="SIGN UP">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ResponsiveTabs js -->
        <script type="text/javascript">
            $(document).ready(function () {
                $('#horizontalTab').easyResponsiveTabs({
                    type: 'default', //Types: default, vertical, accordion
                    width: 'auto', //auto or any width like 600px
                    fit: true   // 100% fit in a container
                });
            });
        </script>
        <!-- //ResponsiveTabs js -->
    </div>
</div>
<!-- //main -->
<!-- copyright -->
<div class="copyright">
    <p> © 2016.11.07 beihua | Design by <a href="http://www.beihua.com/" target="_blank">W3layouts</a></p>
</div>
<!-- //copyright -->
</body>
</html>