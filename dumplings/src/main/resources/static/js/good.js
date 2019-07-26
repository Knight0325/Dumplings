function add() {
    reset();
    $.get("/brands/show",function (result) {
        if(result.resultCode == 200&&result.data!=null){
            console.log("Coming!");
            $.each(result.data,function(index,element){
                console.log(index,element.name);
                $("#brandId").append('<option value="' + element.id + '">' + element.name + '</option>');
            });
        }
    });
    $.get("/tastes/show",function(result){
        if(result.resultCode==200&&result.data!=null){
            $.each(result.data,function (index,element) {
                $("#tasteId").append('<option value="' + element.id + '">' + element.name + '</option>')
            });
        }
    });
    var custombox = new Custombox.modal({
        content: {
            effect: 'slide',
            target: '#custombox-add'
        }
    });
    custombox.open();
}

$("#addButton").click(function () {
    var brand = $("#brandId").val();
    var taste = $("#tasteId").val();
    var weight = $("#weight").val();
    var price = $("#price").val();
    var stock = $("#stock").val();
    var endDate = $("#endDate").val();
    var hotPoint = $("#hotPoint").val();
    var path = $("#path").val();
    validObject();
    var data = {"brandId":brand,"tasteId":taste,"weight":weight,"price":price,"stock":stock,"endDate":endDate,"hotPoint":hotPoint,"status":1,"path":path};
    $.ajax({
        type:"POST",
        dataType: "json",//预期服务器返回的数据类型
        url:"/dumplings/add",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(data),
        success:function (result) {
            if(result.resultCode==200){
                $('#custombox-add').modal('hide');
                $('.alert-danger').css("display", "none");
                swal('添加成功！点击商品列表查看', {
                    icon: "success"
                });
            }
            if(result.resultCode==406){
                showErrorInfo("参数列表错误");
                return;
            }
            if (result.resultCode == 500) {
                showErrorInfo("服务器错误！");
                return;
            }
        },
        error: function () {
            $('.alert-danger').css("display", "none");
            showErrorInfo("接口异常，请联系管理员！");
            return;
        }
    });
});

new AjaxUpload("#upload",{
    action: '/upload/toNginx',
    name: 'file',
    autoSubmit: true,
    responseType: "json",
    onSubmit: function (file, extension) {
        if (!(extension && /^(jpg|jpeg|png|gif)$/.test(extension.toLowerCase()))) {
            swal('只支持jpg、png、gif格式的文件！', {
                icon: "error",
            });
            return false;
        }
    },
    onComplete: function (file, r) {
        if (r.resultCode == 200) {
            swal("上传成功", {
                icon: "success",
            });
            console.log("img====>"+r.data);
            $("#path").val(r.data);
            $("#img").attr({"src": r.data,
                "style":"width: 90px;height: 90px;display:block;"
            });
            return false;
        } else {
            swal(r.message, {
                icon: "error"
            });
        }
    }
});

function reset(){
    //隐藏错误提示框
    $('.alert-danger').css("display", "none");
    //清空数据
    $('#brandId').empty();
    $('#tasteId').empty();
    $('#weight').val(0);
    $('#price').val(0);
    $('#stock').val(0);
    $('#hotPoint').val('');
    $('#path').val('');
}

/**
 * 数据验证
 */
function validObject() {
    var brand = $("#brandId").val();
    var taste = $("#tasteId").val();
    var weight = $("#weight").val();
    var price = $("#price").val();
    var stock = $("#stock").val();
    var hotPoint = $("#hotPoint").val();
    var path = $("#path").val();
    if(brand==null||taste==null||weight==null||price==null||stock==null||hotPoint==null||path==null
        ||weight<1||price<1||hotPoint.length<1){
        showErrorInfo("请认真检查，重新填写！");
        return false;
    }
    return true;
}
//显示错误信息
function showErrorInfo(info) {
    $('.alert-danger').css("display", "block");
    $('.alert-danger').html(info);
}
//关闭模态框
function close(){
    var custombox = new Custombox.modal({
        content: {
            effect: 'slide',
            target: '#custombox-add'
        }
    });
    custombox.close();
}