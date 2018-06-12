<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>项目信息维护</h1>
    <form action="UpdatePeitems.action" method="post">
        <input type="hidden" name="peitems.itemid" value="${peitems.itemid}" />
        <table width="80%" border="1">
            <tr>
                <td>项目名称：</td>
                <td><input type="text" name="peitems.itemname" value="${peitems.itemname}" maxlength="20" /> </td>
            </tr>
            <tr>
                <td>所属类别：</td>
                <td>
                    <s:select name="peitems.itemtypes.typeid" list="itemtypesList" listKey="typeid" listValue="typename" value="peitems.itemtypes.typeid" />
                </td>
            </tr>
            <tr>
                <td>是否必查：</td>
                <td>
                    <input type="checkbox" name="peitems.necessary"  value="1"
                    <s:if test="peitems.necessary > 0">
                        checked="checked"
                    </s:if>
                    />
                </td>
            </tr>
            <tr>
                <td>参考值：</td>
                <td><input type="text" name="peitems.ref" value="${peitems.ref}" /> </td>
            </tr>
            <tr>
                <td>价格：</td>
                <td><input type="text" name="peitems.price" value="${peitems.price}" /> </td>
            </tr>
            <tr>
                <td>说明：</td>
                <td>
                    <textarea cols="20" rows="5" name="peitems.info">${peitems.info}</textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="修改" />
                    <input type="reset" value="重置" />
                    <input type="button" value="取消" />
                </td>
            </tr>
        </table>

    </form>
</body>
</html>
