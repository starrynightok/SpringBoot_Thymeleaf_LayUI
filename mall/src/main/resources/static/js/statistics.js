layui.use(['table'], function(){
    let table = layui.table;

    loadTable();

    function loadTable(){
        table.render({
            elem: '#notesTable'
            ,height: 312
            ,url: '/statistics/queryTodayNotes' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:"20%", sort: true, fixed: 'left', type:"numbers"}
                ,{field: 'type', title: '类型', width:"20%", templet:function (d) {
                        let typeStr = "";
                        switch (d.type) {
                            case 1:
                                typeStr = "行人";
                                break;
                            case 2:
                                typeStr = "车辆";
                                break;
                            case 3:
                                typeStr = "劝返";
                                break;
                            case 4:
                                typeStr = "取快递";
                                break;
                            case 5:
                                typeStr = "团购";
                                break;
                        }
                        return typeStr;
                    }}
                ,{field: 'createTime', title: '时间', width:"60%", sort: true}
            ]]
        });
    }
});


