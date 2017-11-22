﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="table">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th colspan="5">
					<button class="btn btn-info" id="save-jurisdiction">添加</button>
					<button class="btn btn-danger remove-jurisdiction">删除</button>
				</th>
			</tr>
		</thead>
		<tbody>
			<tr class="not-hover">
				<th><input type="checkbox" class="checkbox-all">序号</th>
				<th>名称</th>
				<th>描述</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
			<c:forEach var="item" items="${listJurisdiction }" varStatus="status">
				<tr class="" data-id="${item.id }">
					<td><input type="checkbox" name="checkbox"
					data-id="${item.id }">${status.count }</td>
					<td>${item.jurisdictionName }</td>
					<td>${item.description }</td>
					<td>${item.createDate }</td>
					<td><a class="btn btn-info eidt-Jurisdiction"
					href="javascript:;" data-id="${item.id }">编辑</a> <a
					class="btn btn-danger removeJurisdiction" href="javascript:;"
					data-id="${item.id }">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="page">
		<table>
			<tr style="border: none">
				<td colspan="6" style="text-align: right; border-right: 0">当前是第<${page.pageNow}>页，共<${page.totalPage}>页
					<c:if test="${page.hasFirst}"></c:if>
				</td>
				<td colspan="2"><a class="firstPage" href="javascript:;">首页</a>
					<c:if test="${page.hasPre}">
						<a class="prePage" href="javascript:;">上一页</a>
					</c:if> <c:if test="${page.hasNext}">
						<a class="nextPage" href="javascript:;">下一页</a>
					</c:if> <c:if test="${page.hasLast}">
						<a class="lastPage" href="javascript:;">尾页</a>
					</c:if></td>
			</tr>
		</table>
	</div>
</div>
<script>
	$(function() {

		//保存按钮
		$("#save-jurisdiction").on("click", function() {
			$(".content_panel").load("toAddjurisdiction");
		});

		//编辑按钮
		$(".eidt-Jurisdiction").on("click", function() {
			var id = $(this).data("id");
			$(".content_panel").load("eidtJurisdiction", {
				"id" : id
			});
		});

		////单击时全选中
		$(".checkbox-all").on("click", function() {
			var $this = $(this);
			$("input[name='checkbox']").prop("checked", $this.prop("checked"));
		});

		// 单击一行时选中checked
		$("table").find("tr td:not(:first-child)").on("click", function() {
			var $this = $(this).parent();
			var nowItem = $this.find("input[name='checkbox']");
			// 获取当前行checkbox的状态值
			var isChecked = nowItem.prop("checked");
			nowItem.prop("checked", !isChecked);
		});

		//每一行的删除按钮
		$(".removeJurisdiction").on("click", function() {
			
				var $this = $(this);
				var id = $this.data("id");
				$.ajax({
					url : "removeJurisdiction",
					sync : "true",
					data : {
						"id" : id
					},
					type : "POST",
					success : function() {
						toastr.success("删除成功！");
						$(".content_panel").load("jurisdictionManage");
					}
				});
		});

		//多选删除
		$(".remove-jurisdiction").on("click", function() {
			if ($("input[type='checkbox']:checked").length <= 1) {
				toastr.success("请选择要删除的项！");
			} else if (confirm("确认删除？")) {
				$("input[name='checkbox']:checked").each(function() {
					var id = new Array();
					var $this = $(this)
					$this.each(function(i) {
						id[i] = $this.data("id")
						$.ajax({
							url : "removeJurisdiction",
							type : "post",
							data : {
								"id" : id[i]
							},
							success : function() {
								toastr.success("删除成功！");
								$(".content_panel").load("jurisdictionManage");
							}
						});
					});
				});
			}
		});

		//分页
		$(".firstPage").on("click", function() {
			$("#table").load("jurisdictionManage?pageNow=1");
		});
		$(".prePage").on("click", function() {
			$("#table").load("jurisdictionManage?pageNow=${page.pageNow-1}");
		});
		$(".nextPage").on("click", function() {
			$("#table").load("jurisdictionManage?pageNow=${page.pageNow+1}");
		});
		$(".lastPage").on("click", function() {
			$("#table").load("jurisdictionManage?pageNow=${page.totalPage}");
		});
	})
</script>