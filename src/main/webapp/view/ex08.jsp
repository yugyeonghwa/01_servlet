<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function send_go(f) {
        let name = f.name.value;
        if(name === ''){
            alert("이름을 입력하세요")
            f.name.focus();
            return;
        }
        for (let i = 1; i < f.elements.length; i++) {
            console.log(f.elements[i]);
            if(f.elements[i].value ===''){
                alert(f.elements[i].name+ "을 입력하세요");
                f.elements[i].focus();
                return;
            }
        }
        f.submit();
    }
</script>
</head>
<body>
    <fieldset action="/01_servlet/Ex08" method="post">
        <legend>계산기</legend>
        <form action="/01_servlet/Ex07" method="post">

            <p>이름 : <input type="text" name="name" required></p>
            <p>국어 : <input type="number" name="kor" required></p>
            <p>영어 : <input type="number" name="eng" required></p>
            <p>수학 : <input type="number" name="math" required></p>
            <input type="submit" value="결과보기" onclick="send_go(this.form)">
            <input type="reset" value="취소">
        </form>
    </fieldset>
</body>
</html>