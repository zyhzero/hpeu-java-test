<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>添加学生</title>
<link rel="stylesheet" type="text/css" href="${ctx }/css/common.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/style.css">
<link rel="stylesheet" type="text/css"
	href="${ctx }/plugins/font-awesome/css/font-awesome.min.css">

</head>
<body>
<div id="userAddPanel">
	<div class="headline">
		<h2>
			<c:if test="${user.id == 0 }">
			新增用户
			</c:if>
			<c:if test="${user.id != 0 }">
			更新用户
			</c:if>
		</h2>
	</div>
	<form class="real-content-form form" name="user"
		action="${ctx }/user/content/save" method="post">
		<div class="form-group">
			<label class="input-label">学号</label> <input name="sno"
				class="input-content" type="text" placeholder="请输入学号" autofocus>
		</div>
		<div class="form-group">
			<label class="input-label">姓名</label> <input name="name"
				class="input-content" type="text" placeholder="请输入姓名">
		</div>
		<div class="form-group">
			<label class="input-label">性别</label>
			<div class="radio-content">
				<label><input type="radio" name="gender" value="男" checked>
					男</label> <label><input type="radio" name="gender" value="女">
					女</label>
			</div>
		</div>
		<div class="form-group">
			<label class="input-label">专业</label> <input name="specialty"
				class="input-content" type="text" placeholder="请输入输专业">
		</div>
		<div class="form-group">
			<label class="input-label">方向</label> <input name="direction"
				class="input-content" type="text" placeholder="请输入输方向">
		</div>
		<div class="form-group">
			<label class="input-label">技术</label> <input name="skill"
				class="input-content" type="text" placeholder="请输入技术水平分数">
		</div>
		<div class="form-group">
			<label class="input-label">能力</label> <input name="ability"
				class="input-content" type="text" placeholder="请输入能力分数">
		</div>
	</form>
	<div class="bottom-menu-panel">
		<button class="btn btn-bg save-user-btn">保存</button>
		<button class="btn btn-bg cancel-btn">取消</button>
	</div>
</div>
<script type="text/javascript" src="${ctx }/plugins/jquery-2.1.3.min.js"></script>
<script type="text/javascript"
	src="${ctx }/plugins/jquery-form/jquery.form.min.js"></script>
<script type="text/javascript"
	src="${ctx }/plugins/validate/jquery-html5Validate-min.js"></script>

<script>
	$(function() {
		var $userAddPanel = $("#userAddPanel");
		var $userContentForm = $userAddPanel.find("form");

		// 显示验证提示
		function showInputTip($input, value) {
			var $parent = $input.parent();

			$parent.addClass("error-group");
			$parent.find(".input-label span").remove();
			$parent.find(".input-label").append("<span>" + value + "</span>");
			$input.focus();

			return false;
		}

		// 隐藏验证提示
		function hideInputTip($input) {
			var $parent = $input.parent();

			$parent.removeClass("error-group");
			$parent.find(".input-label span").remove();
		}

		// 初始化表单提交
		$studentContentForm.html5Validate(function() {
			// 对表单进行提交
			// jquery-form的异步提交方式

			$studentContentForm.ajaxSubmit({
				success : function() {
					// 刷新页面
					window.location.href = "index";
				}
			});
		},
				{
					// 对表单数据做有效性验证
					validate : function() {
						var number = $studentContentForm
								.find("input[name='sno']");
						var name = $studentContentForm
								.find("input[name='name']");
						var specialty = $studentContentForm
								.find("input[name='specialty']");
						var direction = $studentContentForm
								.find("input[name='direction']");
						var skill = $studentContentForm
								.find("input[name='skill']");
						var ability = $studentContentForm
								.find("input[name='ability']");

						if ($.trim(sno.val()) === "") {
							return showInputTip(sno, "请输入学号");
						} else {
							hideInputTip(sno);
						}
						if ($.trim(name.val()) === "") {
							return showInputTip(name, "请输入姓名");
						} else {
							hideInputTip(name);
						}
						if ($.trim(specialty.val()) === "") {
							return showInputTip(specialty, "请输入专业");
						} else {
							hideInputTip(specialty);
						}
						if ($.trim(direction.val()) === "") {
							return showInputTip(direction, "请输入方向");
						} else {
							hideInputTip(direction);
						}
						if ($.trim(skill.val()) === "") {
							return showInputTip(skill, "请输入技术");
						} else {
							hideInputTip(skill);
						}
						if ($.trim(ability.val()) === "") {
							return showInputTip(ability, "请输入能力");
						} else {
							hideInputTip(ability);
						}
						return true;
					}
				});

		// 保存用户
		$userAddPanel.find(".save-user-btn").on("click", function() {
			$userContentForm.trigger("submit");
		});

		// 取消保存
		$userAddPanel.find(".cancel-btn").on("click", function() {
			// 刷新页面
			window.location.href = "index";
		});
	})
</script>
</body>
</html>