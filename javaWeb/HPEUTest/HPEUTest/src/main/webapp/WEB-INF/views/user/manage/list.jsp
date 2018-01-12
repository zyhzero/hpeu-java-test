<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<div id="userManageListPanel">
	<div class="toolbar-menu-panel">
		<button class="btn btn-bg add-user-btn">添加</button>
		<button class="btn btn-bg remove-users-btn">删除</button>
	</div>
	<div class="select-content-panel">
		<ul>
	        <li>方向：</li>
	        <li>全部</li>
	        <c:forEach var="direction" items="${directions }">
	       		<li><a href="javascript:;">${direction.direction }</a></li>
	        </c:forEach>
	    </ul>
	    <ul>
	        <li>性别：</li>
	        <li>全部</li>
	        <li>
	            <a href="javascript:;">男</a>
	        </li>
	        <li>
	            <a href="javascript:;">女</a>
	        </li>
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
						<td><input type="checkbox" class="user-item-id" value="${user.id }">&nbsp;${status.count }</td>
						<td>${user.name }</td>
						<td>${user.gender }</td>
						<td>${user.specialty.specialty }</td>
						<td>${user.direction.direction }</td>
						<td>${user.skill }</td>
						<td>${user.ability }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<script>
	$(function() {
		var $userManageListPanel = $("#userManageListPanel");

		// 添加用户
		$userManageListPanel.find(".add-user-btn").on("click", function() {
			// 加载页面
			loadMainContent("/user/content/add", function() {

			}, {
				userId : -1
			});
		});
		
		// 更新用户
		$userManageListPanel.find(".edit-user-btn").on("click", function () {
			var $this = $(this);
			var userId = $this.parent().parent().data("id");
			
			// 加载页面
			loadMainContent("/user/content/add", function() {

			}, {
				userId : userId
			});
		});
		
	

	})
</script>