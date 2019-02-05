<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.css"
          id="bootstrap-css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/SecuritySpring-1.0-Beta/static/external/css/login.css">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="login-wrap">
    <div class="login-html">
        <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Log In</label>
        <input id="tab-2" type="radio" name="tab" class="for-pwd"><label for="tab-2" class="tab">Não sei o login!!</label>
        <div class="login-form">
            <form name="f" action="${'auth/login'}" method="POST">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <div class="sign-in-htm">
                    <div class="group">
                        <label class="label">Email</label>
                        <input name="j_username" type="email" class="input">
                    </div>
                    <div class="group">
                        <label class="label">Password</label>
                        <input name='j_password' type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <input type="submit" class="button" value="Log In">
                    </div>
                    <div class="hr"></div>
                </div>
            </form>
            <div class="for-pwd-htm">
                </br>
                </br>
                <h3>Email: root@mezzavilla.com</h3>
                </br>
                <h3>Senha: root</h3>
            </div>

        </div>
    </div>
</div>
</body>
</html>