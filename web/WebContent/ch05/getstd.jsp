<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	String year = request.getParameter("year");
	String hobby = request.getParameter("hobby");
	%>



	<section>
		<article>

			<table border="1">
				<tr>
					<td>이름</td>
					<td><%=name%>
					<td>
				</tr>
				<tr>
					<td>성별</td>
					<td><%=sex%>
					<td>
				</tr>
				<tr>
					<td>학년</td>
					<td><%=year%>
					<td>
				</tr>
				<tr>
					<td>취미</td>
					<td><%=hobby%>
					<td>
				</tr>
				<tr>
					<td>관심</td>
					<td>
						<%
						String[] sbjs = request.getParameterValues("subject");
						for(String str : sbjs) {
						%>
						
						<%=str%>
						
						<% } %>
					
					<td>
				</tr>

			</table>

		</article>
	</section>

</body>
</html>