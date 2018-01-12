<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>学生查询</title>
<link rel="stylesheet" type="text/css" href="${ctx }/css/common.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/style.css">
<link rel="stylesheet" type="text/css"
	href="${ctx }/plugins/font-awesome/css/font-awesome.min.css">

</head>
<body>
	<div id="userManageListPanel">
		<div class="toolbar-menu-panel">
			<button class="btn btn-bg add-user-btn">添加</button>
			<button class="btn btn-bg remove-users-btn">删除</button>
		</div>
		<div class="select-content-panel">
			<ul>
				<li>方向：</li>
				<button class="btn btn-xs all-user-btn">全部</button>
				<button class="btn btn-xs java-user-btn">java</button>
				<button class="btn btn-xs web-user-btn">web前端</button>
				<button class="btn btn-xs da-user-btn">大数据</button>
				<button class="btn btn-xs math-user-btn">应用数学</button>
			</ul>
			<ul>
				<li>性别：</li>
				<li>全部</li>
				<button class="btn btn-xs male-user-btn">男</button>
				<button class="btn btn-xs female-user-btn">女</button>
			</ul>
		</div>
		<div class="real-content-panel">
			<table class="table table-stripe table-hover">
				<thead>
					<th class="check-all-btn cursor-pointer" width="100px">序号</th>
					<th>学号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>专业</th>
					<th>方向</th>
					<th>技术</th>
					<th>能力</th>
				</thead>
				<tbody>
					<c:forEach var="user" items="${users }" varStatus="status">
						<tr data-id="${user.id }">
							<td>${status.count }</td>
							<td>${user.name }</td>
							<td>${user.gender }</td>
							<td>${user.specialty }</td>
							<td>${user.direction }</td>
							<td>${user.skill }</td>
							<td>${user.ability }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script type="text/javascript"
		src="${ctx }/plugins/jquery-2.1.3.min.js"></script>
	<script type="text/javascript"
		src="${ctx }/plugins/jquery-form/jquery.form.min.js"></script>
	<script type="text/javascript">
		$(function() {

			// all
			$(".all-user-btn").on("click", function() {
				window.location.href = "index";
			});

			// java
			$(".java-user-btn").on("click", function() {
				window.location.href = "javaindex";
			});
			// web
			$(".web-user-btn").on("click", function() {
				window.location.href = "webindex";
			});
			// 大数据
			$(".da-user-btn").on("click", function() {
				window.location.href = "bigdataindex";
			});
			// 数学
			$(".math-user-btn").on("click", function() {
				window.location.href = "mathindex";
			});
			// 男生
			$(".male-user-btn").on("click", function() {
				window.location.href = "maleindex";
			});
			// 女生
			$(".female-user-btn").on("click", function() {
				window.location.href = "femaleindex";
			});

			// 添加学生
			$(".add-user-btn").on("click", function() {
				window.location.href = "add";
			});

		})
	</script>
</body>

</html>