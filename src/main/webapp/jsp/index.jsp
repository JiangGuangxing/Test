<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>测试</title>
    <script type="text/javascript" src="/static/js/jquery-1.9.1.min.js"></script>
    <script>
        var test = function () {
            var saveDataAry = [];
            var data1 = {"name": "test", "age": "gz"};
            var data2 = {"name": "ququ", "age": "gr"};
            saveDataAry.push(data1);
            saveDataAry.push(data2);
            $.ajax({
                type: "POST",
                url: "/test/test",
                dataType: "json",
//                contentType: "application/json",
                data: JSON.stringify(saveData),
                success: function (data) {

                }
            });
        }
    </script>
</head>

<body>
${zhidaoQuestion.id}
<a onclick="test();">test</a>
</body>
</html>