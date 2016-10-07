$('#baomo').datagrid({
	url : '/QiXing/machine/baomo',
	fit : true,
	fitColumns : true,
	striped : true,
	rownumbers : true,
	border : false,
	pagination : true,
	pageSize : 10,
	pageList : [ 10, 20, 30, 40, 50 ],
	pageNumber : 1,
	columns : [ [ {
		field : 'machineId',
		title : '机器号',
		width : 100,
	}, {
		field : 'employeeName',
		title : '操作员工',
		width : 100,
	}, {
		field : 'cardId',
		title : '卡号',
		width : 100,
	}, {
		field : 'machineOutput',
		title : '当前产量',
		width : 100,
	}, {
		field : 'runTime',
		title : '运行时间',
		width : 100,
	}, {
		field : 'idleTime',
		title : '空闲时间',
		width : 100,
	}, {
		field : 'errorTime',
		title : '故障时间',
		width : 100,
	}, {
		field : 'recordTime',
		title : '记录时间',
		width : 120,
	}, ] ],
});

$(".datagrid-header-row td div span").each(function(i, th) {
	var val = $(th).text();
	$(th).html("<label style='font-weight: bolder;'>" + val + "</label>");
});

function reloadbaomo() {
	$('#baomo').datagrid('reload');
}

setInterval("reloadbaomo()", 10000);