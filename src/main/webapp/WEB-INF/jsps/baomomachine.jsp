<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<script type="text/javascript">
//刷新
function reloadbaomo() {
	$('#baomo').datagrid('reload');
}
setInterval("reloadbaomo()",10000);
</script>

<!-- 用户信息列表 title="用户管理" -->

<table id="baomo" class="easyui-datagrid" fit="true"
	url="<%=request.getContextPath()%>/machine/baomo"
	pagination="true" fitColumns="true"
	singleSelect="true" rownumbers="true" striped="true" border="false"
	nowrap="false">
	<thead>
		<tr>
			<th field="machineId" width="100" >机器号</th>
			<th field="employeeName" width="100" >操作员工</th>
			<th field="cardId" width="100" >卡号</th>		
			<th field="machineOutput" width="100" >当前产量</th>
			<th field="runTime" width="100" >运行时间</th>
			<th field="idleTime" width="100" >空闲时间</th>
			<th field="errorTime" width="100" >故障时间</th>
			<th field="recordTime" width="100" >记录时间</th>
		</tr>
	</thead>
</table>

<!-- <!-- 按钮 --> -->
<!-- <div id="toolbar"> -->
<!-- 	<a href="javascript:void(0);" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-reload" plain="true" onclick="reload();">刷新</a> <a -->
<!-- 		href="javascript:void(0);" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-add" plain="true" onclick="addObject();">新增客户</a> <a -->
<!-- 		href="javascript:void(0);" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-edit" plain="true" onclick="editObject();">编辑客户</a> <a -->
<!-- 		href="javascript:void(0);" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-remove" plain="true" onclick="deleteObject();">删除客户</a> -->
<!-- </div> -->

<!-- <!-- 添加/修改对话框 --> -->
<!-- <div id="dlg" class="easyui-dialog" -->
<!-- 	style="width: 400px; height: 280px; padding: 10px 20px" closed="true" -->
<!-- 	buttons="#dlg-buttons"> -->
<!-- 	<div class="ftitle">新增客户</div> -->
<!-- 	<form id="fm" method="post" novalidate> -->
<!-- 		<div class="fitem"> -->
<!-- 			<label>客户名称:</label> <input name="name" class="easyui-textbox" -->
<!-- 				required="true"> -->
<!-- 		</div> -->
<!-- 		<div class="fitem"> -->
<!-- 			<label>联系地址:</label> <input name="address" class="easyui-textbox" -->
<!-- 				required="true"> -->
<!-- 		</div> -->
<!-- 		<div class="fitem"> -->
<!-- 			<label>邮编:</label> <input name="zipcode" class="easyui-textbox" -->
<!-- 				required="true"> -->
<!-- 		</div> -->
<!-- 		<div class="fitem"> -->
<!-- 			<label>传真:</label> <input name="fax" class="easyui-textbox" -->
<!-- 				required="true"> -->
<!-- 		</div> -->
<!-- 	</form> -->
<!-- </div> -->

<!-- <!-- 添加/修改对话框按钮 --> -->
<!-- <div id="dlg-buttons"> -->
<!-- 	<a href="javascript:void(0)" class="easyui-linkbutton c6" -->
<!-- 		iconCls="icon-ok" onclick="saveObject()" style="width: 90px">保存</a> <a -->
<!-- 		href="javascript:void(0)" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" -->
<!-- 		style="width: 90px">取消</a> -->
<!-- </div> -->

<!-- <!-- 删除对话框 --> -->
<!-- <div id="dlg_delete" class="easyui-dialog" -->
<!-- 	style="width: 300px; height: 200px; padding: 10px 20px" closed="true" -->
<!-- 	buttons="#dlg-del-buttons"> -->
<!-- 	<div class="ftitle">请谨慎操作</div> -->
<!-- 	<form id="fm" method="post" novalidate> -->
<!-- 		<label>确定删除客户吗？</label> -->
<!-- 	</form> -->
<!-- </div> -->

<!-- <!-- 删除对话框按钮 --> -->
<!-- <div id="dlg-del-buttons"> -->
<!-- 	<a href="javascript:void(0)" class="easyui-linkbutton c6" -->
<!-- 		iconCls="icon-ok" onclick="saveObject_del()" style="width: 90px">删除</a> -->
<!-- 	<a href="javascript:void(0)" class="easyui-linkbutton" -->
<!-- 		iconCls="icon-cancel" -->
<!-- 		onclick="javascript:$('#dlg_delete').dialog('close')" -->
<!-- 		style="width: 90px">取消</a> -->
<!-- </div> -->




