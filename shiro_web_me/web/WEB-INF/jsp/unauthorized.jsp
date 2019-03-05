<%--
  Created by IntelliJ IDEA.
  User: nancy
  Date: 2019/3/5
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<!DOCTYPE html>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="static/css/style.css" />

<div class="workingroom">

    权限不足,具体原因：${ex.message}
    <br>
    <a href="#" onClick="javascript:history.back()">返回</a>
</div>