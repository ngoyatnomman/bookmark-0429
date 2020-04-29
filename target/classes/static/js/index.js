pageNum = 1;
pages = 1;
categoryId = 0;

function firstPage(){
    if (pageNum > 1){
        pageNum = 1;
        loadData();
    }
}

function lastPage(){
    if(pageNum < pages){
        pageNum = pages;
        loadData();
    }
}

function prevPage(){
    if(pageNum > 1){
        pageNum--;
        loadData();
    }
}

function nextPage(){
    if(pageNum < pages){
        pageNum++;
        loadData();
    }
}

function deleteBookMark(now) {
    var flag = confirm('确认删除？');
    if(flag){
        $.get('/BookMark/deleteById.do','id='+$(now).attr('data-id'),function () {
            loadData();
        })
    }
}

function changeCategory(now) {
    var id = $(now).prev('input').attr('data-id');
    var categoryId = $(now).val();
    $.get('/BookMark/changeCategoryById.do',{id:id,categoryId:categoryId},function () {

    })
}

function selectByCategory(now) {
    categoryId = $(now).val();
    pageNum = 1;
    loadData();
}

function loadData(){
    $.get('/BookMark/getAllBookMarks.do',{pageNum:pageNum,categoryId: categoryId},function (data) {
        $('.row ul').empty();
        var str = '';
        $(data.list).each(function (i, item) {
            str += `<li>
                                <a href="${item.url}" target="_blank" title="${item.name}"><img src="icons/${item.icon}" alt=""></a>
                                <a href="${item.url}" target="_blank" title="${item.name}">`+item.name+`</a>
                                <input type="button" value="删除" onclick="deleteBookMark(this)" data-id="${item.id}">
                                <select name="" id="" data-id="${item.categoryId}" onchange="changeCategory(this)">
                                    <option value="0">全部</option>
                                 </select>
                            </li>`
        });
        $('.row ul').append(str);
        $.get('/BookMark/getAllCategories.do',function (data) {
            var str = '';
            $(data).each(function (i,item) {
                str += `<option value="${item.id}">${item.category}</option>`
            });
            $('.row ul li select').append(str);
            $('.row ul li select').each(function (i,item) {
                $(item).val($(item).attr('data-id'));
            })
        });
        $('.categoryPage ul li:first-of-type span:first-of-type').html(data.pageNum);
        $('.categoryPage ul li:first-of-type span:last-of-type').html(data.pages);
        $('.categoryPage ul li:last-of-type span').html(data.total);
        pages = data.pages;
    });
}

$(function () {


    loadData(1);

    $.get('/BookMark/getAllCategories.do',function (data) {
        var str = '';
        $(data).each(function (i,item) {
            str += `<option value="${item.id}">${item.category}</option>`
        });
        $('.conditions select').append(str);
    })

    $('.row ul').on('mouseover mouseout', 'li',function (e) {
        if(e.type=="mouseover"){
            $(this).find('input').toggle();
            $(this).find('select').toggle();
        }else if(e.type=="mouseout"){
            $(this).find('input').toggle();
            $(this).find('select').toggle();
        }
    })
})