<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h1>体检项目查询</h1>
    <form action="ShowIndex.action" method="post">
        <s:select list="itemtypesList" listKey="typeid" listValue="typename" name="itemtypes.typeid" />
        <input type="submit" value="查询" />
    </form>
    <table width="80%" border="1">
        <tr>
            <td>项目名称</td>
            <td>所属类别</td>
            <td>是否必查</td>
            <td>参考值</td>
            <td>价格</td>
            <td>说明</td>
            <td>操作</td>
        </tr>
        <s:iterator value="peitemsList" >
            <tr>
                <td>${itemname}</td>
                <td>${itemtypes.typename}</td>
                <td>${necessary}</td>
                <td>${ref}</td>
                <td>${price}</td>
                <td>${info}</td>
                <td>
                    <a href="ShowPeitems.action?itemid=${itemid}">修改</a>
                </td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
