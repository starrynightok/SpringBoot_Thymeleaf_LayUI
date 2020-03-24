function action(actionName, type){
    $.post({
        url: "/" + actionName + "?type=" + type,
        dataType: "json",

        success: function(data, status, xhr){
            if(data){
                $("#Num" + type).text(data.data);
            }
        }
    });
}